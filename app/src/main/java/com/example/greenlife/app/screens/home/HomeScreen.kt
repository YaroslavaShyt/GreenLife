import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed)) // Стан для дровера
    val navController = rememberNavController() // Навігаційний контролер

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = { Text("GreenLife") },
                navigationIcon = {
                    IconButton(onClick = {
                        // Відкриваємо Drawer
                        coroutineScope.launch { scaffoldState.drawerState.open() }
                    }) {
                        Icon(Icons.Default.Menu, contentDescription = "Drawer Menu")
                    }
                },
                actions = {
                    IconButton(onClick = {
                        // Дія для кошика
                    }) {
                        Icon(Icons.Default.ShoppingCart, contentDescription = "Shopping Cart")
                    }
                }
            )
        },
        bottomBar = {
            BottomNavigationBar(navController = navController)
        },
        drawerContent = {
            DrawerContent() // Можна заповнити вміст дровера тут
        }
    ) { innerPadding ->
        // Основний вміст екрану
        Box(modifier = Modifier.padding(innerPadding)) {
            NavigationHost(navController = navController)
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf("Home", "Profile")
    BottomNavigation {
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                icon = {
                    when (index) {
                        0 -> Icon(Icons.Default.Home, contentDescription = "Home")
                        1 -> Icon(Icons.Default.Cart, contentDescription = "Profile")
                        else -> {}
                    }
                },
                label = { Text(item) },
                selected = navController.currentBackStackEntry?.destination?.route == item,
                onClick = {
                    navController.navigate(item)
                }
            )
        }
    }
}

@Composable
fun DrawerContent() {
    Column {
        Text("Menu item 1")
        Text("Menu item 2")
    }
}

@Composable
fun NavigationHost(navController: NavController) {
    NavHost(navController, startDestination = "Home") {
        composable("Home") { HomeScreen() }
        composable("Profile") { ProfileScreen() }
    }
}

@Composable
fun HomeScreen() {
    // Вміст першої таби
    Text("Home Screen Content")
}

@Composable
fun ProfileScreen() {
    // Вміст другої таби
    Text("Profile Screen Content")
}
