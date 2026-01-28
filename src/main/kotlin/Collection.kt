val  rockPlanets = arrayOf<String>("Mercury", "Venus" , "Earth","Mars")
val gasPlanets = arrayOf("Jupiter","Saturn", "Uranus", "Neptune")
val solarSystem = rockPlanets + gasPlanets

fun main() {
    solarSystem[3] = "Little Earth"
    println(solarSystem[3])
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])



}
val newSolarSystem = mutableListOf(
    "Mercury" to 0,
    "Venus" to 0,
    "Earth" to 1,
    "Mars" to 2,
    "Jupiter" to 79,
    "Saturn" to 82,
    "Uranus" to 27,
    "Neptune" to 14,

)

