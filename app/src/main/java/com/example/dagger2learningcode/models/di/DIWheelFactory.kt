package com.example.dagger2learningcode.models.di

import com.example.dagger2learningcode.models.Frame
import com.example.dagger2learningcode.models.Wheels
import com.example.dagger2learningcode.models.di.DIWheelFactory
import com.example.dagger2learningcode.models.Rubber

object DIWheelFactory {
    val wheels: Wheels
        get() = Wheels(frame, rubber)
    val frame: Frame
        get() = Frame()
    val rubber: Rubber
        get() = Rubber()
}