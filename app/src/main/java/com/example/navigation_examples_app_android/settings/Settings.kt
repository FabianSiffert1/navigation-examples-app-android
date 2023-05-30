package com.example.navigation_examples_app_android.settings

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.annotation.RootNavGraph


@RootNavGraph()
@NavGraph(route = "SettingsNavGraph")
annotation class SettingsNavGraph(val start: Boolean = false)

@Destination
@SettingsNavGraph(start = true)
@Composable
fun Settings() {
    Text(text = "Settings")
}