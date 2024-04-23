pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")
            credentials { username = System.getenv("JIT_TOKEN") }
        }
    }
}

rootProject.name = "ComponentLibraryAndroid"
include(":app")
include(":enigma-compose")
