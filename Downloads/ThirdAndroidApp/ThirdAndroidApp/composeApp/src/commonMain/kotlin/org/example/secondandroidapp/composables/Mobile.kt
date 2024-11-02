@file:OptIn(ExperimentalComposeUiApi::class, ExperimentalComposeUiApi::class)

package org.example.secondandroidapp.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalWindowInfo

@Composable
fun IsMobile():Boolean {
    val window = LocalWindowInfo.current.containerSize
    return window.height >window.width
}
