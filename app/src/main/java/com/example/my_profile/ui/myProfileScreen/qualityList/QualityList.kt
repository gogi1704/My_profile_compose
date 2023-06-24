package com.example.my_profile.ui.myProfileScreen.qualityList

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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_profile.R
import com.example.my_profile.data.models.QualityModel

class QualityList {

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun Qualities(list: List<QualityModel>) {

        FlowRow {
            for (item in list) {
                QualityItem(item)
            }
        }

    }

    @Composable
    private fun QualityItem(item: QualityModel) {


        Surface(
            modifier = Modifier.fillMaxWidth(0.5F).padding(end = 4.dp, bottom = 4.dp),
            shape = Shapes().small
        ) {
            Row(modifier = Modifier.padding(start = 12.dp, end = 12.dp)) {
                Image(
                    ImageVector.vectorResource(R.drawable.baseline_circle_24),
                    contentDescription = null,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Text(
                    item.quality,
                    style = TextStyle(fontSize = 16.sp),
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }

    }


}