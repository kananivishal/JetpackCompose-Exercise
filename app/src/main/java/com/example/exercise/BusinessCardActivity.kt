package com.example.exercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercise.ui.theme.ExerciseTheme

class BusinessCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExerciseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD0E8D0)
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            About()
        }
        Column(
            modifier = Modifier
                .padding(bottom = 32.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Contact(Icons.Default.Phone, "+11 (123) 444 555 666")
            Contact(Icons.Default.Share, "@AndroidDev")
            Contact(Icons.Default.Email, "jen.doe@android.com")
        }
    }
}

@Composable
fun About() {
    val logo = painterResource(R.drawable.android_logo)

    Image(
        painter = logo,
        contentDescription = null,
        modifier = Modifier
            .size(100.dp)
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Vishal Kanani",
        fontSize = 30.sp,
        fontWeight = FontWeight.Medium
    )
    Text(
        text = "Android Developer Extraordinaire",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        color = Color(0xFF2E7D32)
    )
}

@Composable
fun Contact(icon: ImageVector, contactText: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(vertical = 4.dp)
    ) {
        Icon(
            icon,
            contentDescription = null,
            tint = Color(0xFF2E7D32),
            modifier = Modifier
                .size(30.dp)
                .padding(end = 12.dp)
        )
        Text(
            text = contactText
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview4() {
    ExerciseTheme {
        BusinessCard()
    }
}