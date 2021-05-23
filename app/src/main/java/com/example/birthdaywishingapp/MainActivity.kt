package com.example.birthdaywishingapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createGreetingPage(view: View) {
        val nameInput: EditText = findViewById(R.id.nameInput)
        val name = nameInput.editableText.toString()
        Toast.makeText(this, "Greeting Page created for $name.", Toast.LENGTH_LONG).show()
        val intent = Intent(this, GreetingActivity::class.java)
        intent.putExtra(GreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}