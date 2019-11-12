package test

import main.printTask2
import main.printTask3
import main.printTask4
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Tests {

    @Test
    fun testTask2True() {
        assertEquals("321", "${printTask2(123)}")
    }

    @Test
    fun testTask2False() {
        assertTrue(printTask2(1234).isNullOrEmpty())
    }

    @Test
    fun testTask3Winter() {
        assertEquals("Зима", "${printTask3(12)}")
    }

    @Test
    fun testTask3Spring() {
        assertEquals("Весна", "${printTask3(3)}")
    }

    @Test
    fun testTask3Summer() {
        assertEquals("Лето", "${printTask3(6)}")
    }

    @Test
    fun testTask3AUTUMN() {
        assertEquals("Осень", "${printTask3(9)}")
    }

    @Test
    fun testTask3False() {
        assertTrue(printTask3(123).isNullOrEmpty())
    }

    @Test
    fun testTask4True() {
        val array = arrayOf(-3, -42, -21, 115, 142, 12)
        val sortArray = printTask4(arrayOf(-3, 12, 142, -42, -21, 115))
        for(i in array.indices){
            assertEquals(array[i], sortArray[i])
        }
    }
}
