package com.example.dagger2learningcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.dagger2learningcode.models.*
import com.example.dagger2learningcode.models.di.DICarFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val car = DICarFactory.car
        car.Driving()
    }
}