package com.example.tugas7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx. compose. ui. unit. sp
import com.example.tugas7.ui.theme.Tugas7Theme
import androidx. compose. material3.ButtonDefaults
import androidx.compose.ui.res.colorResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tugas7Theme {
                Scaffold { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        LoginScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = "login image",
            modifier = Modifier.size(320.dp)
        )

        Text(text = "Welcome", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Login to your account")

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Email")
        })

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Password")
        })

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {  },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFBD51AE)
            )) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "Forgot password?", modifier = Modifier.clickable {

        })

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Or sign in with")

        Spacer(modifier = Modifier.height(8.dp))

        Row (
            modifier = Modifier.wrapContentWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "google",
                modifier = Modifier.size(35.dp).clickable {
                    // google clicked
                }
            )

            Image(
                painter = painterResource(id = R.drawable.ig),
                contentDescription = "ig",
                modifier = Modifier.size(35.dp).clickable {
                    // ig clicked
                }
            )

            Image(
                painter = painterResource(id = R.drawable.tiktok),
                contentDescription = "tiktok",
                modifier = Modifier.size(38.dp).clickable {
                    // tiktok clicked
                }
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    Tugas7Theme {
        LoginScreen()
    }
}