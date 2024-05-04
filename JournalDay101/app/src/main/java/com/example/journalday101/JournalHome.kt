package com.example.journalday101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class JournalHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_journal_home)




        val fab = findViewById<FloatingActionButton>(R.id.btnNewJournal1)
        fab.setOnClickListener {
            val intent = Intent(this, newJournal::class.java)
            startActivity(intent)
        }


    }

}