package com.example.menu_app

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var menuInflater = menuInflater
        menuInflater.inflate(R.menu.layout_menu,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId==R.id.contact){
            intent = Intent(this, ContactActivity::class.java)
            ContactActivity(intent)
        }
        else if(item.itemId==R.id.setting){
            intent = Intent(this, SettingActivity::class.java)
            ContactActivity(intent)
        }
       else if(item.itemId==R.id.login){
           item.title="logout"}
         else { super.onOptionsItemSelected(item)}
return true
    }


    }




