package edu.mobcom.midtermfianyaao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val logout = findViewById<Button>(R.id.lb)
        val orderDetails2 = findViewById<EditText>(R.id.reginfo)
        val orderDetailsTV = findViewById<TextView>(R.id.lblreginfo)
        val rCN = intent!!.getStringExtra("ID Number")
        val rCNum =intent!!.getStringExtra("First Name")
        val rCEM = intent!!.getStringExtra("Last Name")
        val rB = intent!!.getStringExtra("Email Address")
        val rF = intent!!.getStringExtra("Password")

        //display received data in multi-line edit text
        val details: String = "ID Number: " + rCN + "\n"+
                "First Name: " + rCNum + "\n"+
                "Last Name: "+ rCEM + "\n"+
                "Email Address: "+ rB + "\n"+
                "Password: "+ rF
        orderDetails2.setText(details)
        orderDetailsTV.text=details

        logout.setOnClickListener{
            val i= Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}