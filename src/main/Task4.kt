package main

fun task4() {

    println("Введите числа через пробел:")
    val numbers = readLine()
    val listNumbers = numbers?.split(" ")

    val arrayNumbers: Array<Int> = Array(listNumbers!!.size) { i -> listNumbers[i].toInt() }
    val arraySort: Array<Int> = Array(arrayNumbers.size) { 0 }

    var positivePosition = arrayNumbers.size - 1
    var negativPosition = 0
    for (i in arrayNumbers.indices) {
        if (arrayNumbers[i] < 0) {
            arraySort[negativPosition] = arrayNumbers[i]
            negativPosition++
        } else {
            arraySort[positivePosition] = arrayNumbers[i]
            positivePosition--
        }
    }

    println("Новый массив: ")
    arraySort.forEach { print("$it ") }
}