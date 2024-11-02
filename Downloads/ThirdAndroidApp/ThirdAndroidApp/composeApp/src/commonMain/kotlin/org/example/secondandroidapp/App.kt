package org.example.secondandroidapp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.example.secondandroidapp.composables.*
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import thirdandroidapp.composeapp.generated.resources.Res
import thirdandroidapp.composeapp.generated.resources.compose_multiplatform
import java.awt.Color

//


//@Composable
//@Preview
//fun App() {
//    MaterialTheme {
//        var showContent by remember { mutableStateOf(false) }
//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Button(onClick = { showContent = !showContent }
//            ) {
//                Text("Click here")
//
//            }
//            AnimatedVisibility(showContent ) {
//                val greeting = remember { Greeting().greet() }
//                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//                    Image(painterResource(Res.drawable.compose_multiplatform), null)
//                    Text("Compose: $greeting"  )
//                }
//            }
//        }
//    }
//    Text("Hello ,World")
//}



@Composable
fun App() {
    MaterialTheme {

        // State to track which page is currently displayed
        var currentPage by remember { mutableStateOf("Home") }
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            NavigationBar(onNavItemClicked = { page ->
                currentPage = page  // Set the current page based on the button clicked
            })
            // Display the respective page based on the current page
            when (currentPage) {
                "Home" -> HomePage()
                "Portfolio" -> PortfolioPage()
                "About" -> AboutPage()
                "Contact" -> ContactPage()
                "Education" -> EducationPage()
            }
            ProfilePicture()
        }
    }
}
