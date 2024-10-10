package com.example.greenlife.app.screens.shipping.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AddressComponent(){
    Row (
        horizontalArrangement = Arrangement.SpaceAround,
        modifier =
            Modifier.fillMaxWidth().padding(20.dp)
    ) {
        RadioButton(selected = false, onClick = { /*TODO*/ })
        Column {
            Text(text = "Ukraine")
            Text(text = "Kyiv")
            Text(text = "Persha Street 29/7")

        }
        Icon(imageVector = Icons.Outlined.Edit, contentDescription = "Edit")
        Icon(imageVector = Icons.Outlined.Delete, contentDescription = "Delete")

    }
}