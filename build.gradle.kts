import com.template.compose.Plugins

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Plugins.ClassPaths.gradle)
        classpath(Plugins.ClassPaths.kotlin)
        classpath(Plugins.ClassPaths.gms)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}