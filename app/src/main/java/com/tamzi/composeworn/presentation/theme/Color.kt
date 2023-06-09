/*
 * Copyright 2023 tamrefrank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tamzi.composeworn.presentation.theme

import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material.Colors
import com.tamzi.worn.atoms.ThemeValues

internal data class ThemeValues(val description: String, val colors: Colors)

internal val initialThemeValues = com.tamzi.worn.atoms.ThemeValues(
    "Lilac (D0BCFF)",
    Colors(
        primary = Color(0xFFD0BCFF),
        primaryVariant = Color(0xFF9A82DB),
        secondary = Color(0xFF7FCFFF),
        secondaryVariant = Color(0xFF3998D3),
    ),
)

internal val themeValues = listOf(
    initialThemeValues,
    com.tamzi.worn.atoms.ThemeValues("Blue (Default AECBFA)", Colors()),
    com.tamzi.worn.atoms.ThemeValues(
        "Blue 2 (7FCFFF)",
        Colors(
            primary = Color(0xFF7FCFFF),
            primaryVariant = Color(0xFF3998D3),
            secondary = Color(0xFF6DD58C),
            secondaryVariant = Color(0xFF1EA446),
        ),
    ),
    com.tamzi.worn.atoms.ThemeValues(
        "Green (6DD58C)",
        Colors(
            primary = Color(0xFF6DD58C),
            primaryVariant = Color(0xFF1EA446),
            secondary = Color(0xFFFFBB29),
            secondaryVariant = Color(0xFFD68400),
        ),
    ),
)
