package com.example.my_profile.ui.myProfileScreen.skillList

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_profile.R
import com.example.my_profile.data.models.SkillModel

class SkillList {

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun Skills(list: List<SkillModel>) {

        FlowRow(maxItemsInEachRow = 2) {
            for (item in list) {
                SkillItem(item)
            }
        }


    }

    @Composable
    fun SkillItem(item: SkillModel) {

        Surface(modifier = Modifier.fillMaxWidth(0.5F).padding(end = 4.dp , bottom = 4.dp) , shape = Shapes().small ) {
            Row(modifier = Modifier.padding(start = 12.dp, end = 12.dp)) {
                Image(
                    ImageVector.vectorResource(R.drawable.baseline_circle_24),
                    contentDescription = null,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Text(item.title, style = TextStyle(fontSize = 24.sp) , modifier = Modifier.padding(start = 8.dp))
            }
        }


    }

    @Composable
    @Preview
    fun Prev() {
        Skills(
            listOf(
                SkillModel("dwdwdwdwdw"),
                SkillModel("dwdwdwdwdw"),
                SkillModel("dwdwdwdwdw"),
                SkillModel("dwdwdwdwdw"),
                SkillModel("dwdwdwdwdw"),
                SkillModel("dwdwdwdwdw")
            )
        )
    }
}