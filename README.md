# 📱 Conference Registration App (MidTermStudentId)

This Android mobile app is developed in **Kotlin** using **Jetpack Compose** as part of the midterm project.  
It allows users to register for a conference and view a summary of their registration details.

---

## 🧩 Project Overview

**Objective:**  
Build a two-screen Conference Registration app using **Jetpack Compose**, **ViewModel**, and **Material Design 3**.  
The app demonstrates form handling, input validation, navigation, and state management best practices.

**Architecture:**  
- **Single Activity Architecture**
- **Jetpack Navigation Compose**
- **MVVM (Model-View-ViewModel)** pattern
- **Material Theme (custom-built using Material Theme Builder)**

---

## 🖼️ Screens Overview

### 🏠 Screen 1: Conference Registration
- Displays the app title **“Conference Registration”** and a logo.
- Includes input fields:
  - Conference Name  
  - Participant Name  
  - Participant Email Address  
  - Location  
- Includes toggle switch for **Participation Type**:
  - *In-Person* or *Virtual*
- Includes multiple **Checkboxes** for Additional Services:
  - Workshop Access  
  - Networking Dinner  
  - Printed Materials  
  - VIP Lounge
- Includes **Register Button**:
  - Validates all fields
  - Shows a Toast message — “Conference Registration Successful”
  - Navigates to the Summary screen

### 📋 Screen 2: Registration Summary
- Displays all data entered on the registration screen:
  - Conference Name  
  - Participant Name  
  - Email Address  
  - Location  
  - Participation Type  
  - Selected Additional Services  
- Includes a **Back Button** to return to the registration form.

---

## 🧠 State Management

- All UI states are managed using a **ViewModel**.  
- Uses `mutableStateOf` for each form field.
- The Register button validates required inputs before navigation.
- Data is passed between screens using **ViewModel state**.

---

## 🧭 Navigation

Implemented using **Navigation Compose** with a single activity hosting multiple composables:
- `RegistrationScreen()`
- `SummaryScreen()`
- Navigation controlled via a `NavHost` in `NavGraph.kt`

---

## 🎨 Material Theme

- Custom **Material 3 Theme** generated using **Material Theme Builder**.
- Colors, typography, and shapes are consistently applied across all composables.
- Supports both **Light** and **Dark** color schemes.

---

## 📂 Project Structure
app/
├── java/
│ └── com.example.midtermstudentid/
│ ├── MainActivity.kt
│ ├── viewmodel/RegistrationViewModel.kt
│ ├── navigation/NavGraph.kt
│ ├── ui/screens/
│ │ ├── RegistrationScreen.kt
│ │ └── SummaryScreen.kt
│ └── ui/theme/
│ ├── Color.kt
│ ├── Theme.kt
│ ├── Type.kt
├── res/
│ ├── drawable/logo.png
│ ├── values/strings.xml
│ ├── values/colors.xml
│ ├── values/themes.xml
├── build.gradle
└── AndroidManifest.xml

## 🧾 Validation Logic

- Implemented using a **sealed class** to handle different validation states (e.g., `Success`, `Error`, `EmptyField`).
- Ensures all required fields are filled and email is valid before proceeding.

---

## 🚀 Technologies Used

| Technology | Purpose |
|-------------|----------|
| **Kotlin** | Core language |
| **Jetpack Compose** | Declarative UI framework |
| **ViewModel** | State management |
| **Navigation Compose** | Screen transitions |
| **Material 3 Theme** | Consistent UI styling |
| **Toast** | User feedback |

---

## 🧩 Features Demonstrated

- Two-screen navigation using Compose Navigation
- Custom Material Theme integration
- Form input handling with `OutlinedTextField`, `Switch`, and `Checkbox`
- Validation with sealed class and ViewModel
- Passing data between screens using shared ViewModel
- Light and dark theme support

---

## 📸 Screenshots (to be included in documentation)
- Light Mode – Registration Screen  
- Dark Mode – Registration Screen  
- Light Mode – Summary Screen  
- Dark Mode – Summary Screen  

---

## 🎥 Demo Video
Attach or link your **screen recording** showing:
1. Registration process  
2. Summary display  
3. Code walkthrough

---

## 🧑‍💻 Author
**Name:** [Your Full Name]  
**Student ID:** [Your Student ID]  
**Course:** Mobile Application Development (Midterm Project)  
**IDE:** Android Studio  
**Language:** Kotlin  

---

## ⚙️ How to Run
1. Clone or download the repository.
2. Open the project in **Android Studio**.
3. Let Gradle sync automatically.
4. Run the app on an emulator or physical device.

---

## 📝 License
This project is for **educational purposes only** as part of the Mid-Term examination.
