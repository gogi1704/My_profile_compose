package com.example.my_profile.data.models

data class ExperienceModel(
    val title: String,
    val content: String,
    val start: String,
    val finish: String = "н.в",
    val link: String?
) : TypedContent()
