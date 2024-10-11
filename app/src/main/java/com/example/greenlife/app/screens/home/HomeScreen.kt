package com.example.greenlife.app.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.automirrored.outlined.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.greenlife.app.screens.cart.CartScreen
import com.example.greenlife.app.screens.details.PlantDetailsScreen
import com.example.greenlife.app.screens.details.components.BottomSheetExample
import com.example.greenlife.app.screens.history.OrdersHistoryScreen
import com.example.greenlife.app.screens.home.components.AppBar
import com.example.greenlife.app.screens.home.components.Drawer
import com.example.greenlife.app.screens.home.components.TabBarItem
import com.example.greenlife.app.screens.home.components.TabView
import com.example.greenlife.ui.theme.GreenLifeTheme
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    var selectedItemIndex by rememberSaveable {
        mutableIntStateOf(0)
    }

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    Drawer(
        drawerState = drawerState,
        selectedItemIndex = selectedItemIndex,
        onItemClicked = { index ->
            selectedItemIndex = index
        },
        scope = scope
    )
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
    val bottomSheetState = rememberModalBottomSheetState()
    val coroutineScope = rememberCoroutineScope()
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

                    //PlantDetailsScreen()
                    // OrdersHistoryScreen()
                    // CartScreen()
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