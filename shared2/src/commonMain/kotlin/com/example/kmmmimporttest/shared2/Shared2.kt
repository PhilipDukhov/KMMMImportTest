package com.example.kmmmimporttest.shared2

import com.example.kmmmimporttest.shared3.Shared3
import io.ktor.client.*

object Shared2: Shared3() {
    val client = HttpClient {

    }
}