plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.openstreetmap"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.openstreetmap"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(files("libs/osmbonuspack_6.9.0.aar"))

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // OSMdroid
    implementation("org.osmdroid:osmdroid-android:6.1.18")
    //implementation("org.osmdroid:osmdroid-wms:6.1.18")
    //implementation("org.osmdroid:osmdroid-geopackage:6.1.18")
    //implementation(libs.osmdroid.mapsforge)

    implementation("org.apache.commons:commons-lang3:3.8.1")
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("com.squareup.okhttp3:okhttp:4.7.2")


    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}