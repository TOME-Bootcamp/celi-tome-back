package org.example.tomecapacitacion.services

import jakarta.transaction.Transactional
import org.example.tomecapacitacion.entities.Book
import org.example.tomecapacitacion.repositories.BookRepository
import org.springframework.stereotype.Service

import org.slf4j.LoggerFactory

@Service
class BookService (private val bookRepository: BookRepository){

    private val logger = LoggerFactory.getLogger(BookService::class.java)

    @Transactional
    fun seedBooks(books: List<Book>): SeedResult {
        var insertedCount = 0
        var skippedCount = 0

        books.forEach { book ->
            if (bookRepository.existsByIsbn(book.isbn)) {
                logger.info("⏭️ Libro saltado (ya existe): ${book.title}")
                skippedCount++
            } else {
                bookRepository.save(book)
                logger.info("✅ Libro insertado: ${book.title}")
                insertedCount++
            }
        }

        val result = SeedResult(insertedCount, skippedCount)
        logger.info("📊 Resultado del seeding: $result")
        return result
    }

    @Transactional
    fun clearAllBooks(): Int {
        val count = bookRepository.count().toInt()
        bookRepository.deleteAll()
        logger.info("🗑️ $count libros eliminados de la base de datos")
        return count
    }

    fun findByIsbn(isbn: String): Book? = bookRepository.findByIsbn(isbn).orElse(null)

    fun findAll(): List<Book> = bookRepository.findAll()

    fun count(): Long = bookRepository.count()
}

data class SeedResult(
    val inserted: Int,
    val skipped: Int
) {
    val total: Int get() = inserted + skipped

}
