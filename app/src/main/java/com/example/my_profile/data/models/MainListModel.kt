package com.example.my_profile.data.models

data class MainListModel(
    val name: String,
    val type: ListType,
    val list: List<TypedContent>
)

sealed class ListType {
    object CONTACT : ListType()
    object SKILL : ListType()
    object QUALITY : ListType()
    object EDUCATION : ListType()
    object EXPERIENCE : ListType()
    object LANGUAGE : ListType()
    object ABOUT_ME : ListType()
}

sealed class TypedContent


