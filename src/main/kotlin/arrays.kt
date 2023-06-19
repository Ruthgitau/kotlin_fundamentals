//arrays are a collection of data of the same data type
fun main(){
    var fruits= arrayOf<String>("banana" ,"mango","apple","watermelon","strawberry","orange","pear","coconut","guava","cherry")

    for (y in fruits){
        println(y)
    }
    fruits.get(0)
    fruits.set(0,"tree tomato")


    for (a in fruits){
        println(a)
    }
    if("orange" in fruits){
        println("available")
    }
    else{
        println("not available")
    }



    //using the getter function

    //using the set function to set the value at index 7


    var datas= arrayOf(5,"add",25684605958,50.45,4.8)
    var months= arrayOf("january","february","march","april","may","june","july","august","september","october","november","december")
    for (x in months){
        println(x)


    }
}