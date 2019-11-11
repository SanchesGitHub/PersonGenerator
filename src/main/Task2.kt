package main

fun task2() {

    println("Введите число:")
    val n: Int? = try {
        Integer.parseInt(readLine())
    } catch (e: NumberFormatException) {
        println("Введено не число!")
        return
    }

    val newNumber = printTask2(n)
    if (newNumber.isNullOrEmpty())
        println("Прочтение числа справо налево $newNumber")
}

fun printTask2(n: Int?): String? {
    var newNumber = ""
    if (n!! in 100..999) {
        for (i in n.toString().length - 1 downTo 0) {
            newNumber += n.toString()[i]
        }
    } else {
        println("Введено не трехзначное число!")
        return null
    }
    return newNumber
}