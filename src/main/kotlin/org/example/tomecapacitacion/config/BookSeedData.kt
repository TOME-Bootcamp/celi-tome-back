package org.example.tomecapacitacion.config

import org.example.tomecapacitacion.entities.Book
import java.time.LocalDate

object BookSeedData {

    fun getSeedBooks(): List<Book> = listOf(
        Book(
            title = "The Fellowship of the Ring",
            isbn = "9780547928210",
            releaseDate = LocalDate.of(1954, 7, 29),
            pages = 407,
            coverUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1651340688i/727798.jpg",
            synopsis = "The first volume in J.R.R. Tolkien's epic adventure THE LORD OF THE RINGS. One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkness bind them. In ancient times the Rings of Power were crafted by the Elven-smiths, and Sauron, the Dark Lord, forged the One Ring, filling it with his own power so that he could rule all others.",
            language = "ENGLISH",
            publisher = "William Morrow",
            author = "J.R.R Tolkien",
            tags = setOf("Fantasy", "Classics", "Fiction", "Adventure", "High Fantasy", "Epic Fantasy", "Science Fiction Fantasy", "Novels")
        ),
        Book(
            title = "The Two Towers",
            isbn = "9780261102361",
            releaseDate = LocalDate.of(1954, 11, 11),
            pages = 448,
            coverUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1629308732i/727800.jpg",
            synopsis = "Begin your journey into Middle-earth. The inspiration for the upcoming original series on Prime Video, The Lord of the Rings: The Rings of Power. The Two Towers is the second part of J.R.R. Tolkien's epic adventure The Lord of the Rings.",
            language = "ENGLISH",
            publisher = "William Morrow",
            author = "J.R.R Tolkien",
            tags = setOf("Fantasy", "Classics", "Fiction", "Adventure", "High Fantasy", "Epic Fantasy", "Science Fiction Fantasy", "Novels")
        ),
        Book(
            title = "My Friends",
            isbn = "9781982112820",
            releaseDate = LocalDate.of(2025, 5, 6),
            pages = 436,
            coverUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1734625930i/217163697.jpg",
            synopsis = "The world is full of miracles, but none greater than how far a young person can be carried by someone else's belief in them. Most people don't even notice them—three tiny figures sitting at the end of a long pier in the corner of one of the most famous paintings in the world.",
            language = "ENGLISH",
            publisher = "Atria Books",
            author = "Fredrik Backman",
            tags = setOf("Fiction", "Contemporary", "Literary Fiction", "Book Club", "Adult", "Summer", "Friendship", "Adult Fiction")
        ),
        Book(
            title = "Beartown",
            isbn = "9781501160769",
            releaseDate = LocalDate.of(2017, 4, 25),
            pages = 418,
            coverUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1525349525i/31443394.jpg",
            synopsis = "People say Beartown is finished. A tiny community nestled deep in the forest, it is slowly losing ground to the ever-encroaching trees. But down by the lake stands an old ice rink, built generations ago by the working men who founded town.",
            language = "ENGLISH",
            publisher = "Atria Books",
            author = "Fredrik Backman",
            tags = setOf("Fiction", "Contemporary", "Literary Fiction", "Book Club", "Adult", "Summer", "Friendship", "Adult Fiction")
        ),
        Book(
            title = "Dune",
            isbn = "9780593099322",
            releaseDate = LocalDate.of(1965, 6, 1),
            pages = 658,
            coverUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1555447414i/44767458.jpg",
            synopsis = "Set on the desert planet Arrakis, Dune is the story of the boy Paul Atreides, heir to a noble family tasked with ruling an inhospitable world where the only thing of value is the spice melange, a drug capable of extending life and enhancing consciousness.",
            language = "ENGLISH",
            publisher = "Ace",
            author = "Frank Herbert",
            tags = setOf("Science Fiction", "Fiction", "Fantasy", "Science Fiction Fantasy", "Classics", "Novels", "Adventure", "Book Club", "Adult")
        ),
        Book(
            title = "Tress of the Emerald Sea",
            isbn = "9781638570424",
            releaseDate = LocalDate.of(2023, 1, 10),
            pages = 443,
            coverUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1672574587i/60531406.jpg",
            synopsis = "The only life Tress has known on her island home in an emerald-green ocean has been a simple one, with the simple pleasures of collecting cups brought by sailors from faraway lands and listening to stories told by her friend Charlie.",
            language = "ENGLISH",
            publisher = "Dragonsteel Entertainment",
            author = "Brandon Sanderson",
            tags = setOf("Fantasy", "Fiction", "Romance", "Book Club", "Adventure", "High Fantasy", "Adult")
        ),
        Book(
            title = "Yumi and the Nightmare Painter",
            isbn = "9781938570377",
            releaseDate = LocalDate.of(2023, 7, 1),
            pages = 480,
            coverUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1689135481i/60531416.jpg",
            synopsis = "Yumi comes from a land of gardens, meditation, and spirits, while Painter lives in a world of darkness, technology, and nightmares. When their lives suddenly become intertwined in strange ways, can they put aside their differences and work together?",
            language = "ENGLISH",
            publisher = "Dragonsteel Entertainment",
            author = "Brandon Sanderson",
            tags = setOf("Fantasy", "Fiction", "Romance", "Book Club", "Adventure", "High Fantasy", "Adult")
        )
    )

}
