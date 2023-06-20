//----INHERITANCE-----
/*a process where one class acquires the members of another class
*
* */
open class person(age:Int,name:String){
    init {
        println("my name is $name .")
        println("My age is $age .")
    }

    open fun displayage(age:Int){
        println("My official is $age")
    }

}
