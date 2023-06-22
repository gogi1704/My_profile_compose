package com.example.my_profile.ui.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.my_profile.R
import com.example.my_profile.data.models.ContactModel
import com.example.my_profile.data.models.ListType
import com.example.my_profile.data.models.MainListModel
import com.example.my_profile.data.models.QualityModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyProfileViewModel @Inject constructor(application: Application) :
    AndroidViewModel(application) {

    val list = listOf(
        MainListModel(
            "Контакты",
            ListType.CONTACT,
            listOf(
                ContactModel("asd", R.drawable.icon_phone),
                ContactModel("asd", R.drawable.icon_phone),
                ContactModel("asdas", R.drawable.icon_phone)
            )
        ),
        MainListModel(
            "Навыки",
            ListType.QUALITY,
            listOf(
                QualityModel("Strong"),
                QualityModel("Strong"),
                QualityModel("Strong"),
                QualityModel("Strong"),
                QualityModel("Strong"),
                QualityModel("Strong"),
            )
        ),
        MainListModel("Контакты", ListType.CONTACT, listOf()),
    )

}