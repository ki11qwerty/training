class Person(val name:String, val age: Int, val someInfo: String)

fun main(args : Array<String>) {
    val person1 = Person("Алексей",22,"информация отсутствует")
    val printAllFields:Person.()->Unit = {
        println("name: $name\nage: $age\nsomeInfo: $someInfo")
    }

    person1.printAllFields()
    val person2 = Person("Александр", 35, "SEO")
    person2.printAllFields()

    var list:MutableList<String> = mutableListOf()
    for(x in 1..10){
        list.add("some$x")
    }
    println("list$list")
    println("item5 in list: ${list[4]}")
    val readOnly:List<String> = list
    println("readOnly = $readOnly")

    var listInt:MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    println(listInt.filter { it % 2 == 0 })
    println(listInt)
    println(listInt.filter { it in 5..9 })
    println(listInt.filter { it in 9 downTo 3 step 3 })

    var myDog = Dog("tuzic",500)
    var myDog2 = Dog("sharik",750)
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

}