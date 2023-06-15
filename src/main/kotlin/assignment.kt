fun main() {

    for (i in 1..3) {
        println("practice makes perfect")
    }
    repeat(3) {
        println("consistency")
    }
    //converting strings to uppercase
    var str = "lowercase to uppercase "
    println(str.uppercase())

    //converting strings to lowercase
    var x = "UPPERCASE TO LOWERCASE"
    println(x.lowercase())

    camelcase()
}

fun camelcase(): String {

    val input="first_name"
    val words=input.split(" ")
   val camelcasewords=words.mapIndexed { index, word ->
       if (index==0){
           word.toLowerCase()
       }
       else{
           word.capitalize()
       }

   }
    return camelcasewords.joinToString(" ")
}


//converting strings to camel case











