package edu.mobcom.midtermfianyaao

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login: Button = findViewById(R.id.lb)
        val register: Button = findViewById(R.id.rb)
        val username: EditText = findViewById(R.id.un)


        login.setOnClickListener{
            val i= Intent(this, MessageActivity::class.java)
            startActivity(i)
        }

        login.setOnClickListener {
            val ilog = Intent(this@MainActivity, MessageActivity::class.java)
            with(ilog) {
                putExtra("Welcome, ", username.text.toString())
            }
            var welcome = username.text.toString()
            try {
                Toast.makeText(this,welcome, Toast.LENGTH_LONG).show()
            }catch (e: ActivityNotFoundException){
                Toast.makeText(this,"Content Error", Toast.LENGTH_LONG).show()
            }

            register.setOnClickListener {
                val i = Intent(this, RegisterActivity::class.java)
                startActivity(i)
            }
        }

    }
}