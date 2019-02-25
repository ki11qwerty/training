import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Here we go")
    i = 0
    launch { breakingFun()  }
    for(x in 0..10) {
        println("for in main $x")
    }
    launch { getBoolean() }
    println("end main")
}
suspend fun someFun(){
   println("start someFun")
    for (x in 0..10){
        println("$x in someFun")
        delay(10)
    }
    print("-end someFun-")
}
fun breakingFun() = runBlocking {
    println("starting breakingFun")
    val jobs = List(10){
        launch{
            delay(1)
            i += 1
            someFun()
            print("№$it-coroutine")
        }
    }
    println("--------------------------")
    jobs.forEach{ it.join()}
    println("starting myJobs2")
    val myJobs2 = List(20) {
        launch {
            delay(10)
            print(" $it in jobs2")
        }
    }
    myJobs2.forEach { it.join() }
}
suspend fun returnTrue(): Boolean {
    delay(1000)
    return true
}
suspend fun returnFalse(): Boolean{
    delay(1000)
    return false
}
fun getBoolean() = runBlocking {
    val jobs3 = List(3) {
        launch {
            println("${returnFalse()} ${returnTrue()}")
        }
    }
    println("in end of getBoolean()")
}


var i = 0

