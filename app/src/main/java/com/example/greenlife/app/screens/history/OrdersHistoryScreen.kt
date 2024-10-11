package com.example.greenlife.app.screens.history

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun OrdersHistoryScreen(){
    Column {
        Text(
            modifier = Modifier.padding(30.dp),
            text = "Orders history", fontWeight = FontWeight.Bold, fontSize = 25.sp
        )
        OrderComponent()
    }
}