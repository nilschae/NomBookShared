plugins {
    `java-library`
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    // Shared messages currently have no external dependencies.
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}
