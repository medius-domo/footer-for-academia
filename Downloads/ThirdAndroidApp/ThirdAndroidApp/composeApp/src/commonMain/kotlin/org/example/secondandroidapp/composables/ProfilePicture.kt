package org.example.secondandroidapp.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import thirdandroidapp.composeapp.generated.resources.Res
import thirdandroidapp.composeapp.generated.resources.compose_multiplatform

@Composable
fun ProfilePicture(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color =  Color.White
            )
            .verticalScroll(state = rememberScrollState(0)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        ProfileDetails(pictureWidth = 500, pictureHeight = 500)
        ProfileDetails(pictureWidth = 500, pictureHeight = 500)
        ProfileDetails(pictureWidth = 500, pictureHeight = 500)
        ProfileDetails(pictureWidth = 500, pictureHeight = 500)
        ProfileDetails(pictureWidth = 500, pictureHeight = 500)
    }
}

@Composable
fun ProfileDetails(
    pictureWidth:Int=100,
    pictureHeight:Int=100
){
    Image(
        painter = painterResource(Res.drawable.compose_multiplatform),
        contentDescription = "",
        modifier = Modifier
            .width(pictureWidth.dp)
            .height(pictureHeight.dp)
    )
    Text(
        text = "compose logo",
        fontSize = 25.sp,
        color = Color.Blue,
        fontWeight = FontWeight.Bold,
    )
}