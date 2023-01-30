package com.example.myquizapp

data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val optioneOne: String,
    val optioneTwo: String,
    val optioneThree: String,
    val optioneFour: String,

    val correctAnswer: Int
)
