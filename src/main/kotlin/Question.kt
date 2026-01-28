data class  Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
fun main() {
    Quiz.printProgressBar()
    val quiz = Quiz()
    quiz.printQuiz()
    val quiz = Quiz().apply { printQuiz() }
}
enum class Difficult{
    EASY,
    MEDIUM,
    HARD
}
interface ProgressPrintable{
    val progressText: String
    fun printProgressBar()
}


    class Quiz:ProgressPrintable{


    val question1 = Question<String>(
        questionText = "Речка спятила с ума – По домам пошла сама. ___",
        answer = "водопровод",
        Difficulty.MEDIUM
    )

    val question2 = Question<Boolean>(
        questionText = "Небо зелёное. Правда или ложь",
        answer = false,
        Difficulty.EASY
    )

    val question3 = Question<Int>(
        questionText = "Сколько дней между полнолуниями?",
        answer = 28,
        Difficulty.HARD
    )
    companion object StudentProgress{
        var total: Int = 10
        var answered:Int = 3
    }
    val Quiz.StudentProgress.progressText: String
        get() = "${answered} of ${total} answered"

        fun printQuiz() {
            question1.let {
                println(question1.questionText)
                println(question1.answer)
                println(question1.difficulty)
            }
            println()
            question2.let {
                println(question2.questionText)
                println(question2.answer)
                println(question2.difficulty)
            }
            println()
            question3.let {
                println(question3.questionText)
                println(question3.answer)
                println(question3.difficulty)
            }
            println()
        }

}
fun Quiz.StudentProgress.printProgressBar(){


    repeat(times = Quiz.answered) {print(" ")}
    repeat(times = Quiz.total - Quiz.answered) {print(" ")}
    println()
    println(Quiz.progressText)
}