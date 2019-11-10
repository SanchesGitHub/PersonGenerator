package main

import java.lang.Integer.parseInt

fun main() {

    val createPerson = CreatePerson()
    val arrayPersons: Array<PersonalData>

    println("Введите число:")
    val n: Int? = try {
        parseInt(readLine())
    } catch (e: NumberFormatException) {
        println("Введено не число!")
        return
    }

    if (n!! in 1..30) {
        println("Будет создано $n записей")
        arrayPersons = Array(n) { createPerson.create() }
    } else {
        println("Количество в диапазоне не от 1 до 30!")
        return
    }

    arrayPersons.forEach { println(it) }
    val filepath = createExcel()

    println("Файл создан. Путь: ${filepath}")
}
