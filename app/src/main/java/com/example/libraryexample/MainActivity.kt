package com.example.libraryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.Position
import com.example.mylibrary.ToastMapper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastMapper.showToastWithPosition(this,"Dummy text", Position.Top)
    }
}