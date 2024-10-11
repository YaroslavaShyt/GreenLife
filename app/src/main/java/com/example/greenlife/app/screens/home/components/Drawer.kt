package com.example.greenlife.app.screens.home.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


data class NavigationItems(
    val title: String,
    val isSelected: Boolean,
    val interactionWidget: Unit
)

@Composable
fun Drawer(
    drawerState: DrawerState,
    selectedItemIndex: Int,
    onItemClicked: (Int) -> Unit,
    scope: CoroutineScope
) {
    val items = listOf(
        NavigationItems(
            title = "Theme",
            isSelected = false,
            interactionWidget = Box{}
        ),
        NavigationItems(
            title = "Info",
            isSelected = false,
            interactionWidget = Box{}
        ),
        NavigationItems(
            title = "Edit",
            isSelected = false,
            interactionWidget = Box{}
        ),
        NavigationItems(
            title = "Settings",
            isSelected = false,
            interactionWidget = Box{}
        )
    )


    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Spacer(modifier = Modifier.height(16.dp))
                items.forEachIndexed { index, item ->
                    NavigationDrawerItem(
                        label = { Text(text = item.title) },
                        selected = index == selectedItemIndex,
                        onClick = {
                            onItemClicked(index)
                            scope.launch {
                                drawerState.close()
                            }
                        },

                        badge = {

                        },
                        modifier = Modifier
                            .padding(NavigationDrawerItemDefaults.ItemPadding)
                    )
                }

            }
        },
        gesturesEnabled = true
    ) {}
}


