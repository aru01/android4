package com.example.homework4

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import android.net.Uri
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1.setOnClickListener{
            if(edit_Phone.text.toString().isEmpty()
                && edit_Message.text.toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(),"Enter Mobile Number and Message you want to send", Toast.LENGTH_SHORT).show();
            }
            else {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=" + edit_Phone.text.toString()
                        + "&text=" + edit_Message.text.toString()));
                startActivity(intent);
                edit_Phone.setText("");
                edit_Message.setText("")
                }
            }
        }
}