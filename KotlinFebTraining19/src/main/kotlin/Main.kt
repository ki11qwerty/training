import kotlinx.coroutines.*
fun main(args: Array<String>) {
    println("and we go")
    i = 0
    breakingFun()
    for(x in 0..10) {
        i =+ x
        println(i)
    }
    println("дайте шума")
}
suspend fun someFun(){
   println("someFun")
    for (x in 0..10){
        println("$x")
        delay(10)
    }
    print("-end someFun-")
}
fun breakingFun() = runBlocking {
    println("breakingFun")
    val jobs = List(10){
        launch{
            delay(1)
            i += 1
            someFun()
            print("№$it-coroutine")
        }
    }
    println("--------------------------")
    //jobs.forEach{ it.join()}
    println("\n \n йебой")
}

var i = 0

