package br.com.italo.financialcontrol.model.services.helloworld

import br.com.italo.financialcontrol.model.entities.helloworld.HelloWorld
import br.com.italo.financialcontrol.model.entities.helloworld.HelloWorldRepository
import org.springframework.stereotype.Service

@Service
class HelloWorldService(private val repository: HelloWorldRepository) {

    fun getHelloWorld(): HelloWorld {
        return repository.getHelloWorld()
    }
}
