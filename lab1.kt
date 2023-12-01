//1.А

fun main() {
    val a: Int = 10
    val b: Int = 2
    val addition = a + b
    val subtraction = a - b
    val multiplication = a * b
    val division = a / b
    println("$addition, $subtraction, $multiplication, $division")
    
}

//1.Б

fun main() {
    var a: Int = 100
    var b: Int = 100
    if (a>b) {
        println("Значение переменной <a> больше")
    }
    else if (a<b) {
        println("Значение переменной <b> больше")
    }
    else {
        println("<a> и <b> равны")
    }
}

//2.A

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Введите число: ")
	val number = scanner.nextInt()
    println("Вы ввели число: $number")
    scanner.close()
}

//2.Б

fun main() {
    var num: Int = 11
    if (num%2==0) {
        println("Число четное")
    }
    else {
        println("Число нечетное")
    }
}

//3.A

fun main() {
    var num: Int = 5
    
    for (i in 1..10) {
        var result = num * i
        println("$result")
    }
}

//3.Б

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var number: Int
	while (true) {
        print("Введите число (для завершения введите 0): ")
        number = scanner.nextInt()
		if (number == 0) {
            println("Программа завершена.")
            break
        }
		val square = number * number
        println("Квадрат числа $number равен $square")
    }
	scanner.close()
}

// Колода карт

data class Card(val rank: String, val suit: String)

class Deck {
    val cards: MutableList<Card> = mutableListOf()
    
  	init {
        // Инициализация колоды карт
        val ranks = listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т")
        val suits = listOf("Черви", "Буби", "Крести", "Пики")

        for (rank in ranks) {
            for (suit in suits) {
                cards.add(Card(rank, suit))
            }
        }
    }
	
    fun sortDeck() {
        // Сортировка колоды по номиналу и масти
        cards.sortWith(compareBy<Card> { it.rank }.thenBy { it.suit })
    }

    fun displayDeck() {
        // Вывод колоды на экран
        for (card in cards) {
            println("${card.rank} ${card.suit}")
        }
    }
}

fun main() {
    val deck = Deck()
	// Сортировка колоды
    deck.sortDeck()

    // Вывод отсортированной колоды
    println("\nОтсортированная колода:")
    deck.displayDeck()
}

