package com.example.myapplication.data

import io.github.serpro69.kfaker.Faker

fun generatedData(): List<String> {
    val res = mutableListOf<String>()
    val faker = Faker()
    repeat(100) {
        res.add(faker.name.nameWithMiddle())
    }
    return res
}