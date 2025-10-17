package com.example.midterm8909157.viewmodel

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.example.midterm8909157.validation.ValidationResult

class RegistrationViewModel : ViewModel() {

    var conferenceName by mutableStateOf("")
    var participantName by mutableStateOf("")
    var participantEmail by mutableStateOf("")
    var location by mutableStateOf("")
    var isInPerson by mutableStateOf(true)
    var additionalServices = mutableStateListOf<String>()

    fun validate(): ValidationResult {
        if (conferenceName.isBlank()) return ValidationResult.Error("Conference Name required")
        if (participantName.isBlank()) return ValidationResult.Error("Participant Name required")
        if (participantEmail.isBlank()) return ValidationResult.Error("Email required")
        if (location.isBlank()) return ValidationResult.Error("Location required")
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(participantEmail).matches()) {
            return ValidationResult.Error("Invalid Email")
        }
        return ValidationResult.Success
    }

    fun toggleService(service: String) {
        if (additionalServices.contains(service)) {
            additionalServices.remove(service)
        } else {
            additionalServices.add(service)
        }
    }
}
