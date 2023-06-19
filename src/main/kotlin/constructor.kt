/*
---Constructors----
A block of code similar to  a function or method
A constructor is declared in the same name as the same as a class followed by parenthesis()
Used to initialise variables at the time of object creation
there are two types of constructors:
        primary constructors
        secondary constructors

* */
class myclass(val name:String, var id:Int) { //primary constructor

    class myclass { //secondary constructor
        constructor(id: Int) {
            println(id)

        }

        constructor(name: String) {
            println(name)
        }
    }
}





fun main(){
    var mtu=myclass("Ruth", 4673457)
    println(mtu.name)
    println(mtu.id)

    var sec_obj=myclass("joy",7580)

}
