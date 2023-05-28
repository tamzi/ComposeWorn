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

package com.tamzi.worn


import androidx.compose.runtime.Composable
import androidx.wear.compose.material.Colors
import androidx.wear.compose.material.MaterialTheme
import com.tamzi.worn.atoms.WornTypography
import com.tamzi.worn.atoms.initialThemeValues

/**
 * Custom Theme for Wear App. Read comments below for why shape isn't included.
 */
@Composable
fun WornTheme(
    colors: Colors = initialThemeValues.colors,
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colors = colors,
        typography = WornTypography,
        // For shapes, we generally recommend using the default Material Wear shapes which are
        // optimized for round and non-round devices.
        content = content,
    )
}
