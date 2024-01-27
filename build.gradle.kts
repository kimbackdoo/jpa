plugins {
    kotlin("jvm") version "1.9.22"

    id("org.hibernate.orm") version "6.4.2.Final" apply false
    id("org.jetbrains.kotlin.plugin.jpa") version "2.0.0-Beta3" apply false
    id("org.jetbrains.kotlin.plugin.allopen") version "2.0.0-Beta3" apply false
}

allprojects {
    group = "jpa"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}