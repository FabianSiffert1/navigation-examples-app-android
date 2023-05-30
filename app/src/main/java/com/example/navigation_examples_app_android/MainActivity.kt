package com.example.navigation_examples_app_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigation_examples_app_android.navigation.tabBar.TabBar
import com.example.navigation_examples_app_android.ui.theme.NavigationexamplesappandroidTheme
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.animations.rememberAnimatedNavHostEngine

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@OptIn(
    ExperimentalMaterialNavigationApi::class, ExperimentalAnimationApi::class,
    ExperimentalMaterial3Api::class
)
@Composable
fun MainScreen() {

    val engine = rememberAnimatedNavHostEngine()
    val navController = engine.rememberNavController()

    NavigationexamplesappandroidTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Scaffold(bottomBar = { TabBar(onItemClicked = {}) }) { innerPadding
                ->
                DestinationsNavHost(
                    engine = engine,
                    navController = navController,
                    modifier = Modifier.padding(innerPadding),
                    navGraph = NavGraphs.root
                )
            }

        }
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigationexamplesappandroidTheme {
    }
}