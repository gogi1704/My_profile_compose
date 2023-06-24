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

    fun getData(): List<MainListModel> = listOf(
        MainListModel("Контакты", ListType.CONTACT, getContacts()),
        MainListModel("Навыки", ListType.SKILL, getSkills()),
        MainListModel("Опыт", ListType.EXPERIENCE, getExperiences()),
        MainListModel("Образование", ListType.EDUCATION, getEducations()),
        MainListModel("Языки", ListType.LANGUAGE, getLanguages()),
        MainListModel("О себе", ListType.ABOUT_ME, getAboutMe()),
        MainListModel("Качества", ListType.QUALITY, getQualities()),
    )

    private fun getContacts(): List<ContactModel> = listOf(
        ContactModel("7 928 621-33-41", R.drawable.icon_phone),
        ContactModel("zoralarionov@gmail.com", R.drawable.baseline_alternate_email_24),
        ContactModel("https://vk.com/id135747999", R.drawable.icon_vk),
        ContactModel(" https://t.me/l_george", R.drawable.icon_telegram),
        ContactModel("https://github.com/gogi1704 ", R.drawable.icon_github)
    )


    private fun getSkills(): List<SkillModel> = listOf(
        SkillModel("Android sdk"),
        SkillModel("Git"),
        SkillModel("ООП"),
        SkillModel("Retrofit 2"),
        SkillModel("JSON"),
        SkillModel("Gradle"),
        SkillModel("SQL"),
        SkillModel("SQLite"),
        SkillModel("Dagger - Hilt"),
        SkillModel("SOLID"),
        SkillModel("API"),
        SkillModel("MVVM"),
    )

    private fun getExperiences(): List<ExperienceModel> = listOf(
        ExperienceModel(
            title = "Учебный проект \"\" Good morning app\"\"",
            content = "• Работа с внешними API \n" +
                    "• Создание интерфейса с учётом UI/UX \n" +
                    "• Добавление новых функций \n" +
                    "• Оптимизация, баг-фиксинг, рефакторинг \n" +
                    "• Интеграция по API \n",
            start = "02.2023",
            link = "https://github.com/gogi1704/GoodMorningApp"
        ),
        ExperienceModel(
            title = "Дипломный проект в \"Нетология\" , направление \"Разработчик под Android\"",
            content = "• Оптимизация, баг-фиксинг, рефакторинг \n" +
                    "• Создание приложений по заказу \n" +
                    "• Интеграция по API \n" +
                    "• Создание интерфейса с учётом UI/UX \n" +
                    "• Добавление новых функций \n",
            start = "01.2023",
            finish = "02.2023",
            link = "https://github.com/gogi1704/linkedInAnalog"
        ),
        ExperienceModel(
            title = "Учебный проект в \"Нетологии\" , направление \"Разработчик под Android\" ",
            content = "• Создание интерфейса с учётом UI/UX \n" +
                    "• Добавление новых функций \n" +
                    "• Оптимизация, баг-фиксинг, рефакторинг \n" +
                    "• Интеграция по API \n",
            start = "08.2022",
            finish = "01.2023",
            link = "https://github.com/gogi1704/NMedia_HomeWorkAndroid "
        )
    )

    private fun getEducations(): List<EducationModel> = listOf(

        EducationModel(
            "Нетология",
            "  \"Андроид разработчик с нуля \"\n " +
                    " https://netology.ru/profile/program/an-29/schedule",
            "2023"
        ),
        EducationModel(
            "ДГТЭХТ Среднее спец.",
            "Машиностроение и материалообработка, Обслуживание и ремонт оборудования предприятий химической и нефтегазоперерабатывающей промышленности",
            "2015"
        ),
    )

    private fun getLanguages(): List<LanguageModel> = listOf(
        LanguageModel("Английский", "A2"),
        LanguageModel("Русский", "С2"),
        LanguageModel("Украинский", "С2")
    )

    private fun getAboutMe(): List<AboutMeModel> = listOf(AboutMeModel("About me"))

    private fun getQualities(): List<QualityModel> = listOf(
        QualityModel("Исполнительность"),
        QualityModel("Усидчивость"),
        QualityModel("Креативность"),
        QualityModel("Ответственность"),
        QualityModel("Пунктуальность"),
        QualityModel("Внимательность"),

        )

}