package com.template.compose

object Libraries {
    const val multidex = "androidx.multidex:multidex:${Versions.multidex}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}"

    const val ktlint = "com.pinterest:ktlint:${Versions.ktLint}"
    const val checkstyle = "com.puppycrawl.tools:checkstyle:${Versions.checkstyle}"

    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinCoroutines}"
    }

    object Koin {
        const val koin = "org.koin:koin-android:${Versions.koin}"
        const val viewModel = "org.koin:koin-android-viewmodel:${Versions.koin}"
        const val test = "org.koin:koin-test:${Versions.koin}"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Versions.ktx}"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.ktx}"
        const val navigationKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigationKtx}"
        const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationKtx}"
    }

    object GMS {
        const val playServicesAuth = "com.google.android.gms:play-services-auth:${Versions.gmsAuth}"
    }

    object Support {
        const val legacy = "androidx.legacy:legacy-support-v4:${Versions.support}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val customTabs = "androidx.browser:browser:${Versions.support}"
        const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.support}"
        const val design = "com.google.android.material:material:${Versions.support}"
        const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gsonRxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        const val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
        const val picasso = "com.squareup.picasso:picasso:${Versions.picasso}"
    }

    object ViewModel {
        const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.archComponents}"
        const val common = "androidx.lifecycle:lifecycle-common-java8:${Versions.archComponents}"
        const val test = "androidx.arch.core:core-testing:${Versions.archComponents}"
    }

    object Tests {
        const val junit = "junit:junit:${Versions.junit}"
        const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    }
}