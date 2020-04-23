package com.example.lab1_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* finish()를 하면 안 됨. 창을 닫아버릴 경우 loginActivity -> mainActivity로 창 전환이
        * 이루어 지는 것을 확인 할 수 없음. */
    }

}