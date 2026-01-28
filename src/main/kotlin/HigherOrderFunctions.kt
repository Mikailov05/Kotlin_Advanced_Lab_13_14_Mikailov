fun main() {
    val action1 = selectAction(key = 1)
    println(action1(8,5)) // 13


    val action2 = selectAction(key = 2)
    println(action2(8,5)) // 3
}

fun displayMessage(mes: () -> Unit){
    mes()
}

fun morning(){
    println("Good Morning")
}

fun evening(){
    println("Good Evening")
}
fun selectAction(key: Int): (Int, Int) -> Int {
    // определение возвращаемого результата
    return when(key) {
        1 -> ::sum
        2 -> ::subtract
        3 -> ::multiply
        else -> ::empty
    }
}

fun empty (a: Int, b: Int): Int{
    return 0
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun subtract(a: Int, b: Int): Int{
    return a - b
}

fun multiply(a: Int, b: Int): Int{
    return a * b
}
