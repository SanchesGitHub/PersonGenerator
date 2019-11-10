package main

data class PersonalData(
    val firstName: String,
    val lastName: String,
    val middleName: String,
    val age: Int,
    val gender: String,
    val dateOfBirth: String,
    val placeOfBirth: String,
    val placeOfResidence: PlaceOfResidence
)