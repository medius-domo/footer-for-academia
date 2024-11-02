package org.example.secondandroidapp.composables.schoomenu

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
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import org.jetbrains.compose.resources.painterResource
import thirdandroidapp.composeapp.generated.resources.*
import thirdandroidapp.composeapp.generated.resources.Res
import thirdandroidapp.composeapp.generated.resources.Subscriptions


@Composable
fun SchoolNameEmailLogo() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ) {
        val defaultBackground = Color(0xFF333540)
        Column(
            modifier = Modifier
                .width(360.dp)
                .background(defaultBackground, shape = RoundedCornerShape(20.dp))
                .clip(RoundedCornerShape(20.dp)),
            horizontalAlignment = Alignment.Start
        ) {
            var isHovered by remember { mutableStateOf(false) }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(if (isHovered) Color.Gray.copy(alpha = 0.2f) else defaultBackground)
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
                        text = "Kilimokijani Secondary School..",
                        fontSize = 15.sp,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "kilimokijan@academia.co.tz",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                }
            }

            DividerLine()
            var Hovered by remember { mutableStateOf(false) }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .width(10.dp)
                    .padding(1.dp)
                    .height(70.dp)
                    .background(if (Hovered) Color.Gray.copy(alpha = 0.2f) else defaultBackground)
                    .pointerInput(Unit) {
                        awaitPointerEventScope {
                            while (true) {
                                val event = awaitPointerEvent()
                                Hovered = when (event.type) {
                                    PointerEventType.Enter -> true
                                    PointerEventType.Exit -> false
                                    else -> Hovered
                                }
                            }
                        }

                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(Res.drawable.Subscriptions),
                    contentDescription = "",
                    modifier = Modifier
                        .size(85.dp)
                        .padding(start = 60.dp)
                )
                Text(
                    text = "Subscription",
                    fontSize = 15.sp,
                    color = if (Hovered) Color.White else Color.Gray,
                    modifier = Modifier
                        .padding(start = 8.dp)
                )
                Text(
                    text = "Free",
                    fontSize = 15.sp,
                    color = Color(0xFF487BA7),
                    modifier = Modifier
                        .padding(start = 6.dp)
                        .background(Color(0xFF242D41), shape = RoundedCornerShape(10.dp))
                )
            }
            DividerLine()
            var whenHovered by remember { mutableStateOf(false) }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .width(20.dp)
                    .height(70.dp)
                    .background(if (whenHovered) Color.Gray.copy(alpha = 0.2f) else defaultBackground)
                    .pointerInput(Unit) {
                        awaitPointerEventScope {
                            while (true) {
                                val event = awaitPointerEvent()
                                whenHovered = when (event.type) {
                                    PointerEventType.Enter -> true
                                    PointerEventType.Exit -> false
                                    else -> whenHovered
                                }
                            }
                        }
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(Res.drawable.ChangeSchool),
                    contentDescription = "",
                    modifier = Modifier
                        .size(85.dp)
                        .padding(start = 60.dp)
                )
                Text(
                    text = "Change School ",
                    fontSize = 15.sp,
                    color = if (whenHovered) Color.White else Color.Gray,
                    modifier = Modifier
                        .padding(start = 6.dp)
                )
            }
        }
    }
}

@Composable
fun DividerLine() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(Color.Gray)
    )
}