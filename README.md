ComposeWorn
===================================
Re-imagining the Wear app samples with opinionated compose.

Introduction
------------

Compose for Wear OS app that demonstrates how to use Wear specific Scaffold, Navigation,
curved text, Chips, and many other composables.

Displays different text at the bottom of the landing screen depending on shape of the device
(round vs. square/rectangular).

Debug and Release Builds
------------------------

Only use the debug builds (launching from within Android Studio) with the emulator.

Measure performance only with your release builds, and never measure your debug builds. 
Run with R8 optimisation and minification turned on.

What is different:
-----------
LEGEND:
`In Progress` [ ] and `done` [x]

[ ] Design System implementation
[ ] restructuring the app to follow an opinionated architecture
[ ] use build pipelines 
[ ] analytics integration

Getting Started
---------------

This sample uses the Gradle build system. To build this project:
Clone from github:

run the `gradlew build` command 
run `gradlew spotlessApply`
run `gradlew task clean`

