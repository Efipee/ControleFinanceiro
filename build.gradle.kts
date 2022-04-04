import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val detektVersion: String by project
val snippetsDir = file("build/generated-snippets")

plugins {
    id("org.springframework.boot") version "2.6.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.asciidoctor.convert") version "1.5.8"
    id("io.gitlab.arturbosch.detekt").version("1.19.0")
    kotlin("jvm") version "1.6.20"
    kotlin("plugin.spring") version "1.6.20"
    kotlin("plugin.jpa") version "1.6.20"
}

group = "br.com.italo.controlefinanceiro"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {

    implementation("io.swagger:swaggerhub-maven-plugin:1.0.9")
    // DETEKT DEPENDENCIES
    detekt("io.gitlab.arturbosch.detekt:detekt-formatting:$detektVersion")
    detekt("io.gitlab.arturbosch.detekt:detekt-cli:$detektVersion")

    // DATABASE DEPENDENCIES
    implementation("org.flywaydb:flyway-core")
    implementation("org.postgresql:postgresql")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // KOTLIN DEPENDENCIES
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")


    implementation("io.springfox:springfox-data-rest:3.0.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.restdocs:spring-restdocs-mockmvc")
}

tasks {

    detekt {
        autoCorrect = true
        config = files("./detekt-config.yml")
        source = files("./src")
        toolVersion = detektVersion
    }


    getByName<Jar>("jar") {
        enabled = false
    }

    withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }

    withType<Test> {
        useJUnitPlatform()
    }

    test {
        outputs.dir(snippetsDir)
    }

    asciidoctor {
        inputs.dir(snippetsDir)
        dependsOn(test)
    }
}
