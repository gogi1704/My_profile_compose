package com.example.my_profile.ui.myProfileScreen.mainBlock

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_profile.R

class ProfileMainBlock {


    @Composable
    fun MainBlock() {


        Surface(modifier = Modifier.fillMaxWidth()) {
            Row {
                Image(
                    ImageVector.vectorResource(R.drawable.ic_launcher_foreground),
                    contentDescription = "Profile photo",
                    modifier = Modifier.padding(top = 8.dp, start = 8.dp)
                )

                Column(Modifier.padding(8.dp).fillMaxWidth()) {
                    Text("Ларионов Георгий Юрьевич" , style = TextStyle(fontSize = 24.sp , fontWeight = FontWeight.Bold))
                    Spacer(Modifier.padding(4.dp))
                    Text("Андроид разработчик" , style = TextStyle(fontSize = 12.sp))
                    Spacer(Modifier.padding(4.dp))
                    Row(modifier = Modifier.padding(start = 8.dp)) {
                        Image(
                            imageVector = ImageVector.vectorResource(R.drawable.baseline_location_on_24),
                            contentDescription = "location"
                        )
                        Text("Ростов-на-Дону", modifier = Modifier.padding(start = 4.dp))

                        Image(
                            ImageVector.vectorResource(R.drawable.baseline_person_24),
                            contentDescription = "age",
                            modifier = Modifier.padding(start = 16.dp)
                        )
                        Text("27 лет", modifier = Modifier.padding(start = 4.dp))

                    }
                }


            }

        }


    }

    @Preview
    @Composable
    fun Preview() {
        MainBlock()
    }
}