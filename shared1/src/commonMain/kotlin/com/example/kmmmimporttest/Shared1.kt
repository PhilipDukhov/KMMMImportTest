package com.example.kmmmimporttest

import io.ktor.client.*

fun test(){

    println(Shared2.test)
    println(Shared2.client)

    val client = HttpClient {

    }
    println(client)
}