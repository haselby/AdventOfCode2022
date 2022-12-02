plugins {
    application
}

application {
    mainClass.set("com.haselby.aoc2022.day1.part1.Puzzle")
}

tasks.register<JavaExec>("runJar"){
    group = "application"
    classpath(tasks.jar.map {it.outputs})
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.haselby.aoc2022.day1.part1.Puzzle"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.opencsv:opencsv:5.7.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

tasks.test {
    useJUnitPlatform()
}