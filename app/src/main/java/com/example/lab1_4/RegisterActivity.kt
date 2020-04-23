package com.example.lab1_4

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn_join = findViewById<Button>(R.id.btn_join)
        val ed1 = findViewById<EditText>(R.id.et_id1)
        val ed2 = findViewById<EditText>(R.id.et_pwd1)

        btn_join.setOnClickListener{

            App.prefs.myEditText = ed1.text.toString()  /* 회원가입 단계를 거쳤다는 것을 loginActivity에게
             알려주기 위해 prefs에 값을 넣어줌. 이 prefs 값은 앱이 종료되더라도 남아있음. */

            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)


            finish()

        }


    }
}