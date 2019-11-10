package main

import main.Data.Seasons

fun task3() {

    println("Введите число:")
    val n: Int? = try {
        Integer.parseInt(readLine())
    } catch (e: NumberFormatException) {
        println("Введено не число!")
        return
    }

    if (n!! in 1..12) {
        when(n) {
            12, 1, 2 -> println("Месяц №$n это ${Seasons.WINTER.seasonName}")
            3, 4, 5 -> println("Месяц №$n это ${Seasons.SPRING.seasonName}")
            6, 7, 8 -> println("Месяц №$n это ${Seasons.SUMMER.seasonName}")
            9, 10, 11 -> println("Месяц №$n это ${Seasons.AUTUMN.seasonName}")
        }
    } else {
        println("Введено число не от 1 до 12!")
        return
    }
}