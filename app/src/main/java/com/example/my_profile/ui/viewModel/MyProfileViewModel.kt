package com.example.my_profile.ui.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.my_profile.data.repository.MyProfileRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyProfileViewModel @Inject constructor(application: Application) :
    AndroidViewModel(application) {
    //TODO hilt
    val repository = MyProfileRepository()

    val data = repository.getData()

}