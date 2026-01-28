class Library<T> {
    private val items = mutableListOf<T>()
    fun addItem(item: T) {
        items.add(item)
    }
    fun getAllItems(): List<T> = items.toList()
}