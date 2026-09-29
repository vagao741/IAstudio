package com.iastudio.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Toast

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<android.widget.Button>(R.id.btnImagem).setOnClickListener {
            Toast.makeText(this, "Criador de imagens em breve", Toast.LENGTH_SHORT).show()
        }

        findViewById<android.widget.Button>(R.id.btnVideo).setOnClickListener {
            Toast.makeText(this, "Criador de vídeos em breve", Toast.LENGTH_SHORT).show()
        }

        findViewById<android.widget.Button>(R.id.btnChat).setOnClickListener {
            Toast.makeText(this, "Chat com IA em breve", Toast.LENGTH_SHORT).show()
        }
    }
}
