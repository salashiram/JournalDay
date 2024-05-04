package com.example.journalday101
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity



import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val btnLogin: Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent = Intent(this, JournalHome::class.java)
            startActivity(intent) //
        }




        val clickRegister = findViewById<TextView>(R.id.textViewRegister);
        clickRegister.setOnClickListener{
            val intent:Intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }



















    }
}