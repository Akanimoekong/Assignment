import java.util.*
 open class Employment {

     fun fullname(){
        print("Kindly enter your name: ")
        var names = readLine()
        println("Welcome $names")
    }

    fun question(){
        print("Who is the President of Nigeria: ")
        var checker = readLine()
        if (checker == "Buhari"){
            print("You got the Job")
        }else{
            print("Try Again Next Time")
        }
    }


 }

fun main (){
    val obj = Employment()
    obj.fullname()
    obj.question()
}
