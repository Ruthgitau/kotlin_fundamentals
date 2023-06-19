class parentClass {
    private var name:String=""

    class nestedclass{
        var describe="code inside a nested class"
        private var id:Int=200

        fun nestedoutput(){
            println("ID is $id")
        }
    }
}

fun main(){
    println(parentClass.nestedclass().describe)
    var object1=parentClass.nestedclass()
    println(object1.nestedoutput())

}