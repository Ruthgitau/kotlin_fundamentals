fun main(){

    var line="I love coding"
    println(long_word(line))
    println(long_word(line).count())

}

fun long_word(line:String): String {

    val words=line.trim().split("\\s+".toRegex())
    var longest=" "

    for (word in words) {
        if (word.length>longest.length){
            longest=word
        }
    }
    return longest
}



