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

package com.tamzi.composeworn.presentation

import android.app.Application
import com.tamzi.composeworn.data.WatchLocalDataSource
import com.tamzi.composeworn.data.WatchRepository

/**
 * Provides since repository for watch devices.
 */
class BaseApplication : Application() {
    private val watchLocalDataSource by lazy {
        WatchLocalDataSource()
    }

    val watchRepository by lazy {
        WatchRepository(
            watchLocalDataSource = watchLocalDataSource,
        )
    }
}
