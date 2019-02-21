import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.*
fun main(args: Array<String>){ = runBlocking<Unit>{
    print("something")
//    val jobs = List(100000){
//        launch(this){
//            delay(100L)
//            print(".")
//        }
//    }
//    jobs.forEach{ it.join()}
launch
}

suspend fun <T> runBlocking(any: Any): T {
    var some = async
    launch(CoroutineScope(CoroutineContext)){
        suspendCoroutine<String> { return "sasa" }
    }
}

}
