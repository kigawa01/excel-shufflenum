plugins {
    kotlin("jvm") version "1.9.0"
}

group = "net.kigawa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.kigawa.kutil:kutil-unit:4.4.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}