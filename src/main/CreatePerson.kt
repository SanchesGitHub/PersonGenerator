package main

import main.data.*
import main.data.dataOfResidence.*

class CreatePerson {

    fun create(): PersonalData {

        val gender: Gender
        val firstName: String
        val lastName: String
        val middleName: String

        val random = (0..1).random()
        gender = if (random == 0) {
            Gender.MAN
        } else {
            Gender.WOMAN
        }

        if (gender == Gender.MAN) {
            firstName = maleFirstNames[(0 until maleFirstNames.size).random()]
            lastName = lastNames[(0 until lastNames.size).random()]
            middleName = "${middleNames[(0 until middleNames.size).random()]}ич"
        } else {
            firstName = femaleFirstNames[(0 until femaleFirstNames.size).random()]
            lastName = "${lastNames[(0 until lastNames.size).random()]}а"
            middleName = "${middleNames[(0 until middleNames.size).random()]}на"
        }

        val placeOfResidence = PlaceOfResidence(
            zip = zipCodes[(0 until zipCodes.size).random()],
            country = countries[(0 until countries.size).random()],
            state = states[(0 until states.size).random()],
            city = cities[(0 until cities.size).random()],
            street = streets[(0 until streets.size).random()],
            building = (1 until 50).random().toString(),
            apartment = (1 until 200).random().toString()
        )

        val dateOfBirth = createBirthDate()

        return PersonalData(
            firstName = firstName,
            lastName = lastName,
            middleName = middleName,
            age = getAge(dateOfBirth),
            gender = gender.sex,
            dateOfBirth = dateOfBirth,
            placeOfBirth = placesOfBirth[(0 until placesOfBirth.size).random()],
            placeOfResidence = placeOfResidence
        )
    }
}

