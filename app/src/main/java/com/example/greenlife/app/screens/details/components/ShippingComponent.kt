package com.example.greenlife.app.screens.details.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ShippingComponent(imageVector: ImageVector, name: String, description: String){
    Row {
        Icon(
            imageVector = imageVector,
            contentDescription = "standart"
        )
        Box(modifier = Modifier.width(10.dp))
        Column {
            Text(text = name, fontSize = 20.sp)
            Box(modifier = Modifier.width(10.dp))
            Text(text = description, fontSize = 15.sp)
        }
        Box(modifier = Modifier.width(10.dp))
        RadioButton(selected = false, onClick = { /*TODO*/ })
    }
}