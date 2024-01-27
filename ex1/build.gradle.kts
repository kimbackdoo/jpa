plugins {
    kotlin("jvm")

    id("org.hibernate.orm")
}

repositories {
    mavenCentral()
}

dependencies {
    runtimeOnly("com.h2database:h2:2.2.224")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}