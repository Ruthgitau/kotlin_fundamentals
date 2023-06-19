open class Base {
    var a=1
    private var b=2
    protected open var c=3// protected but open to derived classes
    internal val d=4 //default
    protected fun e(){

    }

}
class derived:Base(){
    override var c=9

}
fun main(){
    var Base=Base()
    var derived=derived()
}

