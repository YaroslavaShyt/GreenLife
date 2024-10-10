package com.example.greenlife.app.screens.cart.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.greenlife.ui.theme.Green

@Composable
fun MakePurchaseButton(){
    ElevatedButton(onClick = { /*TODO*/ }) {
        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Make\npurchase")

            Box(Modifier.width(10.dp))
            Box(
                modifier = Modifier
                    .size(25.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color(0xFF4CAF50))
            ) {
                Icon(
                    imageVector = Icons.Outlined.ShoppingCart,
                    contentDescription = "Shopping Cart",
                    tint = Color.Blue,
                    modifier = Modifier.size(16.dp).align(Alignment.Center)
                )
            }
        }

    }
}