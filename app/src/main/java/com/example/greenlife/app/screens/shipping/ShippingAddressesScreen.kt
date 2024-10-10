package com.example.greenlife.app.screens.shipping

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenlife.app.screens.shipping.components.AddressComponent

@Composable
fun ShippingAddressScreen(){
Column {
    Text(
        modifier = Modifier.padding(30.dp),
        text = "My shipping addresses", fontWeight = FontWeight.Bold, fontSize = 25.sp)
    AddressComponent()
    AddressComponent()
    AddressComponent()


}
}