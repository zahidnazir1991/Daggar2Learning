package com.example.dagger2learningcode.models

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor (var piston: Piston, var crankShift: CrankShift, var sparkPlug: SparkPlug) {
    val Tag :String = "TestDagger"


     fun StartEngine(){
        Log.d(Tag,"Engine Started")
    }
}