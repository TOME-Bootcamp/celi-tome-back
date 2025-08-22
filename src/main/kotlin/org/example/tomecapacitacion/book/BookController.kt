package org.example.tomecapacitacion.book

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/books")
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
