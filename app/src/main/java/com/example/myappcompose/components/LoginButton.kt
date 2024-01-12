package com.example.myappcompose.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun LoginButton(loginEnable: Boolean) {
    Button(
        onClick = { },
        enabled = loginEnable,
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            disabledContentColor = Color.White,
            containerColor = Color(0xFF4EA8E9),
            disabledContainerColor =  Color(0xFF78C8F9)

        )
    ) {
        Text(text = "Log In")
    }
}