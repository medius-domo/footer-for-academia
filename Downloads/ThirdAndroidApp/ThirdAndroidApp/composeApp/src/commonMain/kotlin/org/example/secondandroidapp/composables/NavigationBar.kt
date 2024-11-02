package org.example.secondandroidapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpace
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import thirdandroidapp.composeapp.generated.resources.Res




@Composable
fun NavigationBar(onNavItemClicked: (String) -> Unit) {
    Row(
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        NavButtons("Home",onNavItemClicked)
        NavButtons("Portfolio",onNavItemClicked)
        NavButtons("About",onNavItemClicked)
        NavButtons("Contact",onNavItemClicked)
        NavButtons("Education",onNavItemClicked)
    }
}

@Composable
fun NavButtons(text: String,onClick: (String) -> Unit) {
    Button(
        onClick = { onClick(text) },
        modifier = Modifier.padding(horizontal = 8.dp)  // Adds space between buttons
    ) {
        Text(
            text = text,
            fontSize = 16.sp,  // Adjust text size
            color = Color.White  // Make text color contrast with the button background
        )
    }
}
