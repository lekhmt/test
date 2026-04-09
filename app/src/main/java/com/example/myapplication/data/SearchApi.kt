package com.example.myapplication.data

import kotlinx.coroutines.delay
import kotlin.random.Random
import kotlin.time.Duration.Companion.seconds

interface SearchApi {
    suspend fun search(query: String): List<String>
}

class SimpleSearchApi : SearchApi {

    private val source = generatedData()

    override suspend fun search(query: String): List<String> {
        delay(3.seconds)
        if (Random.nextInt(3) == 0) {
            throw RuntimeException("Сетевая ошибка")
        }
        return source.filter { it.startsWith(query) }
    }

}