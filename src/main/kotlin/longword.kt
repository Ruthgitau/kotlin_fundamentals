/*For a given input string of words, create a function that returns
the longest word in the string. For example, for the input phrase
“I love Coding,” the output should be “Coding.” For an added
challenge, you can create an output that lists the longest word
along with the number of characters in the word. So, for the
string “I love Coding,” the output would look something like,
“word: Coding count: 6.”*/



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



