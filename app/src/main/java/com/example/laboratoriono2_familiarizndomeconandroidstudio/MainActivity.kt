package com.example.laboratoriono2_familiarizndomeconandroidstudio

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Nombre: Vernel Josue Hernández Cáceres.
//Carné: 24584.

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val context = LocalContext.current

                    Text(text = "Laboratorio No. 2 - Vernel", fontSize = 24.sp)
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(text = "¡Bienvenido a Jetpack Compose!", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(24.dp))

                    Button(
                        onClick = {
                            Toast.makeText(context, "Este es un botón en Compose", Toast.LENGTH_SHORT).show()
                        }
                    ) {
                        Text("Hola Compose")
                    }
                }
            }
        }
    }
}