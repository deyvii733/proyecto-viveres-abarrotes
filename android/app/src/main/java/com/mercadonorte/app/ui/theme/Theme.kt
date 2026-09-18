package com.mercadonorte.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val MercadoColors = lightColorScheme(
    primary = Color(0xFF1E6048),
    secondary = Color(0xFFC4EF78),
    background = Color(0xFFF6F6F1),
    surface = Color(0xFFFFFEFA),
    onPrimary = Color.White,
    onSecondary = Color(0xFF17221D),
    onBackground = Color(0xFF17221D),
    onSurface = Color(0xFF17221D)
)

@Composable
fun MercadoNorteTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = MercadoColors,
        content = content
    )
}
