package com.example.exercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exercise.ui.theme.ExerciseTheme

class ComposeQuadrantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExerciseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Info()
                }
            }
        }
    }
}

@Composable
fun Info() {
    Column {
        Row(Modifier.weight(1f)) {
            Column(Modifier.weight(1f)) {
                InfoCard(
                    color = Color(0xFFEADDFF),
                    title = stringResource(R.string.text_composable),
                    description = stringResource(R.string.desc_one)
                )
            }
            Column(Modifier.weight(1f)) {
                InfoCard(
                    color = Color(0xFFD0BCFF),
                    title = stringResource(R.string.image_composable),
                    description = stringResource(R.string.desc_two)
                )
            }

        }
        Row(Modifier.weight(1f)) {
            Column(Modifier.weight(1f)) {
                InfoCard(
                    color = Color(0xFFB69DF8),
                    title = stringResource(R.string.row_composable),
                    description = stringResource(R.string.desc_three)
                )
            }
            Column(Modifier.weight(1f)) {
                InfoCard(
                    color = Color(0xFFF6EDFF),
                    title = stringResource(R.string.column_composable),
                    description = stringResource(R.string.desc_four)
                )
            }
        }
    }
}

@Composable
fun InfoCard(color: Color, title: String, description: String)
{
    Column(
        modifier = Modifier
            .background(color)
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview3() {
    ExerciseTheme {
        Info()
    }
}