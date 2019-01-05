import java.util.*
//import kotlinx.coroutines.*

class Person(val name:String, val age: Int, val someInfo: String)

fun main(args : Array<String>) {
    val person1 = Person("Алексей", 22, "информация отсутствует")
    val printAllFields: Person.() -> Unit = {
        println("name: $name\nage: $age\nsomeInfo: $someInfo")
    }

    person1.printAllFields()
    val person2 = Person("Александр", 35, "SEO")
    person2.printAllFields()

    var list: MutableList<String> = mutableListOf()
    for (x in 1..10) {
        list.add("some$x")
    }
    println("list$list")
    println("item5 in list: ${list[4]}")
    val readOnly: List<String> = list
    println("readOnly = $readOnly")

    var listInt: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(listInt.filter { it % 2 == 0 })
    println(listInt)
    println(listInt.filter { it in 5..9 })
    println(listInt.filter { it in 9 downTo 3 step 3 })

    var myDog = Dog("tuzic", 500)
    var myDog2 = Dog("sharik", 750)
    myDog.run(450)
    myDog2.run(450)
    myDog.run(1000)
    myDog2.run(1000)
    myDog.voice()
    myDog2.voice()

    val text = """
         ----------------------------------------------------------------------------------------------------
                                               some text
                                         its 44 row in code
                                  tomorrow again I GO TO MY JOB XD
                    P.S. - How its Works???? WTF )))))))))))))))))))))))))))))))))))))
                    .∧＿∧
                    ( ･ω･｡)つ━☆・*。
                     ⊂　 ノ 　　　・゜+.
                     しーＪ　　　°。+ *´¨)
　　　　　　　　                 　.· ´¸.·*´¨) ¸.·*¨)
　　　　　　　                       　　　(¸.·´ (¸.·'*
         ----------------------------------------------------------------------------------------------------
        """
    println(text)
    //TODO: круто, ничего не скажешь... остановился на -> kotlin -> основы -> Операторы перехода
    // TODO: с такими темпами можно и за пару недель освоить основы я думаю)

    var rand = Random()
    loop@ for (x in 1..1000) {
        var randomInt: Int = rand.nextInt(100) + 1
        if (randomInt == 42) {
            println("okay its 42")
            break@loop
        }
        when (randomInt) {
            in 1..29 -> println(">0 this <30")
            in 30..60 -> println(">=30 this <=60")
            in 61..100 -> println(">60 this <=100")
            else -> {
                println("something Wrong =(")
            }
        }
    }
    //TODO:классы и наследование

//    //TODO: ну это пиздец какой то, пол дня проебаться с Грэдлом, потом пол дня вот с этой хуйней коррутины блять им. прям бомбанул
//    fun multi() {
//        repeat(100_000) {
//            launch {
//                delay(1000L)
//                print(".")
//            }
//        }
//    }

    var myClass = MyClass("name", 28)

    fun MyClass.info():String = "$name,$age - это сделано через расширение, прикольная штука однако"

    println(myClass.info())
            //TODO: классы, расширения, дата классы и тому подобное, учу доки пока что
}
class MyClass(var name:String, var age:Int)
