package com.example.midterm8909157

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.midterm8909157.viewmodel.RegistrationViewModel

@Composable
fun SummaryScreen(
    viewModel: RegistrationViewModel,
    navController: NavController
) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Conference Registration Summary", style = MaterialTheme.typography.headlineMedium)
        Text("Conference Name: ${viewModel.conferenceName}")
        Text("Participant Name: ${viewModel.participantName}")
        Text("Email: ${viewModel.participantEmail}")
        Text("Location: ${viewModel.location}")
        Text("Participation Type: ${if (viewModel.isInPerson) "In-Person" else "Virtual"}")
        Text("Additional Services: ${if (viewModel.additionalServices.isEmpty()) "None" else viewModel.additionalServices.joinToString(", ")}")

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.popBackStack() }) {
            Text("Back to Registration")
        }
    }
}
