package org.example.secondandroidapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform