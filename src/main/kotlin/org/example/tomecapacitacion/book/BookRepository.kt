package org.example.tomecapacitacion.book

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface BookRepository : JpaRepository<Book, Long> {

    fun findByIsbn(isbn: String): Optional<Book>

    fun existsByIsbn(isbn: String): Boolean

    @Query("SELECT b FROM Book b WHERE b.author LIKE %:author%")
    fun findByAuthorContaining(author: String): List<Book>

    @Query("SELECT b FROM Book b JOIN b.tags t WHERE t IN :tags")
    fun findByTagsIn(tags: Set<String>): List<Book>


}
