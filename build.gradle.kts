plugins {
    id("com.palantir.graal") version "0.6.0-27-ge8430f6"
}

graal {
    mainClass("Referee")
    outputName("cg-referee-ghost-in-the-cell")
    graalVersion("19.2.1")
}

repositories {
    jcenter()
}
