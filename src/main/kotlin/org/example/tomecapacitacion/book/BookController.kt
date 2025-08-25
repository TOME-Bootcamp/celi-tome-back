package org.example.tomecapacitacion.book

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.CrossOrigin

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = ["http://localhost:3000"])
class BookController(private val bookService: BookService) {

    @GetMapping
    fun getAllBooks(): List<Book> {
        return bookService.getAllBooks()
    }

    @GetMapping("/cards")
    fun getAllBooksCards(): List<BookDTO> {
        return bookService.getAllBooksDTO()
    }
}
