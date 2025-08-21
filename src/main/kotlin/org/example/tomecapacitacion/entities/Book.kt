package org.example.tomecapacitacion.entities

import jakarta.persistence.CollectionTable
import jakarta.persistence.Column
import jakarta.persistence.ElementCollection
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.Table
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "books")
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val title: String,

    @Column(unique = true, nullable = false)
    val isbn: String,

    @Column(name = "release_date", nullable = false)
    val releaseDate: LocalDate,

    @Column(nullable = false)
    val pages: Int,

    @Column(name = "cover_url", nullable = false, length = 500)
    val coverUrl: String,

    @Column(nullable = false, columnDefinition = "TEXT")
    val synopsis: String,

    @Column(nullable = false)
    val language: String,

    @Column(nullable = false)
    val publisher: String,

    @Column(nullable = false)
    val author: String,

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "book_tags", joinColumns = [JoinColumn(name = "book_id")])
    @Column(name = "tag")
    val tags: Set<String> = emptySet(),

    @Column(name = "created_at", nullable = false)
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at", nullable = false)
    val updatedAt: LocalDateTime = LocalDateTime.now()
)
