import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    application
}

group = "bumble.dubai"
version = "0.1.0"

repositories {
    mavenCentral()
}

val ktor_version: String by project

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.4")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("com.github.protosha.medianoftwosortedarrays.MainKt")
}