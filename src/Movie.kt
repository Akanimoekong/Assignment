import java.util.Scanner

class GetInput {
    private val reader = Scanner(System.`in`)

    fun ageGrade(){
        print("Enter your Age: ")

        var age:Int = reader.nextInt()
        if (age >= 18) {
            println("You are illegible to watch this Movie")
        } else {
            println("You are below the age Grade and not illegible to watch this Movie")
        }
    }

    fun newNumber(){
        print("Enter a new number: ")
        val number:Int = reader.nextInt()
        println("The number is  $number")
    }
}

fun main(args: Array<String>) {
    val me = GetInput()
    me.ageGrade()
    me.newNumber()
}