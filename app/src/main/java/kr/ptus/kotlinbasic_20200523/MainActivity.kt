package kr.ptus.kotlinbasic_20200523

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okBtn.setOnClickListener {
//            Log.d("메인화면","확인버튼눌림")

            val inputcontent = inputEdt.text.toString()

            resultTxt.text = inputcontent

        }

    }
}
