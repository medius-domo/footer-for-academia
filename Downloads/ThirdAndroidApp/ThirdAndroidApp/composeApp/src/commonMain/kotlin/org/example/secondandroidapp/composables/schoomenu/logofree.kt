package org.example.secondandroidapp.composables.schoome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage


@Composable
fun logofree() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ){
        val defaultBackground = Color(0xFF333540)
        Column(
            modifier = Modifier
                .width(300.dp)
                .padding(10.dp)
                .background(defaultBackground, shape = RoundedCornerShape(20.dp))
                .clip(RoundedCornerShape(20.dp)),
            horizontalAlignment = Alignment.Start
        ){

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(defaultBackground),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                AsyncImage(
                    modifier = Modifier
                        .size(48.dp)
                        .padding(end = 16.dp),
                    model = "https://purple.academia.ne.tz/assets/logo.png",
                    contentDescription = null,
                )

                Column(
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Kilimo Kijani Sec",
                        fontSize = 15.sp,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Free",
                        fontSize = 15.sp,
                        color = Color (0xFF487BA7),
                        modifier = Modifier
                            .padding(start = 6.dp)
                            .background(Color(0xFF242D41), shape = RoundedCornerShape(10.dp))
                    )
                }
            }

        }
    }
}
