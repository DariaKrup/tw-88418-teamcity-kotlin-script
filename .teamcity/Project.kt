import jetbrains.buildServer.configs.kotlin.BuildType
import jetbrains.buildServer.configs.kotlin.DslContext
import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.buildSteps.kotlinScript
import jetbrains.buildServer.configs.kotlin.toId
import java.io.File

object Project : Project({
    buildType(EvaluateKotlinScript)

})

object EvaluateKotlinScript: BuildType({
    id = DslContext.createId("Evaluate".toId())
    name = "Evaluate"

    val dataFile = File(DslContext.baseDir,"/script/github-token.main.kts")

    steps {
        kotlinScript {
            name = "Evaluate Kotlin Script"
            content = dataFile.readText()
        }
    }

})
