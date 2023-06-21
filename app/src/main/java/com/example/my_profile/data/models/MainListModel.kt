package com.example.my_profile.data.models

data class MainListModel(
    val name: String,
    val content:MainList
)

sealed class MainList()
