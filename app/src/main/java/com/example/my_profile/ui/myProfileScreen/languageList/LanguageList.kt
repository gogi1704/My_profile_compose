package com.example.my_profile.ui.myProfileScreen.languageList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_profile.data.models.LanguageModel

class LanguageList {

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun Languagies(list: List<LanguageModel>) {

        FlowRow(maxItemsInEachRow = 2) {
            for (item in list) {
                LanguageItem(item)
            }
        }

    }

    @Composable
    private fun LanguageItem(item: LanguageModel) {

        Surface(
            modifier = Modifier.fillMaxWidth(0.5F).padding(top = 4.dp, start = 12.dp, end = 12.dp, bottom = 4.dp),
            shape = Shapes().small
        ) {
            Row(modifier = Modifier.padding(8.dp)) {

                Box(
                    modifier = Modifier.background(shape = CircleShape, color = Color.Black)
                        .size(44.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(item.level ,  style = TextStyle(color = Color.White , fontSize = 24.sp))
                }

                Text(
                    item.language,
                    modifier = Modifier.padding(start = 12.dp).align(Alignment.CenterVertically)
                )


            }
        }


    }

    @Composable
    @Preview
    fun Pre() {
        LanguageItem(LanguageModel("English", "A1"))
    }
}