package com.example.profilepage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilepage.ui.theme.ProfilePageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfilePageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    Card(modifier = Modifier.padding(16.dp).wrapContentSize(),
        elevation = 20.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(16.dp)
        ) {
        Column(modifier = Modifier.wrapContentSize().padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.android_toy_image), contentDescription = "android toy image",
                modifier = Modifier
                    .size(150.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = CircleShape
                    ).clip(CircleShape).padding(8.dp)
            )

            Text(text = "Abhijit Puri", fontSize = 24.sp, color = Color.Black, fontWeight = FontWeight.Bold)

            Row(modifier = Modifier.fillMaxWidth().padding(top = 8.dp), horizontalArrangement =
            Arrangement.SpaceEvenly) {
                Column {
                    Text(text = "100")
                    Text(text = "Followers", fontWeight = FontWeight.Bold)
                }

                Column {
                    Text(text = "100")
                    Text(text = "Following", fontWeight = FontWeight.Bold)
                }
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp), horizontalArrangement =
            Arrangement.SpaceEvenly) {
                Button(onClick = { /*TODO*/ }) {
                    Text("Follow")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text("Message")
                }
            }
        }
    }
}

@Preview()
@Composable
fun MyAppPreview() {
    MyApp()
}
