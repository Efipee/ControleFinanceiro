package br.com.italo.financialcontrol.controllers.helloworld.resource

import br.com.italo.financialcontrol.model.entities.helloworld.HelloWorld

class HelloWorldResponse(val message: String) {

    companion object {
        fun toResponse(helloWorld: HelloWorld): HelloWorldResponse {
            return HelloWorldResponse(helloWorld.message)
        }
    }
}
