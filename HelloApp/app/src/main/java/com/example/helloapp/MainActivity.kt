package com.example.helloapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloapp.ui.theme.HelloAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloAppTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {

    var message by remember { mutableStateOf("Welcome") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = message)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            message = "Button Clicked!"
        }) {
            Text("Click Me")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row {
            Text("Left ")
            Text("Center ")
            Text("Right")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "On top", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyApp() {
    HelloAppTheme {
        MyApp()
    }
}
