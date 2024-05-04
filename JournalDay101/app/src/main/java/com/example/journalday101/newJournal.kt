package com.example.journalday101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class newJournal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_journal)


        val btnSaveJournal: Button = findViewById(R.id.btnSaveJournal)
        btnSaveJournal.setOnClickListener {
            val intent = Intent(this, AllJournals::class.java)
            startActivity(intent) //
        }

    }
}