fun main() {
    val book1 = Book("1984", "George Orwell", 1949, "12345")
    val book2 = Book("Master and Margarita", "Mikhail Bulgakov", 1966, "67890")
    val book3 = Book("Animal Farm", "George Orwell", 1945, "13579")
    val magazine1 = Magazine("National Geographic", 255, "March")
    val dvd1 = DVD("Inception", "Christopher Nolan", 148)
    val items = listOf(
        LibraryItem.BookItem(book1),
        LibraryItem.BookItem(book2),
        LibraryItem.BookItem(book3),
        LibraryItem.MagazineItem(magazine1),
        LibraryItem.DVDItem(dvd1)
    )

    val library = Library<LibraryItem>()
    items.forEach { library.addItem(it) }

    println("=== Все книги 1949 года ===")
    val books1949 = library.getAllItems().filterByYear(1949)
    books1949.forEach { println("- ${it.title}") }

    println("\n=== Все элементы, отсортированные по названию ===")
    val sortedItems = library.getAllItems().sortByTitle()
    sortedItems.forEach {
        val title = when (it) {
            is LibraryItem.BookItem -> it.book.title
            is LibraryItem.MagazineItem -> it.magazine.title
            is LibraryItem.DVDItem -> it.dvd.title
        }
        println("- $title")
    }

    println("\n=== Книги сгруппированные по автору ===")
    val booksByAuthor = library.getAllItems().groupByAuthor()
    booksByAuthor.forEach { (author, books) ->
        println("Автор: $author")
        books.forEach { println("  - ${it.title} (${it.year})") }
    }

    println("\n=== Общая продолжительность всех DVD ===")
    val totalDuration = library.getAllItems().calculateTotalDuration()
    println("Всего минут: $totalDuration")
}