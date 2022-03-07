package br.com.italo.controlefinanceiro.model.repositories.services.helloworld

import br.com.italo.controlefinanceiro.model.entities.helloworld.HelloWorld
import br.com.italo.controlefinanceiro.model.repositories.helloworld.HelloWorldRepository
import org.springframework.stereotype.Service

@Service
class HelloWorldService(private val repository: HelloWorldRepository) {

    fun getHelloWorld(): HelloWorld {
        return repository.getHelloWorld()
    }
}