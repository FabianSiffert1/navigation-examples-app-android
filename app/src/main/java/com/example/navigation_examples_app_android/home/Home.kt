package com.example.navigation_examples_app_android.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.annotation.RootNavGraph

@RootNavGraph(start = true)
@NavGraph(route = "HomeNavGraph")
annotation class HomeNavGraph(val start: Boolean = false)

@HomeNavGraph(start = true)
@Destination
@Composable
fun HomeScreen(){
    Text(text = "Home")
}