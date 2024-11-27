buildscript {
    dependencies {
        classpath(libs.gradle.plugin.android)
        classpath(libs.gradle.plugin.r8)
        classpath(libs.gradle.plugin.kotlin)
        classpath(libs.gradle.plugin.hilt)
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlin) apply false
    alias(libs.plugins.dagger.hilt) apply false
    alias(libs.plugins.kotlin.kapt) apply false
}