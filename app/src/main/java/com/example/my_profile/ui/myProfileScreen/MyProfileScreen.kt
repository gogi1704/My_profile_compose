package com.example.my_profile.ui.myProfileScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.my_profile.MainListData
import com.example.my_profile.ui.myProfileScreen.list.MyList
import com.example.my_profile.ui.myProfileScreen.mainBlock.ProfileMainBlock

class MyProfileScreen {

    @Composable
    fun ProfileScreen() {

        Column {
           ProfileMainBlock().MainBlock()
            MyList().MainList( listOf(
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