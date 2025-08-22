package org.example.tomecapacitacion.book

import org.springframework.stereotype.Service

@Service
class BookService (private val bookRepository: BookRepository) {
    fun getAllBooks(): List<Book> = bookRepository.findAll()

    fun getAllBooksDTO(): List<BookDTO> {
        return bookRepository.findAll().map { book ->
            BookDTO(
                id = book.id,
                title = book.title,
                author = book.author,
                coverUrl = book.coverUrl
            )
        }
    }

}
