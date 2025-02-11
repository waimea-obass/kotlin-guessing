/**
 * A little guessing game in Kotlin
 */


fun main() {
    println("------------------------")
    println("Guessing game")
    println("------------------------")
    println()

    val numToGuess = (1..100).random()

    println("I'm thinking of a number from 1 to 100 (Yes I, this computer can think)")
    println("Can you guess it?)")

    // Main Loop
    while (true) {
        //Ask the user for a guess
        print("Enter your guess:  ")
        val number = readln().toIntOrNull()
        //Check if it's correct or not
        if (numToGuess)
        //Otherwise give high/low feedback


    }
}