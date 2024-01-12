package com.example.myappcompose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignUp() {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Text(
            text = "Don't have an account", fontSize = 12.sp,
            color = Color(0xFFb5B5B5)
        )
        Text(
            text = "Sing up.",
            Modifier.padding(horizontal = 8.dp),
            fontSize = 12.sp,
            color = Color(0xFF4EA8E9),
            fontWeight = FontWeight.Bold
        )
    }
}