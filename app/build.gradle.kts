plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.doxart.ivpn"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.doxart.ivpn"
        minSdk = 24
        targetSdk = 34
        versionCode = 10
        versionName = "0.0.10"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    buildFeatures {
        buildConfig = true
        dataBinding = true
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:32.5.0"))
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-config")
    implementation("com.google.android.gms:play-services-ads:22.5.0")

    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation("com.github.PhilJay:MPAndroidChart-Realm:v3.0.3@aar")

    implementation ("com.github.skydoves:progressview:1.1.3")

    implementation ("commons-io:commons-io:2.6")

    implementation ("com.airbnb.android:lottie:3.4.0")

    implementation ("io.adapty:android-sdk:2.7.0")
    implementation ("io.adapty:android-ui:2.0.1")

    implementation ("com.squareup.retrofit2:retrofit:2.7.0")

    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.google.firebase:firebase-firestore:24.9.1")
    implementation("com.google.firebase:firebase-storage:20.3.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.14.2")

    implementation ("androidx.localbroadcastmanager:localbroadcastmanager:1.1.0")

    implementation(project(mapOf("path" to ":vpnLib")))

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation ("androidx.recyclerview:recyclerview:1.3.2")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}