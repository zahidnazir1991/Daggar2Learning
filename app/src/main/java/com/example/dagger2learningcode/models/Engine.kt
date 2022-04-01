package com.example.dagger2learningcode.models

import android.util.Log

class Engine {
    lateinit var piston: Piston
    lateinit var crankShift: CrankShift
    lateinit var sparkPlug: SparkPlug
    val Tag :String = "TestDagger"
    constructor(piston: Piston,crankShift: CrankShift,sparkPlug: SparkPlug){

    }
     fun StartEngine(){
        Log.d(Tag,"Engine Started")

    }

}