package com.example.social_app.data

// Every user will have a Unique UserID (generated by Firebase Auth)
data class User(
    val fullName: String = "",
    val email: String = "",
    val about: String = "",
    var profilePic: String = "",
    val followers: MutableList<String> = mutableListOf(),
    val followings: MutableList<String> = mutableListOf(),
    val posts: MutableList<String> = mutableListOf()
)