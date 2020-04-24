package com.example.lab1_4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val et_id = findViewById<EditText>(R.id.et_id)
        val et_pwd = findViewById<EditText>(R.id.et_pwd)
        val btn_login = findViewById<Button>(R.id.btn_login)
        val tv_register = findViewById<TextView>(R.id.tv_register)


        val msg = App.prefs.myEditText
        if (msg == "") { /*RegisterActivity에서 넣어준 값이 없거나 앱 설치한 초기 상태일 경우*/

        }
        else{ /*prefs에 넣어준 값이 있으면*/
            Toast.makeText(this, "자동 로그인", Toast.LENGTH_LONG).show()
            val intent1 = Intent(this,MainActivity::class.java)
            startActivity(intent1) /*MainActivity로 이동*/
        }

        btn_login.setOnClickListener {
            if(et_id.text.isNullOrBlank()||et_pwd.text.isNullOrBlank()){
                Toast.makeText(this,"아이디와 비밀번호를 확인하세요", Toast.LENGTH_SHORT).show()
            }else{
                App.prefs.myEditText = et_id.text.toString() /* 회원가입을 거쳤으면 prefs값이 있었겠지만, 회원가입 단계 없이 바로
                초기에 로그인 시도하는 경우에는 prefs값은 초기 ""으로 계속 유지됨. 앱 종료 후 다시 실행시켰을 때에도 역시 ""값이므로
                자동 로그인이 되지 않음. 회원가입 거치지 않고도, 한번 로그인 하면 앱 종료 후 다시 실행했을 때도 자동로그인이 되게 하기
                위해 여기서 prefs값을 넣어줌. 만약 이 단계가 없으면 처음에 회원가입 단계 거치지 않을 경우 자동 로그인 x */
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                /* install하고 처음으로 회원가입 단계 없이 로그인 시도할 경우 '자동로그인' 토스트 안 뜸.
                * 앱 종료하고 다시 들어가면 그때는 prefs 값이 있으므로 토스트 메세지 발생함. */

            }
        }
        tv_register.setOnClickListener{
            val intent = Intent(this,RegisterActivity::class.java)
            startActivityForResult(intent, 201)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val id = data?.getStringExtra("id")
        val pass = data?.getStringExtra("pass")
        val et_id = findViewById<EditText>(R.id.et_id)
        val et_pwd = findViewById<EditText>(R.id.et_pwd)

        et_id.setText(id)
        et_pwd.setText(pass)

    }

}