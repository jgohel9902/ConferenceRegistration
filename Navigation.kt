package com.example.midterm8909157

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.midterm8909157.viewmodel.RegistrationViewModel

// Defining app routes
sealed class Screen(val route: String) {
    object Registration : Screen("registration")
    object Summary : Screen("summary")
}

// Main navigation graph
@Composable
fun NavGraph(
    navController: NavHostController,
    viewModel: RegistrationViewModel
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Registration.route
    ) {
        composable(Screen.Registration.route) {
            RegistrationScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(Screen.Summary.route) {
            SummaryScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}
