package com.example.greenlife.app.screens.cart

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenlife.R
import com.example.greenlife.app.screens.cart.components.MakePurchaseButton
import com.example.greenlife.app.screens.cart.components.WidePlant

@Composable
fun CartScreen(){
    val scrollState = rememberScrollState()
    Column (modifier = Modifier.padding(10.dp)){
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround){
            Text(
                modifier = Modifier.padding(30.dp),
                text = "Cart", fontWeight = FontWeight.Bold, fontSize = 25.sp
            )
            Text(
                modifier = Modifier.padding(30.dp),
                text = "Total: 160$", fontWeight = FontWeight.Bold, fontSize = 20.sp
            )
        }
        Column (modifier = Modifier.verticalScroll(scrollState)){
            Box (modifier = Modifier.padding(6.dp)){
                WidePlant(imageRes = R.drawable.banner)
            }
            Box (modifier = Modifier.padding(6.dp)){
                WidePlant(imageRes = R.drawable.banner)
            }
            Box (modifier = Modifier.padding(6.dp)){
                WidePlant(imageRes = R.drawable.banner)
            }
        }
        MakePurchaseButton()
    }
}