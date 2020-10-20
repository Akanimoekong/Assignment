import java.util.Scanner

class GetInput {

    fun getter1(){

        val reader = Scanner(System.`in`)
        print("Enter your Age: ")

        var age:Int = reader.nextInt()

        if (age >= 18) {
            println("You are illegible to watch this Movie")
        } else {
            println("You are not illegible to watch this Movie")
        }
    }
}

fun main(args: Array<String>) {
    val me = GetInput()
    me.getter1()
}