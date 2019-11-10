package main

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileOutputStream
import java.io.File

fun createExcel(arrayPersons: Array<PersonalData>): String {

    val columns = arrayOf(
        "Имя",
        "Фамилия",
        "Отчество",
        "Возраст",
        "Пол",
        "Дата рождения",
        "Место рождения",
        "Индекс",
        "Страна",
        "Область",
        "Город",
        "Улица",
        "Дом",
        "Квартира"
    )

    val filepath = "./persons.xlsx"

    val xlWb = XSSFWorkbook()
    val xlWs = xlWb.createSheet()

    val headerRow = xlWs.createRow(0)
    for (col in columns.indices) {
        val cell = headerRow.createCell(col)
        cell.setCellValue(columns[col])
    }

    var rowNumber = 1
    arrayPersons.forEach {
        val row = xlWs.createRow(rowNumber)
        row.createCell(0).setCellValue(it.firstName)
        row.createCell(1).setCellValue(it.lastName)
        row.createCell(2).setCellValue(it.middleName)
        row.createCell(3).setCellValue(it.age.toString())
        row.createCell(4).setCellValue(it.gender)
        row.createCell(5).setCellValue(it.dateOfBirth)
        row.createCell(6).setCellValue(it.placeOfBirth)
        row.createCell(7).setCellValue(it.placeOfResidence.zip)
        row.createCell(8).setCellValue(it.placeOfResidence.country)
        row.createCell(9).setCellValue(it.placeOfResidence.state)
        row.createCell(10).setCellValue(it.placeOfResidence.city)
        row.createCell(11).setCellValue(it.placeOfResidence.street)
        row.createCell(12).setCellValue(it.placeOfResidence.building)
        row.createCell(13).setCellValue(it.placeOfResidence.apartment)
        rowNumber++
    }

    val outputStream = FileOutputStream(filepath)
    xlWb.write(outputStream)
    xlWb.close()

    val file = File(filepath)
    return file.canonicalPath
}