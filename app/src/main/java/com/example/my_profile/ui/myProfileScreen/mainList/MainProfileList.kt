package com.example.my_profile.ui.myProfileScreen.mainList

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_profile.data.models.AboutMeModel
import com.example.my_profile.data.models.ContactModel
import com.example.my_profile.data.models.EducationModel
import com.example.my_profile.data.models.ExperienceModel
import com.example.my_profile.data.models.LanguageModel
import com.example.my_profile.data.models.ListType
import com.example.my_profile.data.models.MainListModel
import com.example.my_profile.data.models.SkillModel
import com.example.my_profile.ui.myProfileScreen.aboutMeInfo.AboutMeInfo
import com.example.my_profile.ui.myProfileScreen.contactList.Contacts
import com.example.my_profile.ui.myProfileScreen.educationList.EducationList
import com.example.my_profile.ui.myProfileScreen.experienceList.ExperienceList
import com.example.my_profile.ui.myProfileScreen.languageList.LanguageList
import com.example.my_profile.ui.myProfileScreen.skillList.SkillList

class MainProfileList {

    @Composable
    fun MainList(list: List<MainListModel>) {

        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(list) { item ->
                MainListItem(item)
            }
        }

    }


    @Composable
    fun MainListItem(item: MainListModel) {
        val isClickedState = remember {
            mutableStateOf(false)
        }

        Card(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp, start = 8.dp, end = 8.dp)
                .clickable {
                    isClickedState.value = !isClickedState.value
                }, shape = Shapes().extraSmall, elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text(
                    item.name,
                    style = TextStyle(fontSize = 32.sp, fontWeight = FontWeight.ExtraBold),
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
            if (isClickedState.value) {
                when (item.type) {
                    ListType.CONTACT -> Contacts().ContactList(item.list as List<ContactModel>)
                    ListType.QUALITY -> TODO()
                    ListType.SKILL -> SkillList().Skills(item.list as List<SkillModel>)
                    ListType.ABOUT_ME -> AboutMeInfo().AboutMe(item.list as List<AboutMeModel>)
                    ListType.EDUCATION -> EducationList().Educations(item.list as List<EducationModel>)
                    ListType.EXPERIENCE -> ExperienceList().Experiences(item.list as List<ExperienceModel>)
                    ListType.LANGUAGE -> LanguageList().Languagies(item.list as List<LanguageModel>)
                }

            }


        }


    }

    @Preview
    @Composable
    fun Preview() {
//        MainList(
//            listOf(
//                MainListModel("qwd"),
//                MainListModel("SFWEF"),
//                MainListModel("qwZXCZd"),
//                MainListModel("qwSDFSDFd"),
//                MainListModel("qASDwd"),
//                MainListModel("qEFSwd"),
//            )
//        )
    }
}