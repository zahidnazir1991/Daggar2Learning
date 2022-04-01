package com.example.dagger2learningcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.dagger2learningcode.models.Car
import com.example.dagger2learningcode.models.Engine
import com.example.dagger2learningcode.models.Wheels

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var engine = Engine()
        var wheel = Wheels()
        val car = Car(engine,wheel)
        car.Driving()
    }
}