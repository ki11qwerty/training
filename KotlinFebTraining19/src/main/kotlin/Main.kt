import kotlinx.coroutines.*

fun main(args: Array<String>) {
    val myHardJob = GlobalScope.async {createString()}
    val myScope = GlobalScope.launch{
        delay(500)
        print("World!")
    }
    print("Hello, ")
    runBlocking { myScope.join() }
    print("\n its a ")
    runBlocking {
        delay(500)
        print("Coroutine\n" ) }
    runBlocking {
        for(x in 1..10){
        for (y in 0..2){
            delay(250)
            print("_")}
            print("${x}\n")
           }
    }
    println("--------------------end----------------------")
    runBlocking {  print(myHardJob.await() +"\n its await = 5second in GlobalScope\n") }
    val newString = GlobalScope.async {createString()}
    runBlocking { print(newString.await() + "\nand this is too but create late") }
}
suspend fun createString() : String{
    var myString = ""
    for (x in 0..50){
        delay(100)
        myString += "$x "
    }
    return myString
}