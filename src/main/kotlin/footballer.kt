class footballer(age:Int, name:String):person(age,name){
    fun playfootball(){
        println("I play for LA Galaxy.")
    }
}

fun main(args:Array<String>){
    val t1=mathteacher(25,"Jack")
    t1.teachmaths()
    println()

    val f1=footballer(29, "Christiano")
    f1.playfootball()
}
