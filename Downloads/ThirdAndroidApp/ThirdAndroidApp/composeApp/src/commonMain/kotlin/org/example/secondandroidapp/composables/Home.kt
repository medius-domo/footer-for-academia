package org.example.secondandroidapp.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.example.secondandroidapp.composables.personalprofile.PersonalProfileDesktop
import org.example.secondandroidapp.composables.schoome.logofree
import org.example.secondandroidapp.composables.schoomenu.SchoolNameEmailLogo
import org.example.secondandroidapp.composables.searchbar.SearchBar


@Composable
fun HomePage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .border(
                BorderStroke(
                    width = 1.dp,
                    color = Color.Black
                )
            )
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        SearchBar()
        logofree()
        SchoolNameEmailLogo()
        PersonalProfileDesktop()
        // Hero Section
        HeroSection()

        Spacer(modifier = Modifier.height(24.dp))

        // Skills Section
        SkillsSection()

        Spacer(modifier = Modifier.height(24.dp))

        // Projects Section
        // ProjectsSection()

        Spacer(modifier = Modifier.height(24.dp))

        // Contact & Social Links Section
        // ContactSection()
    }
}

@Composable
fun HeroSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Hello, I'm Medius!", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Text("Front-End Developer | HTML, CSS, JavaScript, Kotlin,php", fontSize = 18.sp, color = Color.Gray)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /* Navigate to Portfolio */ }) {
            Text("View My Work")
        }
    }
}

@Composable
fun SkillsSection() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Skills", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            listOf("HTML", "CSS", "JavaScript", "Kotlin", "php").forEach { skill ->
                Text(skill)
            }
        }
    }
}

// Further composable functions for ProjectsSection and ContactSection
//SearchBar
//@Composable
//fun SearchBar() {
//    // Mutable state for holding the text input
//    var searchText by remember { mutableStateOf("") }
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth(),
//        horizontalArrangement = Arrangement.Center
//    ) {
//        TextField(
//            value = searchText,
//            onValueChange = { searchText = it },
//            placeholder = { Text("Search Accademia") },
//            modifier = Modifier
//                .width(300.dp)
//                .height(60.dp)
//                .border(2.dp, Color.Black),
//            colors = TextFieldDefaults.textFieldColors(
//                backgroundColor = Color.Transparent,
//                focusedIndicatorColor = Color.Blue,
//                unfocusedIndicatorColor = Color.Transparent,
//            ),
//            singleLine = true,
//            trailingIcon = {
//                Row(
//                    modifier = Modifier
//                        .width(40.dp),
//                    horizontalArrangement = Arrangement.SpaceAround,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    // Vertical line before the search icon
//                    Box(
//                        modifier = Modifier
//                            .fillMaxHeight()
//                            .width(2.dp)
//                            .background( Color.Black)
//                    )
//
//                    // Search icon
//                    Icon(
//                        imageVector = Icons.Default.Search,
//                        contentDescription = "Search Icon",
//                        tint = Color.Gray
//                    )
//                }
//            }
//        )
//    }
//}






