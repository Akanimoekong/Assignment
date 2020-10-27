interface MyInterface {
    fun greet()
    fun plsSit()
}

class GetInterface: MyInterface {

    override fun greet() {
        val welcome = "You are welcome to AfricInnovate"
        print("Please enter your name in this space: ")
        val name = readLine()
        println("Dear  $name!  $welcome")
    }

    override fun plsSit() {
        println("Please look for a Convenient place and have a Seat ")
    }
}

fun main(){
    val obj = GetInterface()
    obj.greet()
    obj.plsSit()
}