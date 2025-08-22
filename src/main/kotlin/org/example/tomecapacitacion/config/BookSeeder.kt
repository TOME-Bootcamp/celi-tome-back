package org.example.tomecapacitacion.config

import org.example.tomecapacitacion.book.Book
import org.example.tomecapacitacion.book.BookRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Component
import java.time.LocalDate
@Component
class BookSeeder(
    private val bookRepository: BookRepository
) : CommandLineRunner {

    override fun run(vararg args: String?) {
        if (bookRepository.count() > 0) {
            return
        }

        var insertedCount = 0

        val books = listOf(
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
                title = "The Return of the King",
                isbn = "9780261102378",
                releaseDate = LocalDate.of(1955, 10, 20),
                pages = 432,
                coverUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1634055544i/727810.jpg",
                synopsis = "The third and final volume of The Lord of the Rings, the greatest fantasy epic of our time, which began in The Fellowship of the Ring and The Two Towers.",
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
                title = "And Every Morning the Way Home Gets Longer and Longer",
                isbn = "9781501160578",
                releaseDate = LocalDate.of(2015, 8, 24),
                pages = 97,
                coverUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1472074835i/31373633.jpg",
                synopsis = "From the New York Times bestselling author of A Man Called Ove, My Grandmother Asked Me to Tell You She's Sorry, and Britt-Marie Was Here comes an exquisitely moving portrait of an elderly man's struggle to hold on to his most precious memories.",
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
                title = "Dune Messiah",
                isbn = "9780593098233",
                releaseDate = LocalDate.of(1969, 7, 1),
                pages = 336,
                coverUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1577043824i/44492285.jpg",
                synopsis = "Dune Messiah continues the story of Paul Atreides, better known--and feared--as the man christened Muad'Dib. As Emperor of the Known Universe, he possesses more power than a single man was ever meant to wield.",
                language = "ENGLISH",
                publisher = "Ace",
                author = "Frank Herbert",
                tags = setOf("Science Fiction", "Fiction", "Fantasy", "Science Fiction Fantasy", "Classics", "Novels", "Adventure", "Book Club", "Adult")
            ),
            Book(
                title = "Children of Dune",
                isbn = "9780593098240",
                releaseDate = LocalDate.of(1976, 4, 1),
                pages = 609,
                coverUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1564783201i/44492286.jpg",
                synopsis = "The Children of Dune are twin siblings Leto and Ghanima Atreides, whose father, the Emperor Paul Muad'Dib, disappeared in the desert wastelands of Arrakis nine years ago.",
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
            ),
            Book(
                title = "The Sunlit Man",
                isbn = "9781938570391",
                releaseDate = LocalDate.of(2023, 10, 1),
                pages = 447,
                coverUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1696146860i/60531420.jpg",
                synopsis = "Running. Putting distance between himself and the relentless Night Brigade has been Nomad's strategy for years. Staying one or two steps ahead of his pursuers by skipping through the Cosmere from one world to the next.",
                language = "ENGLISH",
                publisher = "Dragonsteel Entertainment",
                author = "Brandon Sanderson",
                tags = setOf("Fantasy", "Fiction", "Romance", "Book Club", "Adventure", "High Fantasy", "Adult")
            )
        )

        books.forEach { book ->
            bookRepository.save(book)
            insertedCount++
        }
    }
}
