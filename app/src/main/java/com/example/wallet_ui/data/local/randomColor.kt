package com.example.wallet_ui.data.local

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

fun randomColor(from:Int=50) : Color{
    val random = Random.Default
    val red = random.nextInt(from,256)
    val blue = random.nextInt(from,256)
    val green = random.nextInt(from,256)
    return  Color(red, green, blue)
}