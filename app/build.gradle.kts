plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.pr_24106_pa_pz92"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.pr_24106_pa_pz92"
        minSdk = 29
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
}