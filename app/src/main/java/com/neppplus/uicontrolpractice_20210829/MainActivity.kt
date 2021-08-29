package com.neppplus.uicontrolpractice_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        토스트 버튼이 눌리면 → 메세지가 적힌 내용을 받아와서 → 토스트를 띄우는데 사용.

        toastBtn.setOnClickListener {

//            메세지가 입력된 내용을 받아오자. → 토스트띠우는건 컴터가 기억해둬야함 → 변수를 만들어서 저장해두자
            val inputmessage = messageEdt.text.toString()

//            토스트를 띄울 때 → 변수에 담긴 내용을 띄우자.
            Toast.makeText(this, inputmessage, Toast.LENGTH_SHORT).show()

        }



    }
}