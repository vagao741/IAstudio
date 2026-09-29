package com.iastudio.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class ChatActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var mensagem by remember { mutableStateOf("") }
            val mensagens = remember { mutableStateListOf<String>() }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Text(
                    text = "IA Studio",
                    style = MaterialTheme.typography.headlineMedium
                )

                Text(
                    text = "Chat da IA",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 12.dp)
                )

                LazyColumn(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(mensagens) { texto ->
                        Text(text = texto)
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = mensagem,
                        onValueChange = { mensagem = it },
                        modifier = Modifier.weight(1f),
                        placeholder = {
                            Text("Digite sua mensagem...")
                        },
                        singleLine = true
                    )

                    Button(
                        onClick = {
                            if (mensagem.isNotBlank()) {
                                mensagens.add("Você: $mensagem")
                                mensagens.add(
                                    "IA: Ainda estou sendo conectada à inteligência artificial."
                                )
                                mensagem = ""
                            }
                        }
                    ) {
                        Text("Enviar")
                    }
                }
            }
        }
    }
}
