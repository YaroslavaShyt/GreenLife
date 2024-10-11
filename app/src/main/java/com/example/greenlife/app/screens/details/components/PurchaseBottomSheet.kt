package com.example.greenlife.app.screens.details.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenlife.app.core.ImageRow
import com.example.greenlife.ui.theme.Green
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetExample(bottomSheetState: SheetState) {
    ModalBottomSheet(
        onDismissRequest = {

        },
        sheetState = bottomSheetState
    ) {
        Box(modifier = Modifier.padding(16.dp)) {
            Column {
                Text("Make purchase", fontWeight = FontWeight.Bold, fontSize = 25.sp)
                Text("Articles", fontWeight = FontWeight.W400, fontSize = 20.sp)
                ImageRow()
                Text("Shipping", fontWeight = FontWeight.W400, fontSize = 20.sp)
                ShippingComponent(
                    imageVector = Icons.Outlined.Person,
                    name = "Standart: free",
                    description = "October 13-16"
                )
                ShippingComponent(
                    imageVector = Icons.Outlined.Send,
                    name = "Fast: 20$",
                    description = "October 10-12"
                )

                Text("Payment method", fontWeight = FontWeight.W400, fontSize = 20.sp)
                GooglePayButton()
                Text("Shipping address", fontWeight = FontWeight.W400, fontSize = 20.sp)
                AddressesRow()
                Row {
                    Text("Total", fontWeight = FontWeight.W400, fontSize = 20.sp)
                    Text("400$", fontWeight = FontWeight.W400, fontSize = 23.sp, color = Green)

                }
                ConfirmButton()
            }

        }
    }
}