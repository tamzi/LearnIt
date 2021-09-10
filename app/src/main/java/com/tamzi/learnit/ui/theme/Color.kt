package com.tamzi.learnit.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver

/*
    We set out the various theme colours for our shades of dark and light theme
    We will modify these

*/

/*Theme 1: IndigoTheme:*/
val indigo = Color(0xFF654D67)
val lightIndigo = Color(0xFF9D5875)
val lighterIndigo = Color(0xFFE5ABB2)
val darkIndigo = Color(0xFF312651)

/*Theme 2*/
val white = Color(0xFFFFFFFF)
val cream = Color(0xFFF6EDE2)
val black = Color(0xFF131313)

/*Theme 3: MinimalistTheme*/
val gray = Color(0xFFEFEFEF)
val deepGray = Color(0xFFE6E4E6)
val darkGray = Color(0xFF83829A)
val lightGray = Color(0xFFF6F6F6)

/*
Redddish theme
*/
val reddish = Color(0xFFFF4343)
val warmRed = Color(0xFFFF7754)
val alilReddish = Color(0xffff0266)
val darkerReddish = Color(0xffd8004d)
val darkReddish = Color(0xff24191c)


val blueish = Color(0xff0336ff)
val darkerBlue = Color(0xff0035c9)
val blueDarkPrimary = Color(0xff1c1d24)

/*the yellow*/
val lightYellow = Color(0xffffeb46)
val yellowish = Color(0xffffc000)
val darkYellow = Color(0xffffde03)
val yellowDarkPrimary = Color(0xff242316)
val limeGreenish = Color(0xFF4ABB00)


/**
 * Return the fully opaque color that results from compositing [onSurface] atop [surface] with the
 * given [alpha]. Useful for situations where semi-transparent colors are undesirable.
 */
@Composable
fun Colors.compositedOnSurface(alpha: Float): Color {
    return onSurface.copy(alpha = alpha).compositeOver(surface)
}
