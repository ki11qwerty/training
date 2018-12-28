abstract class Animals(val name: String,val stamina:Int){
    abstract fun voice()
    abstract fun run(distance:Int)
    abstract fun sleep(time:Int)
}