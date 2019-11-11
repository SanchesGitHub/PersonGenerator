package main

fun main() {

    println("Выберите задачу 1, 2, 3, 4 или 5:")
    val n: Int? = try {
        Integer.parseInt(readLine())
    } catch (e: NumberFormatException) {
        println("Введено не число!")
        return
    }

    if (n!! in 1..5) {
        when (n) {
            1 -> task1()
            2 -> task2()
            3 -> task3()
            4 -> task4()
            5 -> task5()
        }
    } else {
        println("Введен некорректный номер задачи!")
        return
    }
}
