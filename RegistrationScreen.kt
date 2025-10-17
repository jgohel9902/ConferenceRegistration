package com.example.midterm8909157

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.*
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Switch
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.midterm8909157.R
import com.example.midterm8909157.Screen
import com.example.midterm8909157.viewmodel.RegistrationViewModel

@Composable
fun RegistrationScreen(
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
        Text("Conference Registration", style = MaterialTheme.typography.headlineMedium)
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        )

        OutlinedTextField(
            value = viewModel.conferenceName,
            onValueChange = { viewModel.conferenceName = it },
            label = { Text("Conference Name") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = viewModel.participantName,
            onValueChange = { viewModel.participantName = it },
            label = { Text("Participant Name") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = viewModel.participantEmail,
            onValueChange = { viewModel.participantEmail = it },
            label = { Text("Email Address") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = viewModel.location,
            onValueChange = { viewModel.location = it },
            label = { Text("Location") },
            modifier = Modifier.fillMaxWidth()
        )

        Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
            Text("Participation Type")
            Spacer(modifier = Modifier.width(16.dp))
            Switch(
                checked = viewModel.isInPerson,
                onCheckedChange = { viewModel.isInPerson = it }
            )
            Text(if (viewModel.isInPerson) "In-Person" else "Virtual")
        }

        Text("Additional Services")
        val services = listOf("Workshop Access", "Networking Dinner", "Printed Materials", "VIP Lounge")
        services.forEach { service ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .toggleable(
                        value = viewModel.additionalServices.contains(service),
                        onValueChange = { viewModel.toggleService(service) }
                    ),
                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = viewModel.additionalServices.contains(service),
                    onCheckedChange = null
                )
                Text(service)
            }
        }

        Button(
            onClick = {
                when(val result = viewModel.validate()) {
                    is com.example.midterm8909157.validation.ValidationResult.Success -> {
                        Toast.makeText(
                            navController.context,
                            "Conference Registration Successful",
                            Toast.LENGTH_SHORT
                        ).show()
                        navController.navigate(Screen.Summary.route)
                    }
                    is com.example.midterm8909157.validation.ValidationResult.Error -> {
                        Toast.makeText(
                            navController.context,
                            result.message,
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Register")
        }
    }
}
