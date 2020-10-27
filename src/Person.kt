class Person: Employment() {

    fun message(){
        print("You are welcome to an example of a class that extends a class \n \n \n ")
    }

    fun imessage() {
        print("Enter only your first name here: ")
        var wording = readLine()
            val word = wording?.reversed()
            println("The Reverse of $wording is $word")
    }

}

fun main (){
    val obj = Person()
     obj.message()
    obj.fullname()
    obj.imessage()
}