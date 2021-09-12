package com.tamzi.learnit.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.tamzi.learnit.ui.theme.LearnItTheme.shapes
import com.tamzi.learnit.ui.theme.LearnItTheme.typography


private val YebluThemeLight = lightColors(
    primary = darkYellow,
    primaryVariant = darkYellow,
    onPrimary = black,
    secondary = blueish,
    secondaryVariant = darkerBlue,
    onSecondary = white
)

private val YebluThemeDark = darkColors(
    primary = lightYellow,
    secondary = indigo,
    onSecondary = black,
    surface = yellowDarkPrimary
)

@Composable
fun YebluTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        YebluThemeDark
    } else {
        YebluThemeLight
    }
    LearnItTheme(darkTheme, colors, content)
}

private val IndigoThemeLight = lightColors(
    primary = indigo,
    primaryVariant = lightIndigo,
    onPrimary = black,
    secondary = lighterIndigo,
    secondaryVariant = darkIndigo,
    onSecondary = white,
)
private val IndigoThemeDark = lightColors(
    primary = gray,
    secondary = cream,
    onSecondary = white,
    surface = darkGray,
)

@Composable
fun IndigoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        IndigoThemeDark
    } else {
        IndigoThemeLight
    }
    LearnItTheme(darkTheme, colors, content)
}

private val RedThemeLight = lightColors(
    primary = warmRed,
    secondary = warmRed,
    primaryVariant = darkerReddish,
    onPrimary = Color.Black,
    onSecondary = Color.Black
)

private val RedThemeDark = darkColors(
    primary = reddish,
    secondary = alilReddish,
    surface = darkReddish
)

@Composable
fun RedTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        RedThemeDark
    } else {
        RedThemeLight
    }
    LearnItTheme(darkTheme, colors, content)
}


private val MinimalistThemeLight = lightColors(
    primary = gray,
    secondary = darkGray,
    primaryVariant = darkGray,
    onPrimary = black,
    onSecondary = black
)

private val MinimalistThemeDark = darkColors(
    primary = gray,
    secondary = lightGray,
    surface = black
)

@Composable
fun MinimalistTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        MinimalistThemeDark
    } else {
        MinimalistThemeLight
    }
    LearnItTheme(darkTheme, colors, content)
}

private val LightElevation = Elevation ()

private val DarkElevation = Elevation (card = 2.dp)

/*
    LearnItTheme:
    This is a custom theme but is extended from material design.

    It consits of: mimimalist,REd and indigo
 */
@Composable
private fun LearnItTheme(
    darkTheme: Boolean,
    colors: Colors,
    content: @Composable () -> Unit
) {
    val elevation = if (darkTheme) DarkElevation else LightElevation
    CompositionLocalProvider(
        LocalElevations provides elevation,
    ) {
        MaterialTheme(
            colors = colors,
            typography = typography,
            shapes = shapes,
            content = content
        )
        
    }

}



object LearnItTheme {

    val colors: Colors
        @Composable
        get() = MaterialTheme.colors


    val typography: Typography
        @Composable
        get() = MaterialTheme.typography

    val shapes: Shapes
        @Composable
        get() = MaterialTheme.shapes

    val elevations: Elevation
        @Composable
        get() = LocalElevations.current


}
