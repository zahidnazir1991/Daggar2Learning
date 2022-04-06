package com.example.dagger2learningcode.models

import android.util.Log
import javax.inject.Inject

class Wheels {
    lateinit var frame: Frame
    lateinit var rubber: Rubber
    val Tag :String = "TestDagger"
    @Inject
    constructor(frame: Frame,rubber: Rubber){

    }

    public fun Inflate(){
        Log.d(Tag,"Wheels are Inflated")
    }
}