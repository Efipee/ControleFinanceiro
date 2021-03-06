package br.com.italo.financialcontrol.controllers.helloworld

import br.com.italo.financialcontrol.controllers.helloworld.resource.HelloWorldResponse
import br.com.italo.financialcontrol.model.services.helloworld.HelloWorldService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloWorldController(private val service: HelloWorldService) {

    @GetMapping
    fun getHelloWorld(): ResponseEntity<HelloWorldResponse> {
        return ResponseEntity.ok(HelloWorldResponse.toResponse(service.getHelloWorld()))
    }
}
