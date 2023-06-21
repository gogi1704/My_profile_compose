package com.example.my_profile.ui.myProfileScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.my_profile.ui.myProfileScreen.mainBlock.ProfileMainBlock

class MyProfileScreen {

    @Composable
    fun ProfileScreen() {

        Column {
           ProfileMainBlock().MainBlock()
        }

    }
}