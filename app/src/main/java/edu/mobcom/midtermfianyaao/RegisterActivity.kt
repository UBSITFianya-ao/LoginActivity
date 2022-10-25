package edu.mobcom.midtermfianyaao

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)
        val logout = findViewById<Button>(R.id.lb)
        val registerbtn = findViewById<Button>(R.id.reg)
        val idnumber = findViewById<EditText>(R.id.idn)
        val first = findViewById<EditText>(R.id.fn)
        val last = findViewById<EditText>(R.id.ln)
        val emailad = findViewById<EditText>(R.id.ema)
        val pass = findViewById<EditText>(R.id.pw2)


        logout.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
            registerbtn.setOnClickListener {
                var iReg = Intent(this@RegisterActivity,ProfileActivity::class.java)
                with(iReg){
                    putExtra("ID Number",idnumber.text.toString())
                    putExtra("First Name",first.text.toString())
                    putExtra("Last Name",last.text.toString())
                    putExtra("Email Address",emailad.text.toString())
                    putExtra("Password",pass.text.toString())
                }
                var reginfos:String = (idnumber.text.toString()) + "\n" + (first.text.toString()) + "\n" + (last.text.toString()) + "\n" + (emailad.text.toString()) + "\n" + (pass.text.toString())

                try {
                    Toast.makeText(this,reginfos, Toast.LENGTH_LONG).show()
                }catch (e: ActivityNotFoundException){
                    Toast.makeText(this,"Content Error", Toast.LENGTH_LONG).show()
                }

                startActivity(iReg)
            }






    }
}