package com.example.icetask1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtName : EditText
    lateinit var txtSurname : EditText
    lateinit var txtCellphoneNo : EditText
    lateinit var txtEmailAddress : EditText
    lateinit var txtPassword : EditText
    lateinit var btnSubmit : Button
    lateinit var btnClear : Button
    lateinit var txtOutput : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        txtName = findViewById(R.id.txtName)
        txtSurname = findViewById(R.id.txtSurname)
        txtCellphoneNo = findViewById(R.id.txtCellphoneNo)
        txtEmailAddress = findViewById(R.id.txtEmailAddress)
        txtPassword = findViewById(R.id.txtPassword)
        btnSubmit = findViewById(R.id.btnSubmit)
        btnClear = findViewById(R.id.btnClear)
        txtOutput = findViewById(R.id.txtOutput)


        btnClear.setOnClickListener {
            txtName.text.clear()
            txtSurname.text.clear()
            txtCellphoneNo.text.clear()
            txtEmailAddress.text.clear()
            txtPassword.text.clear()
            txtOutput.text = ""
        }

            btnSubmit.setOnClickListener {
                val name = txtName.text.toString()
                val surname = txtSurname.text.toString()
                val cellphone = txtCellphoneNo.text.toString()
                val emailAddress = txtEmailAddress.text.toString()
                val Password = txtPassword.text.toString()

                txtOutput.text = "Your is $name \n Surname is $surname \n Cellphone is $cellphone  \n EmailAddress is $emailAddress \n Password is $Password"

            }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}