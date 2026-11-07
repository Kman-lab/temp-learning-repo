fun main () {
    val secret = 3
    println ("guess the number:")
    val guess = readln().toInt()
    if(guess == secret) {
        println("you win")
    if(guess > secret) {
        println("too high")
    } else if(guess < secret) {
        println("too high")
    }
    } else {
        println("too low")
    }
}


