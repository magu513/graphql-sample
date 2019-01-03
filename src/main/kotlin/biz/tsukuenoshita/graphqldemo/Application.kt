package biz.tsukuenoshita.graphqldemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ImportResource
import org.springframework.integration.annotation.IntegrationComponentScan
import org.springframework.integration.config.EnableIntegration

@EnableIntegration
@SpringBootApplication
@ImportResource("META-INF/integration.xml")
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
