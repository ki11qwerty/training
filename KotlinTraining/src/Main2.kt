import java.util.*
import kotlin.math.min

class SomethingClass( var name : String, var number : Int){
    fun printIt() = println("$name, $number")
}
fun main(args : Array<String>) {
    println("something")
    var some = SomethingClass("name" , 42)
    some.printIt()

    val firstArr = arrayOf(5,6,7,8,9)
    var secondArr = arrayOf(1,2,3,4,10,11,12,13)
    println("size of sexondArr ${secondArr.size}")
    for(x in secondArr) print("$x ")

    println(); println("------------")

    secondArr = arrayOf(1,2,3,4, *firstArr,10,11,12,13)
    println("size of sexondArr ${secondArr.size}")
    for(x in secondArr) print("$x ")
    println()
}