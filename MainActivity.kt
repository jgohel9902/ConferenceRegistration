package com.example.midterm8909157

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.midterm8909157.ui.theme.MidTermTheme
import com.example.midterm8909157.viewmodel.RegistrationViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MidTermTheme {
                val navController = rememberNavController()
                val viewModel: RegistrationViewModel = viewModel()

                NavGraph(
                    navController = navController,
                    viewModel = viewModel
                )
            }
        }
    }
}




