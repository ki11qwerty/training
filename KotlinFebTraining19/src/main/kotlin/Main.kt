import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking{
    launch { createCoroutines() }
    println()
    println("------")
    println()
    for(x in 1..10){
        print("$x-x ")
    }
}

fun createCoroutines() = runBlocking{
    launch {
        secondCoroutines()
    }
    launch {
        delay(5000)
        println()
        println("------")
        println()
        for (z in 1..10) {
            print("$z-z ")
        }
    }
}
suspend fun secondCoroutines(){
    delay(4000)
    println()
    println("------")
    println()
    for(y in 1..10){
        print("$y-y ")
    }
}