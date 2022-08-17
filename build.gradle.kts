plugins {
    kotlin("jvm") version "1.6.21"
    id("application")
    id("java")
    id("idea")
    id("java-library")
    id("maven-publish")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.timmattison"
            artifactId = "jfugue"

            from(components["java"])
        }
    }
}

tasks.wrapper {
    gradleVersion = "7.4.1"
    distributionType = Wrapper.DistributionType.ALL
}

repositories {
    mavenCentral()
}

val xomVersion = "1.3.7"
val junitVersion = "4.13.2"

dependencies {
    implementation("xom:xom:$xomVersion")
    testImplementation("junit:junit:$junitVersion")
}
