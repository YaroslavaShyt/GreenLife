package com.example.greenlife.app.screens.details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuantityChanger() {
    Box(
        modifier = Modifier
            .padding(20.dp)
            .clip(RoundedCornerShape(20.dp)).width(
                100.dp
            ).background(Color(0xffF0F4EF))
    ) {
        Row (

            modifier = Modifier.fillMaxWidth().padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround) {
            RoundButton(content = "-", contentColor = Color(0xFF667085))
            Text(text = "1", fontSize = 20.sp)
            RoundButton(content = "+", contentColor = Color.White)

        }
    }
}

@Composable
private fun RoundButton(content: String, contentColor: Color) {
    Box(
        modifier = Modifier
            .size(30.dp)
            .clip(RoundedCornerShape(50.dp))
            .background(Color(0xFFB5C9AD),
            )
    ) {
        Text(
            text = content,
            color = contentColor,
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}
