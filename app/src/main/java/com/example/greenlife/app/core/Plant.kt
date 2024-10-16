package com.example.greenlife.app.core

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import com.example.greenlife.R
import com.example.greenlife.ui.theme.Green

@Composable
fun Plant(imageRes: Int, width: Int = 200, height: Int = 250) {
    Surface(
        modifier = Modifier
            .size(width.dp, height.dp)
            .clip(RoundedCornerShape(16.dp)),
        color = Color.White
    ) {
        Box {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "Grid Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Spacer(modifier = Modifier.weight(1f))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.height(30.dp)
                        .background(Color.White, RoundedCornerShape(20.dp))
                        .padding(horizontal = 10.dp)
                ) {
                    Text(
                        text = "$40.00",
                        color = Green,
                    )
                 Box(Modifier.width(10.dp))
                    Box(
                        modifier = Modifier
                            .size(25.dp)
                            .clip(RoundedCornerShape(15.dp))
                            .background(Color(0xFF4CAF50))
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ShoppingCart,
                            contentDescription = "Shopping Cart",
                            tint = Green,
                            modifier = Modifier.size(16.dp).align(Alignment.Center)
                        )
                    }
                }
                Box(Modifier.height(10.dp))
            }
        }
    }
}
