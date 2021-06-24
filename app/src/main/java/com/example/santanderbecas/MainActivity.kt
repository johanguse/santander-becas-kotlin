package com.example.santanderbecas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.santanderbecas.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainContent(){
    Scaffold(
        topBar = { Toolbar() },
        content = { BecasHomeContent() }
    )
}

@Composable
private fun BecasHomeContent(){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .background(color = Color.Red)
            .padding(15.dp, 0.dp)
    ) {
        Column () {
            Row() {
                Column() {
                    Text("Olá, Johan!", color = Color.White, modifier = Modifier.padding(bottom = 5.dp))
                }
            }
            Row() {
                Text("AG: 2030", color = Color.White, modifier = Modifier.padding(end = 18.dp))
                Text("CC: 01258469", color = Color.White)
            }
        }
    }
}


@Composable
private fun Toolbar() {
    TopAppBar(backgroundColor = Color.Red, elevation = 0.dp) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_menu),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.padding(0.dp, 15.dp)
            )
            Box(
                modifier = Modifier.padding(0.dp, 15.dp),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.santander_logo),
                    contentDescription = null,
                    tint = Color.White
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.ic_notification),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.padding(0.dp, 15.dp)
            )
        }
        
    }
}