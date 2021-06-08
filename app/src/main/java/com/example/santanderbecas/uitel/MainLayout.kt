package com.example.santanderbecas.uitel

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MainLayout(){
    Column {
        MainToolBar()
    }
}

@Composable
fun MainToolBar(){
    TopAppBar (
        title = {Text(text = "Santander")},
        backgroundColor = Color.Red,
        contentColor = Color.White
    )

}