import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.31"
}

group = "me.kimfr"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.7.0")
    testImplementation(kotlin("test-junit"))

    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.2")

    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")

    testImplementation ("io.mockk:mockk:1.9.1")
}

tasks {
    "test"(Test::class) {
        useJUnitPlatform()
    }
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
