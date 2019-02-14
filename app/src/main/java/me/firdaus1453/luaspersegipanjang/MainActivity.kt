package me.firdaus1453.luaspersegipanjang

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {
            // Null safety if
            if (edtPanjang.text.toString().isEmpty()){
                edtPanjang.error = "Panjang harus di isi"
                // Lalu langsung return atau menghentikan jalannya code, tidak dilanjutkan code berikutnya
                return@setOnClickListener
            }

            // Null safety if
            if (edtLebar.text.toString().isEmpty()){
                edtLebar.error = "Lebar harus di isi"
                // Lalu langsung return atau menghentikan jalannya code, tidak dilanjutkan code berikutnya
                return@setOnClickListener
            }

            // Menggunakan elvis operator ?: "default" agar tidak bernilai null
            // tapi akan memberikan nilai default dari penggunaaan elvis operator
            val panjang = edtPanjang.text.toString().toIntOrNull() ?: 0
            val lebar = edtLebar.text.toString().toIntOrNull() ?: 0

            val hasil = panjang * lebar
            txtHasil.text = hasil.toString()
        }
    }
}
