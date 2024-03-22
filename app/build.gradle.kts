
plugins {
    id("application")
    id("checkstyle")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "hexlet.code.App"
}

checkstyle {
    toolVersion = "10.12.5"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
