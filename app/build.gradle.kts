plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.drip_no_more"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.drip_no_more"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        viewBinding = true
    }
    buildToolsVersion = "34.0.0"
}

dependencies {

    implementation("androidx.appcompat:appcompat:+")
    implementation("com.google.android.material:material:+")
    implementation("androidx.constraintlayout:constraintlayout:+")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:+")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:+")
    implementation("androidx.navigation:navigation-fragment:+")
    implementation("androidx.navigation:navigation-ui:+")
    implementation("androidx.gridlayout:gridlayout:+")
    implementation("androidx.fragment:fragment:+")
    testImplementation("junit:junit:+")
    androidTestImplementation("androidx.test.ext:junit:+")
    androidTestImplementation("androidx.test.espresso:espresso-core:+")
}