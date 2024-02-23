fun main() {
    printName("Hello Shallo")
    divisionofNumbers(30,4)
    addfourNumbers(10,10,20,15)
    factsAboutMe("i know four languages")
}

fun printName(word:String) {
    println(word)
}
fun divisionofNumbers(num1:Int,num2:Int) :Int{
    var div= num1/num2
    var sum = num1%num2
    println(sum)
    return sum
 }
fun addfourNumbers(num2:Int,num3:Int,num4:Int,num5:Int):Int {
    var sum = num2+num3+num4+num5
    println(sum)
    return sum
}
fun factsAboutMe(word: String){
    println(word)

}