pluginManagement {
    includeBuild("../build-logic")
}

plugins {
    id("multimodule")
}

fun includeSubs(base: String, path: String = base, vararg subs: String) {
    subs.forEach {
        include(":$base-$it")
        project(":$base-$it").projectDir = File("$path/$it")
    }
}

listOf(
    "kommander", "kollections", "koncurrent", "neat",
    "lexi", "cinematic", "kase", "symphony", "kash-api"
).forEach {
    includeBuild("../$it")
}

rootProject.name = "kash-client"

includeSubs("kash", ".", "fields")
