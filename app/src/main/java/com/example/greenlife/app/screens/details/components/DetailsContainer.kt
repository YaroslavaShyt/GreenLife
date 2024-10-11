package com.example.greenlife.app.screens.details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailsContainer() {
    Box(
        modifier = Modifier
            .height((LocalConfiguration.current.screenHeightDp / 2).dp)
            .background(Color.White)
            .clip(RoundedCornerShape(20.dp))
            .padding(10.dp)
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column {
                    Text(text = "String of pearls", fontSize = 30.sp, fontWeight = FontWeight.Bold)
                    Text(
                        text = "$27.50",
                        color = Color(0xFF475E3E),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W400
                    )
                }
                QuantityChanger()
            }
            Text(
                text = "About plant",
                fontSize = 20.sp,
                fontWeight = FontWeight.W400,
                color = Color.Black
            )
            Text(
                text = "lskdjhfglkdshjfglkjdhddfgkd" +
                        "hlkfjghdklfdhglkdjhfglkdshflkjghsdl" +
                        "kjfghfldksjfhgkjsdfhgkjdshflkjghdslfkjg" +
                        "hldskjfhglkdjshdfglk",
                fontSize = 15.sp,
                fontWeight = FontWeight.W400,
                color = Color.Gray
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                AddToCartButton()
            }
        }
    }
}