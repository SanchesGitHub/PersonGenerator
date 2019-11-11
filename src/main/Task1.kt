package main

fun task1() {

    println("Введите число:")
    val n: Int? = try {
        Integer.parseInt(readLine())
    } catch (e: NumberFormatException) {
        println("Введено не число!")
        return
    }
    printTask1(n)

}

fun printTask1(n: Int?) {
    println("Вы ввели число $n")
}