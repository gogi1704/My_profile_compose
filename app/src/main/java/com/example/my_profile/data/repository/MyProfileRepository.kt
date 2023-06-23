package com.example.my_profile.data.repository

import com.example.my_profile.R
import com.example.my_profile.data.models.AboutMeModel
import com.example.my_profile.data.models.ContactModel
import com.example.my_profile.data.models.EducationModel
import com.example.my_profile.data.models.ExperienceModel
import com.example.my_profile.data.models.LanguageModel
import com.example.my_profile.data.models.ListType
import com.example.my_profile.data.models.MainListModel
import com.example.my_profile.data.models.QualityModel
import com.example.my_profile.data.models.SkillModel

class MyProfileRepository {

    fun getData():List<MainListModel> = listOf(
        MainListModel("Контакты" , ListType.CONTACT , getContacts()),
        MainListModel("Навыки" , ListType.SKILL , getSkills()),
        MainListModel("Опыт" , ListType.EXPERIENCE , getExperiences()),
        MainListModel("Образование" , ListType.EDUCATION , getEducations()),
        MainListModel("Языки" , ListType.LANGUAGE , getLanguages()),
        MainListModel("О себе" , ListType.ABOUT_ME , getAboutMe()),
        MainListModel("Качества" , ListType.QUALITY , getQualities()),
    )

    private fun getContacts(): List<ContactModel> = listOf(
        ContactModel("asd", R.drawable.icon_phone),
        ContactModel("asd", R.drawable.icon_phone),
        ContactModel("asdas", R.drawable.icon_phone)
    )

    private fun getSkills(): List<SkillModel> = listOf(
        SkillModel("Strong"),
        SkillModel("Strong"),
        SkillModel("Strong"),
        SkillModel("Strong"),
        SkillModel("Strong"),
        SkillModel("Strong"),
    )

    private fun getExperiences(): List<ExperienceModel> = listOf(
        ExperienceModel(
            title = "Андроид Разработчик в супер компании))",
            content = "efwef sdf sdfwef sdfwe4rt sdfw4 rtsdf4 wsdgf4e dg4 wdf4 sd ",
            start = "2023",
            link = "www.ru.com"
        ),
        ExperienceModel(
            title = "New exp",
            content = "efwef sdf sdfwef sdfwe4rt sdfw4 rtsdf4 wsdgf4e dg4 wdf4 sd ",
            start = "2003",
            finish = "1992",
            link = "www.ru.com"
        ),
        ExperienceModel(
            title = "New exp",
            content = "efwef sdf sdfwef sdfwe4rt sdfw4 rtsdf4 wsdgf4e dg4 wdf4 sd ",
            start = "",
            finish = "",
            link = "www.ru.com"
        ),
        ExperienceModel(
            title = "New exp",
            content = "efwef sdf sdfwef sdfwe4rt sdfw4 rtsdf4 wsdgf4e dg4 wdf4 sd ",
            start = "2003",
            finish = "1992",
            link = "www.ru.com"
        )
    )

    private fun getEducations(): List<EducationModel> = listOf(
        EducationModel("Донецкий тезникум (ДГТЭХТ)", "Юр фак" , "2012"),
        EducationModel("MГИМО", "Юр фак", "2012"),
        EducationModel("MГИМО", "Юр фак", "2012"),
        EducationModel("MГИМО", "Юр фак", "2012"),
        EducationModel("MГИМО", "Юр фак", "2012")
    )

    private fun getLanguages(): List<LanguageModel> = listOf(
        LanguageModel("English", "1"),
        LanguageModel("English", "1"),
        LanguageModel("English", "1")
    )

    private fun getAboutMe(): List<AboutMeModel> = listOf(AboutMeModel("About me"))

    private fun getQualities(): List<QualityModel> = listOf(
            QualityModel("Super man"),
            QualityModel("Super man"),
            QualityModel("Super man"),
            QualityModel("Super man")
        )
}