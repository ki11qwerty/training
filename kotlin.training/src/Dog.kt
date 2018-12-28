class Dog(name:String,stamina:Int) : Animals(name,stamina){
    override fun voice(){
        println("$name say woof")
    }

    override fun run(distance: Int) {
        if (distance > stamina){
            println("$name don't finish, done only $stamina of $distance ")
        }
        else if(distance <= stamina)
            println("$name run $distance m")
    }
    override fun sleep(time:Int){
        println("$name is sleep $time min")
    }
}