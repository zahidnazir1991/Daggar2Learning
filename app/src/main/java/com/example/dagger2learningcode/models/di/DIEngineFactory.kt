package com.example.dagger2learningcode.models.di

import com.example.dagger2learningcode.models.di.DIEngineFactory
import com.example.dagger2learningcode.models.Piston
import com.example.dagger2learningcode.models.CrankShift
import com.example.dagger2learningcode.models.Engine
import com.example.dagger2learningcode.models.SparkPlug

object DIEngineFactory {
    val engine: Engine
        get() = Engine(piston, crankShift, sparkPlug)
    val piston: Piston
        get() = Piston()
    val crankShift: CrankShift
        get() = CrankShift()
    val sparkPlug: SparkPlug
        get() = SparkPlug()
}