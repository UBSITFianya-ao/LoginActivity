package edu.mobcom.midtermfianyaao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val logout = findViewById<Button>(R.id.lb)


        logout.setOnClickListener{
            val i= Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}