import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.0"
    application
    kotlin("kapt") version "1.8.0"
}


kapt {
    useBuildCache = true
    mapDiagnosticLocations = true
    correctErrorTypes = true

    // https://developer.android.com/jetpack/androidx/releases/room#2.2.0
    arguments {
        arg("room.incremental", "true")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.google.dagger:dagger:2.44.2")
    kapt("com.google.dagger:dagger-compiler:2.44.2")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}