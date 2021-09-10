package com.tamzi.learnit.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.tamzi.learnit.R

private val Gilroy = FontFamily(
    Font(R.font.gilroy_light)
)

private val DMSans = FontFamily(
    Font(R.font.dmsans_bold),
    Font(R.font.dmsans_medium),
    Font(R.font.dmsans_regular),
)

val AuthTypography = typographyFromDefaults(
    h1 = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W900,
        fontSize = 33.sp

    ),
    h2 = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W900,
        fontSize = 33.sp

    ),
    h3 = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W900,
        fontSize = 33.sp

    ),
    h4 = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W500,
        fontSize = 33.sp

    ),
    h5 = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W500,
        fontSize = 33.sp

    ),
    h6 = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W500,
        fontSize = 33.sp

    ),
    subtitle1 = TextStyle(
        fontFamily = DMSans,
        fontWeight = FontWeight.W500,
        lineHeight = 22.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = DMSans,
        fontWeight = FontWeight.W500
    ),
    body1 = TextStyle(
        fontFamily = DMSans,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        lineHeight = 28.sp
    ),
    body2 = TextStyle(
        fontFamily = DMSans,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        lineHeight = 16.sp
    ),
    button = TextStyle(
        fontFamily = Gilroy,
        fontWeight = FontWeight.W500,

        ),


    )


fun typographyFromDefaults(
    h1: TextStyle?,
    h2: TextStyle?,
    h3: TextStyle?,
    h4: TextStyle?,
    h5: TextStyle?,
    h6: TextStyle?,
    subtitle1: TextStyle?,
    subtitle2: TextStyle?,
    body1: TextStyle?,
    body2: TextStyle?,
    button: TextStyle?,
): Typography {
    val defaults = Typography()
    return Typography(
        h1 = defaults.h1.merge(h1),
        h2 = defaults.h2.merge(h2),
        h3 = defaults.h3.merge(h3),
        h4 = defaults.h4.merge(h4),
        h5 = defaults.h5.merge(h5),
        h6 = defaults.h6.merge(h6),
        subtitle1 = defaults.subtitle1.merge(subtitle1),
        subtitle2 = defaults.subtitle2.merge(subtitle2),
        body1 = defaults.body1.merge(body1),
        body2 = defaults.body2.merge(body2),
        button = defaults.button.merge(button),
    )
}


