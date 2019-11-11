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
    val season = printTask3(n)
    println("Месяц №$n это $season")
}

fun printTask3(n: Int?): String? {
    if (n!! in 1..12) {
        when (n) {
            12, 1, 2 -> return Seasons.WINTER.seasonName
            3, 4, 5 -> return Seasons.SPRING.seasonName
            6, 7, 8 -> return Seasons.SUMMER.seasonName
            9, 10, 11 -> return Seasons.AUTUMN.seasonName
        }
    } else {
        println("Введено число не от 1 до 12!")
    }
    return null
}