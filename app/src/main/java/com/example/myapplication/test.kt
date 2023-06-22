package com.example.myapplication

import android.util.Log
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun k() = flow {
    println("awef")
    emit(1)
}
fun main()  = runBlocking {
    k().collect()
}