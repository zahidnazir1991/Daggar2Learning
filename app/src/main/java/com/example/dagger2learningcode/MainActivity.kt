package com.example.dagger2learningcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2learningcode.models.Engine
import com.example.dagger2learningcode.models.di.DaggerCarInjector

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val car = DaggerCarInjector.create().getCar()
        car.Driving()
        val engine = DaggerCarInjector.create().getEngine()
        engine.StartEngine()
//        val car = DICarFactory.car
//        car.Driving()
    }

}