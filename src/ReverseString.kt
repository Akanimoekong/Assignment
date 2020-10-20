class ReverseString {
   private var wording = "AfricInnovate"

    fun revers() {
        val word = wording.reversed()
        println("The Reverse of $wording is $word")
    }
}

fun main (){
    val top = ReverseString()
    top.revers()


}