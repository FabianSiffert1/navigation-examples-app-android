package com.example.navigation_examples_app_android.navigation.tabBar

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.navigation_examples_app_android.NavGraph
import com.example.navigation_examples_app_android.NavGraphs
import com.example.navigation_examples_app_android.R
import com.example.navigation_examples_app_android.ui.theme.NavigationexamplesappandroidTheme

enum class TabBarItem(
    val navGraph: NavGraph,
    val icon: ImageVector,
    @StringRes val label: Int
) {
    Home(NavGraphs.HomeNavGraph, Icons.Default.Home, R.string.home),
    Settings(NavGraphs.SettingsNavGraph, Icons.Default.Settings, R.string.settings)
}


@Composable
fun TabBar(
    onItemClicked: (TabBarItem) -> Unit,
) = NavigationexamplesappandroidTheme {
    NavigationBar(
        containerColor = Color.Transparent,
        contentColor = Color.Black,
    ) {
        TabBarItem.values().forEach {
            NavigationBarItem(
                selected = true,
                onClick = { onItemClicked(it) },
                icon = { it.icon },
            )
        }
    }
}
