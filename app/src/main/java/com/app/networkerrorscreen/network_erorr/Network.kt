package com.app.networkerrorscreen.network_erorr

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.networkerrorscreen.R

@ExperimentalMaterial3Api
@Composable
fun NetworkErrorScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.network),
            contentDescription = "Network Error",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Something Went Wrong..",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Network Error",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(150.dp))

Box(
    modifier =Modifier
        .fillMaxWidth(0.75f)
        .height(48.dp)
        .border(
            width = 2.dp,
            color = Color.Green,
            shape = RoundedCornerShape(4.dp)
        ),
    contentAlignment = Alignment.Center
){
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxSize(),
        shape = RoundedCornerShape(4.dp),
        colors = androidx.compose.material3.ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFFFFFF)
        )
    ) {
        Text(
            text = "RETRY",
            fontSize = 16.sp,
            color = Color.Green
        )
            }
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun PreviewNetworkErrorScreen() {
    NetworkErrorScreen()
}


