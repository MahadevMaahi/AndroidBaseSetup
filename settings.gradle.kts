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
    }
}

include(":app")
project(":app").projectDir = File(rootDir, "app")

include(":primary")
project(":primary").projectDir = File(rootDir, "source/primary")


rootProject.name = "My Application"
