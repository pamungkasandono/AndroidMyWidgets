package com.example.mywidgets

import java.util.*

internal object NumberGenerator {
    fun generate(max: Int) = Random().nextInt(max)
}