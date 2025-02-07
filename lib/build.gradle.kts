plugins {
    alias(libs.plugins.mavenPublish)
}

group = "com.fleeksoft.lib"
version = libs.versions.libraryVersion.get()

mavenPublishing {
    coordinates("com.fleeksoft.lib", "lib", libs.versions.libraryVersion.get())
    pom {
        name.set("io")
        description.set("Kotlin Multiplatform IO")
        licenses {
            license {
                name.set("Apache-2.0")
                url.set("https://opensource.org/licenses/Apache-2.0")
            }
        }
        url.set("https://github.com/fleeksoft/kmp-micro-amper-template")
        issueManagement {
            system.set("Github")
            url.set("https://github.com/fleeksoft/kmp-micro-amper-template/issues")
        }
        scm {
            connection.set("https://github.com/fleeksoft/kmp-micro-amper-template.git")
            url.set("https://github.com/fleeksoft/kmp-micro-amper-template")
        }
        developers {
            developer {
                name.set("Sabeeh Ul Hussnain Anjum")
                email.set("fleeksoft@gmail.com")
                organization.set("Fleek Soft")
            }
        }
    }
}