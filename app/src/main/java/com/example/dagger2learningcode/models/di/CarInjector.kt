package com.example.dagger2learningcode.models.di

import com.example.dagger2learningcode.models.Car
import com.example.dagger2learningcode.models.Engine
import dagger.Component

@Component
interface CarInjector {
  fun getCar() : Car
  fun getEngine() : Engine
}