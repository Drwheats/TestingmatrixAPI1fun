plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.testingmatrixapi1"
    compileSdk = 34

    defaultConfig {
        multiDexEnabled = true
        applicationId = "com.example.testingmatrixapi1"
        minSdk = 18
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
//    implementation("com.android.support:multidex:1.0.3")
//    implementation("com.github.Zhuinden:realm-monarchy:2.1.0")
    implementation("org.matrix.android:matrix-android-sdk2:1.5.30")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    // Note to self : consider forcing okhttp3 to go to lower api level if it fucks me
// implementation ("com.squareup.okhttp3:okhttp:3.12.12"){
    //      force = true //API 19 support
    //  }
    //  implementation 'com.squareup.okhttp3:logging-interceptor:3.12.12'
}