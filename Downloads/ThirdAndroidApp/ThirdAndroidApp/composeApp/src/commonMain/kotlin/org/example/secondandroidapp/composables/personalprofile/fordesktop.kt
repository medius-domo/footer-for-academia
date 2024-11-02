package org.example.secondandroidapp.composables.personalprofile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.draw.clip
import org.jetbrains.compose.resources.painterResource
import thirdandroidapp.composeapp.generated.resources.*
import thirdandroidapp.composeapp.generated.resources.Res
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.unit.sp
import org.example.secondandroidapp.composables.IsMobile


@Composable
fun PersonalProfileDesktop() {
    val defaultBackground = Color(0xFF333540)
    var isHovered by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .height(500.dp)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
         Column(
            modifier = Modifier
                .width(760.dp)
                .padding(top = 50.dp)
                .background(defaultBackground, shape = RoundedCornerShape(20.dp))
                .clip(RoundedCornerShape(20.dp))
                .border(
                    width = 1.dp,
                    color = Color.Gray,
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(30.dp)
                .offset(x = (101.4).dp),
            horizontalAlignment = Alignment.Start,
        ) {

            if (!IsMobile()) Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp),
                contentAlignment = Alignment.TopEnd
            ) {
                Button(
                    onClick = { /* Handle Edit Profile Click */ },
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    modifier = Modifier
                        .height(36.dp)
                        .offset(x = (-95.4).dp)
                ) {
                    Text(
                        text = "Edit Profile",
                        color = Color.Black,
                        fontSize = 18.sp,
                        style = MaterialTheme.typography.body2
                    )
                }
            }
            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Amani Hamduni",
                style = MaterialTheme.typography.h6,
                color = Color.White,
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(top = 8.dp)
                    .offset(x = (-65.4).dp)
                    .offset(y = (-45.6).dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            if (!IsMobile()) Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .offset(x = (-65.4).dp)
                    .offset(y = (-45.6).dp)
            ) {
                Image(
                    painter = painterResource(Res.drawable.user_full_view),
                    contentDescription = "Icon Image",
                )
                Spacer(
                    modifier = Modifier
                        .width(4.dp)
                )
                Text(
                    text = "Headmaster",
                    color = Color(0xFF676A6F),
                    fontSize = 18.sp
                )
                Spacer(
                    modifier = Modifier
                        .width(8.dp)
                )
                Image(
                    painter = painterResource(Res.drawable.calendar),
                    contentDescription = "date icon ",
                )
                Spacer(
                    modifier = Modifier
                        .width(4.dp)
                )
                Text(
                    text = "Created 16 August 2024",
                    color = Color(0xFF676A6F),
                    fontSize = 18.sp
                )
            }
            if (IsMobile()) Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .offset(x = (-65.4).dp)
                    .offset(y = (-45.6).dp)
            ) {
                Row(
                    modifier = Modifier
                        .offset(x = (-55).dp)
                        .offset(y = (-5).dp)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.user_full_view),
                        contentDescription = "Icon Image",
                    )
                    Spacer(
                        modifier = Modifier
                            .width(4.dp)
                    )
                    Text(
                        text = "Headmaster",
                        color = Color(0xFF676A6F),
                        fontSize = 18.sp
                    )

                }
                Spacer(
                    modifier = Modifier
                        .width(8.dp)
                )
                Row(
                    modifier = Modifier
                        .offset(y = (5).dp)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.calendar),
                        contentDescription = "date icon ",
                    )
                    Spacer(
                        modifier = Modifier
                            .width(4.dp)
                    )
                    Text(
                        text = "Created 16 August 2024",
                        color = Color(0xFF676A6F),
                        fontSize = 18.sp
                    )
                }

            }
            Spacer(modifier = Modifier.height(32.dp))

            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .offset(x = (-65.4).dp)
                        .offset(y = (-45.6).dp)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.email),
                        contentDescription = "email icon",
                        contentScale = ContentScale.Crop,
                    )
                    Spacer(
                        modifier = Modifier.width(4.dp)
                    )
                    Text(
                        text = "amanihamduni@gmail.com",
                        color = Color.White,
                        fontSize = 17.sp
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    modifier = Modifier
                        .offset(x = (-40).dp)
                        .offset(y = (-45.6).dp),
                    text = "hamduni45@gmail.com",
                    color = Color.White,
                    fontSize = 17.sp,
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .offset(x = (-72.4).dp)
                        .offset(y = (-45.6).dp)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.call_02),
                        contentDescription = "Phone Icon",
                    )

                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "+255712333221",
                        color = Color.White,
                        fontSize = 18.sp
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    modifier = Modifier
                        .offset(x = (-42).dp)
                        .offset(y = (-45.6).dp),
                    text = "+255754502654",
                    color = Color.White,
                    fontSize = 18.sp
                )
                if (IsMobile()) Box(
                    modifier = Modifier
                        .width(700.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Button(
                        onClick = { /* Handle Edit Profile Click */ },
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                        modifier = Modifier
                            .height(36.dp)
                            .width(1000.dp)
                            .offset(x = (-95.4).dp)
                    ) {
                        Text(
                            text = "Edit Profile",
                            color = Color.Black,
                            fontSize = 18.sp,
                            style = MaterialTheme.typography.body2
                        )
                    }
                }
            }
        }
        if (!IsMobile()) Box(
            modifier = Modifier
                .offset(x = (-230.4).dp)
                .offset(y = (-170.6).dp)
                .size(150.dp)
                .clip(CircleShape)
                .pointerInput(Unit) {
                    awaitPointerEventScope {
                        while (true) {
                            val event = awaitPointerEvent()
                            isHovered = when (event.type) {
                                PointerEventType.Enter -> true
                                PointerEventType.Exit -> false
                                else -> isHovered
                            }
                        }
                    }
                },
            contentAlignment = Alignment.TopStart,
        )
        {

            Image(
                painter = painterResource(Res.drawable.dp_user_account),
                contentDescription = "Headmaster Image",
                modifier = Modifier
                    .fillMaxSize()
            )
            if (isHovered) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xAA000000), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.email),
                            contentDescription = "email icon",
                            contentScale = ContentScale.Crop,
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Change Photo",
                            color = Color.White,
                            style = MaterialTheme.typography.body2
                        )
                    }
                }
            }
        }
        if (IsMobile()) Box(
            modifier = Modifier
                .offset(x = (-110.4).dp)
                .offset(y = (-190.6).dp)
                .size(90.dp)
                .clip(CircleShape)
                .pointerInput(Unit) {
                    awaitPointerEventScope {
                        while (true) {
                            val event = awaitPointerEvent()
                            isHovered = when (event.type) {
                                PointerEventType.Enter -> true
                                PointerEventType.Exit -> false
                                else -> isHovered
                            }
                        }
                    }
                },
            contentAlignment = Alignment.TopStart,
        )
        {
            Image(
                painter = painterResource(Res.drawable.dp_user_account),
                contentDescription = "Headmaster Image",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape)
            )
            if (isHovered) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xAA000000), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.email),
                            contentDescription = "email icon",
                            contentScale = ContentScale.Crop,
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            modifier = Modifier,
                            fontSize = 13.sp,
                            text = "Change Photo",
                            color = Color.White,
                            style = MaterialTheme.typography.body2
                        )
                    }
                }
            }
        }

    }

}
