package edu.mobcom.midtermfianyaao

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        val logout = findViewById<Button>(R.id.lb)
        val sendMail = findViewById<Button>(R.id.osend)
        val subj = findViewById<EditText>(R.id.txtSubj)
        val msg = findViewById<EditText>(R.id.txtMessage)
        val recipients = findViewById<EditText>(R.id.txtEmail)
        var iSend: Intent

        sendMail?.setOnClickListener{
            iSend= Intent(Intent.ACTION_SENDTO).apply{
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf(recipients.text.toString()))
                putExtra(Intent.EXTRA_SUBJECT, subj.text.toString())
                putExtra(Intent.EXTRA_TEXT, msg.text.toString())
            }

            try{
                startActivity(iSend)
                Toast.makeText(this,"Message sent to $recipients", Toast.LENGTH_LONG).show()
            }catch (e: ActivityNotFoundException){
                Toast.makeText(this, "Content error", Toast.LENGTH_LONG).show()
            }
        }

        logout.setOnClickListener{
            val i= Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}