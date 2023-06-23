package com.example.my_profile.ui.myProfileScreen.aboutMeInfo

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_profile.data.models.AboutMeModel

class AboutMeInfo {

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun AboutMe(list: List<AboutMeModel>) {

        FlowRow {
            for (item in list) {
                Surface(
                    modifier = Modifier.fillMaxWidth()
                        .padding(top = 4.dp, start = 12.dp, end = 12.dp, bottom = 4.dp),
                    shape = Shapes().small
                ) {

                    Text(
                        item.content, fontSize = 20.sp, modifier = Modifier.fillMaxWidth()
                            .padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 2.dp)
                    )

                }
            }
        }


    }
}