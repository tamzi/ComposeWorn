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

package com.tamzi.composeworn.presentation.ui.watch

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.tamzi.composeworn.data.WatchModel
import com.tamzi.composeworn.data.WatchRepository
import com.tamzi.composeworn.presentation.BaseApplication

/**
 * ViewModel for the Watch Detail Screen (only needs watch id).
 */
class WatchDetailViewModel(
    watchId: Int,
    watchRepository: WatchRepository,
) : ViewModel() {
    private val _watch: MutableState<WatchModel?> =
        mutableStateOf(watchRepository.getWatch(watchId))
    val watch: State<WatchModel?>
        get() = _watch

    companion object {
        fun factory(watchId: Int) = viewModelFactory {
            initializer {
                val baseApplication =
                    this[APPLICATION_KEY] as BaseApplication
                WatchDetailViewModel(
                    watchId = watchId,
                    watchRepository = baseApplication.watchRepository,
                )
            }
        }
    }
}
