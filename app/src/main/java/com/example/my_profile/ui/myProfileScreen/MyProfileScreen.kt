package com.example.my_profile.ui.myProfileScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.my_profile.ui.myProfileScreen.mainBlock.ProfileMainBlock
import com.example.my_profile.ui.myProfileScreen.profileList.MainProfileList
import com.example.my_profile.ui.viewModel.MyProfileViewModel

class MyProfileScreen {

    @Composable
    fun ProfileScreen(viewModel: MyProfileViewModel) {

        Column {
            ProfileMainBlock().MainBlock()
            MainProfileList().MainList(viewModel.list)
        }

    }
}