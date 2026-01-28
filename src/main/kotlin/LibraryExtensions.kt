fun List<LibraryItem>.filterByYear(year: Int): List<Book> {
    return this.filterIsInstance<LibraryItem.BookItem>()
        .map { it.book }
        .filter { it.year == year }
}
fun List<LibraryItem>.sortByTitle(): List<LibraryItem> {
    return this.sortedBy {

        when (it) {
            is LibraryItem.BookItem -> it.book.title
            is LibraryItem.MagazineItem -> it.magazine.title
            is LibraryItem.DVDItem -> it.dvd.title
        }
    }
}
fun List<LibraryItem>.groupByAuthor(): Map<String, List<Book>> {
    return this.filterIsInstance<LibraryItem.BookItem>()
        .map { it.book }
        .groupBy { it.author }
}

fun List<LibraryItem>.calculateTotalDuration(): Int {
    return this.filterIsInstance<LibraryItem.DVDItem>()
        .sumOf { it.dvd.duration }
}