package com.example.greenlife.app.screens.history

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

import com.example.greenlife.app.core.ImageRow
import com.example.greenlife.ui.theme.Green

@Composable
fun OrderComponent() {
    Column {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround) {
            Text(text = "18/09/2024 A4kj887Id", fontSize = 20.sp)
            Text(text = "On the way home", color = Green, fontSize = 16.sp)
        }
        ImageRow()
    }
}