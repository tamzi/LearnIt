package com.tamzi.learnit.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/**
 * We will add various values of Elevation
 * We will use these values to create some aspect of depth
 * This can be the elevation of the cards.
 */
data class Elevation  (val card : Dp = 2.dp)

internal val LocalElevations = staticCompositionLocalOf { Elevation() }
