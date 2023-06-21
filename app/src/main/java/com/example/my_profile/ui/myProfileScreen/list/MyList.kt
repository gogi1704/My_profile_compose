package com.example.my_profile.ui.myProfileScreen.list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
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
import com.example.my_profile.MainListData

class MyList {

    @Composable
    fun MainList(list: List<MainListData>) {

        LazyColumn() {
            items(list) { item ->
                MainListItem(item)
            }
        }

    }


    @Composable
    fun MainListItem(item: MainListData) {
        val isClickedState = remember {
            mutableStateOf(false)
        }

        Card(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp , start = 8.dp , end = 8.dp)
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
                Surface(modifier = Modifier.fillMaxWidth()) {
                    Column {
                        Text(
                            item.name,
                            style = TextStyle(fontSize = 32.sp, fontWeight = FontWeight.ExtraBold),
                            modifier = Modifier.padding(start = 8.dp)
                        )
                        Text(
                            item.name,
                            style = TextStyle(fontSize = 32.sp, fontWeight = FontWeight.ExtraBold),
                            modifier = Modifier.padding(start = 8.dp)
                        )
                        Text(
                            item.name,
                            style = TextStyle(fontSize = 32.sp, fontWeight = FontWeight.ExtraBold),
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }
                }
            }


        }


    }

    @Preview
    @Composable
    fun Preview() {
        MainList(
            listOf(
                MainListData("qwd"),
                MainListData("SFWEF"),
                MainListData("qwZXCZd"),
                MainListData("qwSDFSDFd"),
                MainListData("qASDwd"),
                MainListData("qEFSwd"),
            )
        )
    }
}