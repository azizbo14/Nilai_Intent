package com.example.input_nilai_intent

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var nim1: EditText = findViewById(R.id.nim)
        var nama1: EditText = findViewById(R.id.nama)
        var nilai1: EditText = findViewById(R.id.nilai)


        btn_proses.setOnClickListener{

            intent = Intent(this, MainActivity_Dua::class.java)
            intent.putExtra("nim",nim1.getText())
            intent.putExtra("nama",nama1.getText())
            intent.putExtra("nilai",nilai1.getText())

            startActivity(intent)
        }

    }
}
