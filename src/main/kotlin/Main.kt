package org.example

fun main() {
    greeting("Aid", 2025)
    guessAge()
    countNumber()
    quiz()
}

fun greeting(name: String, year: Int) {
    println("Hello! My name is $name")
    println("I was created in $year")
    println("Please, remind me your name.")
    val userName = readln()
    println("What a great name you have, $userName!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5, and 7.")
    val r3 = readln().toInt()
    val r5 = readln().toInt()
    val r7 = readln().toInt()
    val userAge = (r3 * 70 + r5 * 21 + r7 * 15) % 105
    println("Your age is $userAge; that's a good time to start programming!")
}

fun countNumber() {
    println("Now I will prove to you that I can count to any number you want.")
    val number = readln().toInt()
    repeat(number + 1) {
        println("$it !")
    }
}

fun quiz() {
    val msg = "Please, try again."
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println(
        """
        1. To repeat a statement multiple times.
        2. To decompose a program into several small subroutines.
        3. To determine the execution time of a program.
        4. To interrupt the execution of a program.
    """.trimIndent()
    )
    while (true) {
        val answer = readln().toInt()
        when (answer) {
            1, 3, 4 -> println(msg)
            2 -> {
                println("Congratulations, have a nice day!")
                return
            }
            else -> println("Wrong input. please enter 1 to 4.")
        }
    }
}