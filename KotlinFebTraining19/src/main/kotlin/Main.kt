import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking{
    val myString = async { someString() }
    val myJob = launch { createCoroutines() }
    println()
    println("------")
    println()
    for(x in 1..10){
        print("$x-x ")
    }
    myJob.join()
    println()
    println(myString.await())
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
suspend fun someString(): String{
    delay(7000)
    return "String isReady!"
}