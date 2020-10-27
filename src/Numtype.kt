import java.util.*
class Numtype {
    val reader = Scanner(System.`in`)

    fun primeNumber() {
        print("Enter a number to check if its a prime number or not:\n")
        var num: Int = reader.nextInt()

        var flag = false
        for (i in 2..num / 2) {
//         condition for nonprime number
            if (num % i == 0) {
                flag = true
                break
            }
        }
        if (!flag)
            println("$num is a prime number.")
        else
            println("$num is not a prime number.")
    }

    fun even (){
            print("Enter a number: ")
            val num = reader.nextInt()

            if (num % 2 == 0)
                println("$num is even")
            else
                println("$num is odd")
        }
    }


fun main(){
    val obj = Numtype()
    obj.primeNumber()
    obj.even()
}