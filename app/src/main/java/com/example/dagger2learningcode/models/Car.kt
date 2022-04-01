package com.example.dagger2learningcode.models

import android.nfc.Tag
import android.util.Log
import com.example.dagger2learningcode.models.Wheels

class Car{
  lateinit var engine: Engine
   lateinit var  wheels: Wheels
    val Tag :String = "TestDagger"
    fun Driving(){
        engine.StartEngine()
        wheels.Inflate()
        Log.d(Tag,"Car is Driving")
    }
constructor(engine: Engine,wheels: Wheels)  {
    this.engine = engine
    this.wheels = wheels
}
}
