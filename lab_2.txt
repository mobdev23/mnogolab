/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun sum(a: Int, b: Int) {
    val result = a + b;
    println("Результат: $result")
}

fun sum(a: Double, b: Double) {
    val result = a + b;
    println("Результат: $result")
}
fun multiply(a:Int,b:Int,c:Int) {
    val result = a*b*c
    println("Результат: $result")
}
fun multiply(a:Double,b:Double,c:Double) {
    val result = a*b*c
    println("Результат: $result")
}
fun greet(text:String) {
    println("Привет $text")
}
class Calculator() {
    fun add(a:Int,b:Int) {
        val result = a+b;
        println("Результат: $result")
    }
    fun multiply(a:Int,b:Int,c:Int) {
        val result = a*b*c;
        println("Результат: $result")
    }
}

fun main() {
//     1.2 Задание
    sum(2,3)
//     1.3 
    multiply(3.5,4.1,5.2)
//     1.4
    greet("Темирхан и Вадим")
    val calc = Calculator()
   	calc.add(2,3)
    calc.multiply(2,3,4)
}