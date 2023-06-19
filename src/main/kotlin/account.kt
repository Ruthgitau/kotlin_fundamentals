class account {

    var acc_num:Int = 0
    var name:String? = ""
    var amt:Float=0. toFloat()


    fun insert(ac:Int, n:String, am:Float){
        acc_num=ac
        name=n
        amt=am
        println("Account Number $acc_num holder $name amount $amt")
    }

    fun deposit(){
        var hello=account()
    }

    fun withdraw(){

    }

    fun checkbalance(){

    }
}

fun main(){
    account()
    var person=account()
    person.insert(44,"Ruth",60.97f)
}