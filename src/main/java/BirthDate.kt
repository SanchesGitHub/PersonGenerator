package main

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.Period

const val DATE_FORMAT = "dd-MM-yyyy"
var formatter: DateTimeFormatter = DateTimeFormatter.ofPattern(DATE_FORMAT)

fun createBirthDate(): String {
    val minDay = LocalDate.of(1900, 1, 1).toEpochDay().toInt()
    val maxDay = LocalDate.of(2015, 1, 1).toEpochDay().toInt()
    val randomDay = minDay + (0 until maxDay - minDay).random()
    val randomBirthDate = LocalDate.parse(LocalDate.ofEpochDay(randomDay.toLong()).toString()).format(formatter)

    return randomBirthDate.toString()
}

fun getAge(birthDate: String): Int {
    return Period.between(LocalDate.parse(birthDate, formatter), LocalDate.now()).years
}