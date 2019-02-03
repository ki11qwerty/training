import java.util.*
import kotlin.IllegalArgumentException
fun main(args : Array<String>) {

    randomThis()
    somethingInt = 1000
    println("$somethingInt")

}
fun randomThis() {
        println(somethingInt)
}
var somethingInt = try{
    val random = Random()
    val someInt= random.nextInt(1000)
    if(someInt %2 == 0){
        someInt
    }else{
        throw IllegalArgumentException()
    }
}catch (e:IllegalArgumentException){
    println("IllegalArg")
    -1
}