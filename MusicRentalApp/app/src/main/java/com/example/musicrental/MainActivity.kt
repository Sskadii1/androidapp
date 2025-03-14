package com.example.musicrental

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.musicrental.ui.navigation.AppNavigation
import com.example.musicrental.ui.theme.MusicRentalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicRentalTheme {
                val navController = rememberNavController()
                AppNavigation(navController)
            }
        }
    }
}
