package com.example.greenlife.app.screens.details.components

import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.greenlife.ui.theme.Green

@Composable
fun AddressesRow(){
    val scrollState = rememberScrollState()
    Row (modifier = Modifier.horizontalScroll(scrollState)){
        Address(country = "Ukraine", city = "Kyiv", street = "Persha street, 29/7")
        Address(country = "Ukraine", city = "Kyiv", street = "Persha street, 29/7")
        Address(country = "Ukraine", city = "Kyiv", street = "Persha street, 29/7")
    }
}

@Composable
private fun Address(country: String, city: String, street: String){
    Box (modifier = Modifier
        .padding(20.dp)
        .border(width = 2.dp, color = Green), ){
        Column {
            Text(text = country)
            Box(modifier = Modifier.height(5.dp))
            Text(text = city)
            Box(modifier = Modifier.height(5.dp))
            Text(text = street)
        }
    }
}