package com.example.my_profile.ui.myProfileScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.my_profile.data.MainListData
import com.example.my_profile.ui.myProfileScreen.profileList.MainProfileList
import com.example.my_profile.ui.myProfileScreen.mainBlock.ProfileMainBlock

class MyProfileScreen {

    @Composable
    fun ProfileScreen() {

        Column {
           ProfileMainBlock().MainBlock()
            MainProfileList().MainList( listOf(
                MainListData("Контакты"),
                MainListData("Навыки"),
                MainListData("Опыт работы"),
                MainListData("Образование"),
                MainListData("Курсы"),
                MainListData("Языки"),
                MainListData("О себе"),
                MainListData("Качества"),
            ))
        }

    }
}