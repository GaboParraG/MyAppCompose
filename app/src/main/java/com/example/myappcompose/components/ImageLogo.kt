package com.example.myappcompose.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.myappcompose.R

@Composable
fun ImageLogo(modifier: Modifier) {
    Image(painter = painterResource(id = R.drawable.insta), contentDescription = "LogoInst",modifier)
}