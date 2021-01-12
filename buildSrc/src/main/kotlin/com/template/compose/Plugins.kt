package com.template.compose

object Plugins {
    object ClassPaths {
        const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val timeTracker = "net.rdrei.android.buildtimetracker:gradle-plugin:${Versions.timeTracker}"
        const val jacoco = "com.vanniktech:gradle-android-junit-jacoco-plugin:${Versions.jacoco}"
        const val fabric = "io.fabric.tools:gradle:${Versions.fabric}"
        const val firebaseAppDistribution = "com.google.firebase:firebase-appdistribution-gradle:${Versions.firebaseAppDistribution}"
        const val detekt = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${Versions.detekt}"
        const val gradleDoctor = "com.osacky.doctor:doctor-plugin:${Versions.gradleDoctor}"
        const val gms = "com.google.gms:google-services:${Versions.gms}"
    }

    const val application = "com.android.application"
    const val library = "com.android.library"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinKapt = "kotlin-kapt"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val firebaseAppDistribution = "com.google.firebase.appdistribution"
    const val timeTracker = "build-time-tracker"
    const val fabric = "io.fabric"
    const val detekt = "io.gitlab.arturbosch.detekt"
    const val jacoco = "jacoco"
    const val checkstyle = "checkstyle"
}