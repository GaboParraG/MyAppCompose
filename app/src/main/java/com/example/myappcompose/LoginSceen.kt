package com.example.myappcompose

import android.app.Activity
import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {

    Box(
        Modifier
            .fillMaxSize()
            .padding(8.dp)) {
        Header(Modifier.align(Alignment.TopEnd))
        Body(Modifier.align(Alignment.Center))
        Footer()
    }

}

@Composable
fun Footer() {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Body(modifier: Modifier) {
    var email by rememberSaveable {
        mutableStateOf("")
    }
    var password by rememberSaveable {
        mutableStateOf("")
    }

    Column(modifier = modifier) {
        Image(painter = painterResource(id = R.drawable.insta), contentDescription = "LogoInst")
        Spacer(modifier = Modifier.size(16.dp))
        TextField(value = email, onValueChange = {email = it})
        Spacer(modifier = Modifier.size(4.dp))
        TextField(value = password, onValueChange = {password = it})
        Spacer(modifier = Modifier.size(8.dp))
        Text(text = "Forgot password?", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color(0xFF4EA8E9))
    }


}

@Composable
fun Header(modifier: Modifier) {
    val activity = LocalContext.current as Activity
    Icon(imageVector = Icons.Default.Close, contentDescription = "close app", modifier = modifier.clickable { activity.finish()})
}
