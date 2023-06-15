fun main(){
    camel()
}




fun camel      (): String {

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
