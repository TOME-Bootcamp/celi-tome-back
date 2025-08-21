package org.example.tomecapacitacion.config

import org.example.tomecapacitacion.services.BookService
import org.slf4j.LoggerFactory
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
class DataSeeder(private val bookService: BookService) {

    private val logger = LoggerFactory.getLogger(DataSeeder::class.java)

    @EventListener(ApplicationReadyEvent::class)
    @Order(1)
    fun seedDatabase() {
        if (shouldSeedData()) {
            logger.info("🌱 Iniciando seeding de libros...")

            val books = BookSeedData.getSeedBooks()
            val result = bookService.seedBooks(books)

            logger.info("🎉 Seeding completado: ${result.inserted} insertados, ${result.skippedCount} saltados")
        } else {
            logger.info("📚 Base de datos ya contiene libros, saltando seeding")
        }
    }

    private fun shouldSeedData(): Boolean {
        val currentCount = bookService.count()
        return currentCount == 0L
    }
}
