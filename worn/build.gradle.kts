plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.tamzi.worn"
    compileSdk = 33

    defaultConfig {
        minSdk = 26

      testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
      consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
      release {
        isMinifyEnabled = false
        proguardFiles(
          getDefaultProguardFile("proguard-android-optimize.txt"),
          "proguard-rules.pro"
        )
      }
    }
    compileOptions {
      sourceCompatibility = JavaVersion.VERSION_1_8
      targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    /*
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    */

        // General compose dependencies

        // Uncomment two lines below if you want to use Compose BoM and stable releases
        // def composeBom = platform(libs.androidx.compose.bom)
        // implementation composeBom
        implementation(libs.androidx.activity.compose)
        implementation(libs.compose.ui.tooling.preview)
        implementation(libs.compose.foundation)
        implementation(libs.androidx.lifecycle.viewmodel.compose)
        implementation(libs.compose.material.iconscore)
        implementation(libs.compose.material.iconsext)

        // ViewModel
        implementation(libs.androidx.lifecycle.viewmodel.ktx)

        // Saved state module for ViewModel
        implementation(libs.androidx.lifecycle.viewmodel.savedstate)

        implementation(libs.androidx.lifecycle.common.java8)

        // Compose for Wear OS Dependencies
        // Developer Preview currently Alpha, with new releases coming soon.
        // NOTE: DO NOT INCLUDE a dependency on androidx.compose.material:material.
        // androidx.wear.compose:compose-material is designed as a replacement not an addition to
        // androidx.compose.material:material. If there are features from that you feel are missing from
        // androidx.wear.compose:compose-material please raise a bug to let us know:
        // https://issuetracker.google.com/issues/new?component=1077552&template=1598429&pli=1
        implementation(libs.wear.compose.material)


        // Foundation is additive, so you can use the mobile version in your Wear OS app.
        implementation(libs.wear.compose.foundation)

        // If you are using Compose Navigation, use the Wear OS version (NOT the
        // androidx.navigation:navigation-compose version), that is, uncomment the line below.
        implementation(libs.wear.compose.navigation)
        implementation(libs.navigation.ui.ktx)

        // Performance
        implementation(libs.androidx.metrics.performance)

        // Design System
        implementation(project(":worn"))

        // Google Maps
        implementation(libs.com.google.maps.compose)
        implementation(libs.com.google.play.services.maps)

        // Horologist
        implementation(libs.horologist.composables)
        implementation(libs.horologist.compose.layout)
        implementation(libs.wear.input)

        implementation(libs.androidx.splashscreen)
        implementation(libs.androidx.tracing.ktx)

        // Testing
        testImplementation(libs.junit)
        // Uncomment the line below if you want to use Compose BoM and stable releases
        // androidTestImplementation composeBom
        androidTestImplementation(libs.test.ext.junit)
        androidTestImplementation(libs.test.espresso.core)
        androidTestImplementation(libs.compose.ui.test.junit4)
        debugImplementation(libs.compose.ui.tooling)

        androidTestImplementation(libs.androidx.test.ext)
        androidTestImplementation(libs.androidx.test.ext.ktx)
        androidTestImplementation(libs.androidx.test.espresso.core)
        androidTestImplementation(libs.compose.ui.test.junit4)
        androidTestImplementation(libs.compose.ui.test.manifest)
}
