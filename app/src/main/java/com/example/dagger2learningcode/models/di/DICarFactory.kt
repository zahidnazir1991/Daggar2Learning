package com.example.dagger2learningcode.models.di

import com.example.dagger2learningcode.models.Car
import com.example.dagger2learningcode.models.di.DIEngineFactory
import com.example.dagger2learningcode.models.di.DIWheelFactory

object DICarFactory {
    val car: Car
    get() = Car(DIEngineFactory.engine, DIWheelFactory.wheels)
}