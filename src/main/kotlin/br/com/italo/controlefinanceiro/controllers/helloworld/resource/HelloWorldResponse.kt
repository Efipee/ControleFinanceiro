package br.com.italo.controlefinanceiro.controllers.helloworld.resource

import br.com.italo.controlefinanceiro.model.entities.pessoa.HelloWorld

class HelloWorldResponse(val message: String) {

    companion object {
        fun toResponse(helloWorld: HelloWorld): HelloWorldResponse {
            return HelloWorldResponse(helloWorld.message)
        }
    }
}
