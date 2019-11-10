package main

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileOutputStream

fun createExcel(): String {
    val filepath = "./persons.xlsx"
    val xlWb = XSSFWorkbook()
    val xlWs = xlWb.createSheet()

    val rowNumber = 0
    val columnNumber = 0

    val xlRow = xlWs.createRow(rowNumber)
    val xlCol = xlRow.createCell(columnNumber)
    xlCol.setCellValue("Chercher Tech")

    val outputStream = FileOutputStream(filepath)
    xlWb.write(outputStream)
    xlWb.close()

    return filepath
}