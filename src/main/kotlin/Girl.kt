class Girl :person(20, "lynn"){


    override fun displayage(age: Int) {
        println("My fake age is ${age-5}.")

    }
}
fun main (args:Array<String>){
    val girl=Girl()
    girl.displayage(31)
}