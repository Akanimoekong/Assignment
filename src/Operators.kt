
class Operators {

    private var num1 = 22
    private var num2 = 44

// This function Multiplies two numbers (num1 and num2)
    fun multiplication(){
        val multi = num1 * num2
        println("The multiplication of num1 and num2 is $multi")
    }

    // This function Adds two numbers (num1 and num2)
    fun addition(){
        val add = num1 + num2
        println("The Addition of num1 and num2 is $add")
    }

    // This function Divides two numbers (num1 and num2)
    fun division(){
        val divide = num1.toDouble() / num2.toDouble()
        println("The Division of num1 and num2 is $divide")
    }

    // This function checks the Average two numbers (num1 and num2)
    fun average(){
        val avg = (num1 + num2) / 2
        println("The Average of num1 and num2 is $avg")
    }
}

fun main(){
    val me = Operators()
    me.addition()
    me.average()
    me.division()
    me.multiplication()
}