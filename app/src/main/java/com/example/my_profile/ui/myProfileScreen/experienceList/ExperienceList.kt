package com.example.my_profile.ui.myProfileScreen.experienceList

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_profile.data.models.ExperienceModel

class ExperienceList {
    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun Experiences(list: List<ExperienceModel>) {
        FlowColumn {
            for (item in list) {
                ExperienceItem(item)
            }
        }

    }

    @Composable
    private fun ExperienceItem(item: ExperienceModel) {
        Surface(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 4.dp, bottom = 4.dp, start = 12.dp, end = 12.dp),
            shape = Shapes().small
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 2.dp)
            ) {
                Row {

                    Text(item.title, fontSize = 24.sp, fontWeight = FontWeight.Bold ,modifier= Modifier.fillMaxWidth(0.8F))
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(item.start)
                        Text(item.finish)
                    }


                }
                Text(
                    item.content,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 4.dp)
                )
                if (!item.link.isNullOrEmpty()) {
                    Text(
                        item.link,
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Blue
                        ),
                        modifier = Modifier.align(Alignment.End)
                            .clickable {

                            }
                    )
                }

            }
        }


    }

    @Composable
    @Preview
    fun Prev() {
        (
                Experiences(
                    listOf(
                        ExperienceModel(
                            title = "New expмы аывацу выац ый йцвй вы ",
                            content = "efwef sdf sdfwef sdfwe4rt sdfw4 rtsdf4 wsdgf4e dg4 wdf4 sd ",
                            start = "2022",
                            link = "www.ru.com"
                        ),
                        ExperienceModel(
                            title = "New exp",
                            content = "efwef sdf sdfwef sdfwe4rt sdfw4 rtsdf4 wsdgf4e dg4 wdf4 sd ",
                            start = "2012",
                            finish = "2013",
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
                        )
                    )
                )
                )
    }
}