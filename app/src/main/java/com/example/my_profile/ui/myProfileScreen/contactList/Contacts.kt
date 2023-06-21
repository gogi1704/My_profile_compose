package com.example.my_profile.ui.myProfileScreen.contactList

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_profile.R
import com.example.my_profile.data.models.ContactModel

class Contacts {

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun ContactList(list: List<ContactModel>) {

        FlowColumn {
            list.forEach {
                ContactItem(contact = it)
            }
        }

    }

    @Composable
    fun ContactItem(contact: ContactModel) {

        Surface(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 4.dp, start = 12.dp, end = 12.dp, bottom = 4.dp),
            shape = Shapes().small
        ) {
            Row {
                Image(imageVector =ImageVector.vectorResource(contact.iconId), contentDescription = null)
                Spacer(modifier = Modifier.size(8.dp))
                Text(contact.title, style = TextStyle(fontSize = 24.sp))
                Column(
                    modifier = Modifier.fillMaxWidth()
                        .align(Alignment.CenterVertically)
                ) {
                    Image(
                        ImageVector.vectorResource(R.drawable.baseline_content_copy_24),
                        contentDescription = null, modifier = Modifier.align(Alignment.End)
                            .padding()
                            .clickable {

                            }
                    )
                }

            }

        }

    }




}