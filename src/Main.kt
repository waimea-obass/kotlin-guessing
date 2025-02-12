/**
 * A little guessing game in Kotlin
 */


fun main() {
    println("------------------------")
    println("Guessing game")
    println("------------------------")
    println()


    val numToGuess = (1..100).random()
    var guessCounter = 0

    println("I'm thinking of a number from 1 to 100 (Yes I, this computer can think)")
    println("Can you guess it?")
    println("Enter your name: ")
    val name = readlnOrNull()

    // Main Loop
    while (true) {
        //Ask the user for a guess
        print("Enter your guess:  ")
        val number = readln().toIntOrNull()
        //Check if it's correct or not
        //If they don't enter a valid number
        if (number == null) {
            println("That's not a number")
        }
        // Gives higher/lower feedback to user
        else if (number > numToGuess) {
            println("Lower")
            guessCounter++
        }
        else if (number < numToGuess) {
            println("Higher")
            guessCounter++
        }

        //If they get it correct, the loop breaks
        if (number == numToGuess) {
            println("Good Job $name! You guessed it in $guessCounter guesses!")

            println("Thank you for playing!")
            break
        }
        else if (guessCounter == 10) {
            println("You have ran out of guesses $name")
            println("The correct number was $numToGuess")
            break
        }



    }
}
//            when (guessCounter) {
//                0 - 3 -> println("You're really good at this")
//                4 - 6 -> println("You're ok at this")
//                7 - 10 -> println("You're not great at this")
//            }