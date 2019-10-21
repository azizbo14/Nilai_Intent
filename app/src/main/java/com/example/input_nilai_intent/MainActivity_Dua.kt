package com.example.input_nilai_intent

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dua.*


@SuppressLint("Registered")
class MainActivity_Dua: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)

        val bundle= intent.extras
        val nimku = bundle?.get("nim")
        val namaku = bundle?.get("nama")
        val nilaiku = bundle?.get("nilai")
        var nilai = nilaiku.toString()
        var nilaian = nilai.toInt()

        if (nilaian >= 80){
            keterangan.setText("A")
        }
        else if(nilaian >= 60){
            keterangan.setText("B")
        }
        else if(nilaian >= 40){
            keterangan.setText("C")
        }
        else if(nilaian >= 20){
            keterangan.setText("D")
        }
        else{
            keterangan.setText("E")
        }
        nim_hasil.setText(""+nimku)
        nama_hasil.setText(""+namaku)
        nilai_hasil.setText(""+nilaiku)

        button.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }

}