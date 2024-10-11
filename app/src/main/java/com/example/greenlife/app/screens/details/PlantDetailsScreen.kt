package com.example.greenlife.app.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.greenlife.R
import com.example.greenlife.app.screens.details.components.DetailsContainer


@Composable
fun PlantDetailsScreen() {
    Scaffold { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Image(
                painter = painterResource(id = R.drawable.banner),
                contentDescription = "Grid Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.height((LocalConfiguration.current.screenHeightDp / 2).dp)
            )
            DetailsContainer()
        }

    }
}