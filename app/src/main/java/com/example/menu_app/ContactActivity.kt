package com.example.menu_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ContactActivity(intent: Intent) :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
    }
}