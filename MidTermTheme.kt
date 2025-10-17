package com.example.midterm8909157.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.example.midterm8909157.ui.theme.md_theme_dark_background
import com.example.midterm8909157.ui.theme.md_theme_dark_onBackground
import com.example.midterm8909157.ui.theme.md_theme_dark_onPrimary
import com.example.midterm8909157.ui.theme.md_theme_dark_onPrimaryContainer
import com.example.midterm8909157.ui.theme.md_theme_dark_onSecondary
import com.example.midterm8909157.ui.theme.md_theme_dark_onSecondaryContainer
import com.example.midterm8909157.ui.theme.md_theme_dark_onSurface
import com.example.midterm8909157.ui.theme.md_theme_dark_outline
import com.example.midterm8909157.ui.theme.md_theme_dark_primary
import com.example.midterm8909157.ui.theme.md_theme_dark_primaryContainer
import com.example.midterm8909157.ui.theme.md_theme_dark_secondary
import com.example.midterm8909157.ui.theme.md_theme_dark_secondaryContainer
import com.example.midterm8909157.ui.theme.md_theme_dark_surface
import com.example.midterm8909157.ui.theme.md_theme_light_background
import com.example.midterm8909157.ui.theme.md_theme_light_onBackground
import com.example.midterm8909157.ui.theme.md_theme_light_onPrimary
import com.example.midterm8909157.ui.theme.md_theme_light_onPrimaryContainer
import com.example.midterm8909157.ui.theme.md_theme_light_onSecondary
import com.example.midterm8909157.ui.theme.md_theme_light_onSecondaryContainer
import com.example.midterm8909157.ui.theme.md_theme_light_onSurface
import com.example.midterm8909157.ui.theme.md_theme_light_outline
import com.example.midterm8909157.ui.theme.md_theme_light_primary
import com.example.midterm8909157.ui.theme.md_theme_light_primaryContainer
import com.example.midterm8909157.ui.theme.md_theme_light_secondary
import com.example.midterm8909157.ui.theme.md_theme_light_secondaryContainer
import com.example.midterm8909157.ui.theme.md_theme_light_surface
import com.example.midterm8909157.ui.theme.successContainer

private val LightColors: ColorScheme = lightColorScheme(
    primary = md_theme_light_primary,
    onPrimary = md_theme_light_onPrimary,
    primaryContainer = md_theme_light_primaryContainer,
    onPrimaryContainer = md_theme_light_onPrimaryContainer,
    secondary = md_theme_light_secondary,
    onSecondary = md_theme_light_onSecondary,
    secondaryContainer = md_theme_light_secondaryContainer,
    onSecondaryContainer = md_theme_light_onSecondaryContainer,
    background = md_theme_light_background,
    onBackground = md_theme_light_onBackground,
    surface = md_theme_light_surface,
    onSurface = md_theme_light_onSurface,
    outline = md_theme_light_outline,
)

private val DarkColors: ColorScheme = darkColorScheme(
    primary = md_theme_dark_primary,
    onPrimary = md_theme_dark_onPrimary,
    primaryContainer = md_theme_dark_primaryContainer,
    onPrimaryContainer = md_theme_dark_onPrimaryContainer,
    secondary = md_theme_dark_secondary,
    onSecondary = md_theme_dark_onSecondary,
    secondaryContainer = md_theme_dark_secondaryContainer,
    onSecondaryContainer = md_theme_dark_onSecondaryContainer,
    background = md_theme_dark_background,
    onBackground = md_theme_dark_onBackground,
    surface = md_theme_dark_surface,
    onSurface = md_theme_dark_onSurface,
    outline = md_theme_dark_outline,
)


@Composable
fun MidTermTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            if (useDarkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        useDarkTheme -> DarkColors
        else -> LightColors
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

