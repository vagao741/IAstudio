package com.iastudio.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnImagem).setOnClickListener {
            Toast.makeText(this, "Criador de imagens em breve", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnVideo).setOnClickListener {
            Toast.makeText(this, "Criador de vídeos em breve", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnChat).setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }
    }
}
