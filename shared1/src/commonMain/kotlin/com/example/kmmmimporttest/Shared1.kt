package com.example.kmmmimporttest

import com.example.kmmmimporttest.shared2.Shared2
import com.example.kmmmimporttest.shared3.Shared3
import io.ktor.client.*

fun test(){

    println(Shared3().test)
    println(Shared2.client)

    val client = HttpClient {

    }
    println(client)
}