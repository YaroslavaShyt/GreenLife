package com.example.greenlife.app.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.automirrored.outlined.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.greenlife.app.screens.cart.CartScreen
import com.example.greenlife.app.screens.home.components.AppBar
import com.example.greenlife.app.screens.home.components.SearchTabContent
import com.example.greenlife.app.screens.home.components.TabBarItem
import com.example.greenlife.app.screens.home.components.TabView
import com.example.greenlife.app.screens.shipping.ShippingAddressScreen
import com.example.greenlife.ui.theme.GreenLifeTheme


@Composable
fun HomeScreen() {
    val homeTab = TabBarItem(
        title = "Home",
        selectedIcon = Icons.AutoMirrored.Filled.List,
        unselectedIcon = Icons.AutoMirrored.Outlined.List
    )
    val alertsTab = TabBarItem(
        title = "Alerts",
        selectedIcon = Icons.Filled.ShoppingCart,
        unselectedIcon = Icons.Outlined.ShoppingCart,
        badgeAmount = 7
    )

    val tabBarItems = listOf(homeTab, alertsTab)
    val navController = rememberNavController()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Scaffold(
            topBar = { AppBar() },
            bottomBar = { TabView(tabBarItems, navController) }
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = homeTab.title,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable(homeTab.title) {
                    CartScreen()
                   // ShippingAddressScreen()
                   // SearchTabContent()
                }
                composable(alertsTab.title) {
                    Text(alertsTab.title)
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreenLifeTheme {
        HomeScreen()
    }
}