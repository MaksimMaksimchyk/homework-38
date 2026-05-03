package com.example.homework_38

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.homework_38.ui.theme.Homework38Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Homework38Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainUi(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MainUi(modifier: Modifier = Modifier) {
    Column(
        modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = "https://i.pravatar.cc/",
            contentDescription = "Avatar",
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )
        Text(
            "Random User",
            modifier = Modifier.padding(top = 22.dp),
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = "Phone number: + 123 456 789",
            modifier = Modifier
                .padding(top = 22.dp)
                .align(Alignment.Start),
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "City: Moscow",
            modifier = Modifier
                .padding(top = 12.dp)
                .align(Alignment.Start),
            style = MaterialTheme.typography.bodyMedium
        )
        Row(
            modifier = Modifier
                .padding(top = 22.dp)
                .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            IconButton(onClick = {}, Modifier.size(72.dp)) {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "Call",
                    tint = Color.Green,
                    modifier = Modifier.fillMaxSize()
                )
            }
            IconButton(onClick = {}, Modifier.size(72.dp)) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Message",
                    tint = Color.Blue,
                    modifier = Modifier.fillMaxSize()
                )
            }
            IconButton(onClick = {}, Modifier.size(72.dp)) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    tint = Color.Black,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun MainUiPreview() {
    Homework38Theme {
        MainUi()
    }
}