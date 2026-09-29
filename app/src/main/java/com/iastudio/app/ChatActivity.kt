package com.iastudio.app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class ChatActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val input = findViewById<EditText>(R.id.messageInput)
        val sendButton = findViewById<Button>(R.id.sendButton)
        val messages = findViewById<TextView>(R.id.chatMessages)

        sendButton.setOnClickListener {
            val message = input.text.toString().trim()

            if (message.isNotEmpty()) {
                messages.append("\n\nVocê: $message")
                messages.append("\nIA Studio: Recebi sua mensagem. A conexão com a IA será adicionada na próxima etapa.")
                input.text.clear()
            }
        }
    }
}
