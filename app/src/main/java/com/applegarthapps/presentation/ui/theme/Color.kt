package com.applegarthapps.presentation.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)



//Light
val Primary = Color(0xffbf4904)
val Secondary = Color(0xFff28705)
val OnSurfaceVariant = Color(0xFF52443c)
val OnSurface = Color(0xFF201a17)
val OnPrimary = Color(0xFF201a17)
val OnSecondary = Color(0xFF201a17)
val PrimaryVariant = Color(0xFFf2b705)
val NewBackground = Color(0xFFF3DC97)
val NewLightBackground = Color(0xFFCDE9E7)
val CardBackground = Color(0xFFF6CEA5)

//Dark
val DarkPrimary = Color(0xff591902)
val DarkSecondary = Color(0xffbf4904)
val DarkOnSurfaceVariant = Color(0xFFd7c2b8)
val DarkOnSurface = Color(0xFFece0db)
val DarkOnPrimary = Color(0xFFece0db)
val DarkOnSecondary = Color(0xFF33655E)
val DarkPrimaryVariant = Color(0xFF4ebaaa)
val DarkNewBackground = Color(0xFF8E500E)




val Amber200 = Color(0xFFffe54c)
val Amber500 = Color(0xFFffb300)
val Amber700 = Color(0xFFc68400)
val LightAmber = Color(0xFFffecb3)

val MediumGreen = Color(0xFF3BAE06)



val Tan = Color(0xFFDDBC83)

val Colors.cardBackground: Color
    @Composable
    get() = if (isLight) CardBackground else MediumGreen

val Colors.mediumGreen: Color
    @Composable
    get() = if (isLight) MediumGreen else MediumGreen


val Colors.newBackgroundColor: Color
    @Composable
    get() = if (isLight) NewBackground else DarkNewBackground

val Colors.newLightBackgroundColor: Color
    @Composable
    get() = if (isLight) NewLightBackground else DarkNewBackground

val Colors.fontColor: Color
    @Composable
    get() = if (isLight) DarkOnSecondary else DarkOnPrimary
