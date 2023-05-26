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

package com.tamzi.composeworn.benchmark

import android.content.Intent
import android.graphics.Point
import androidx.benchmark.macro.CompilationMode
import androidx.benchmark.macro.FrameTimingMetric
import androidx.benchmark.macro.StartupMode
import androidx.benchmark.macro.junit4.MacrobenchmarkRule
import androidx.test.filters.LargeTest
import androidx.test.uiautomator.By
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@LargeTest
@RunWith(Parameterized::class)
class ScrollingBenchmark(
    private val compilationMode: CompilationMode,
) {
    @get:Rule
    val benchmarkRule = MacrobenchmarkRule()

    @Test
    fun startup() = benchmarkRule.measureRepeated(
        packageName = PACKAGE_NAME,
        metrics = listOf(FrameTimingMetric()),
        compilationMode = compilationMode,
        iterations = 10,
        startupMode = StartupMode.WARM,
        setupBlock = {
            startActivityAndWait(Intent("com.tamzi.composeworn.BENCHMARK"))
        },
    ) {
        val list = device.findObject(By.desc("ScalingLazyColumn"))

        // Setting a gesture margin is important otherwise gesture nav is triggered.
        list.setGestureMargin(device.displayWidth / 5)

        repeat(5) {
            list.drag(Point(list.visibleCenter.x, list.visibleCenter.y / 3))
            device.waitForIdle()
        }
    }

    companion object {
        @Parameterized.Parameters(name = "compilation={0}")
        @JvmStatic
        fun parameters() = listOf(CompilationMode.None(), CompilationMode.Partial())

        private const val PACKAGE_NAME = "com.tamzi.composeworn"
    }
}
