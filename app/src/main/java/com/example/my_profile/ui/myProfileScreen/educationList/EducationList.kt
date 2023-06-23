package com.example.my_profile.ui.myProfileScreen.educationList

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_profile.R
import com.example.my_profile.data.models.EducationModel

class EducationList {

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun Educations(list: List<EducationModel>) {
        FlowColumn {
            for (item in list) {
                EducationItem(item)
            }
        }
    }

    @Composable
    private fun EducationItem(item: EducationModel) {

        val isClicked = remember {
            mutableStateOf(false)
        }

        Surface(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 4.dp, start = 12.dp, end = 12.dp, bottom = 4.dp),
            shape = Shapes().small
        ) {
            Column(Modifier.fillMaxWidth()) {

                Row(modifier = Modifier.fillMaxWidth().clickable {
                    isClicked.value = !isClicked.value
                }) {
                    Text(
                        item.place, fontSize = 22.sp,
                        fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 8.dp),
                    )
                    Image(
                        ImageVector.vectorResource(R.drawable.baseline_keyboard_arrow_down_24),
                        contentDescription = null, modifier = Modifier.padding(start = 16.dp)
                    )
                }

                if (isClicked.value) {
                    Spacer(modifier = Modifier.size(height = 1.dp , width = 300.dp).background(Color.DarkGray).align(Alignment.CenterHorizontally).padding(4.dp))
                    Box(modifier = Modifier.fillMaxWidth().clickable {
                        isClicked.value = !isClicked.value
                    }) {
                        Text(
                            item.speciality, fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 8.dp, end = 8.dp)
                        )
                    }
                    Text(
                        item.finish, fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(Alignment.End).padding(end = 8.dp)
                    )


                }

            }


        }


    }


}