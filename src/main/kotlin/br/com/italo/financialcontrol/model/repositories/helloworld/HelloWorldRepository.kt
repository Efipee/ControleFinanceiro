package br.com.italo.financialcontrol.model.entities.helloworld

import org.springframework.stereotype.Repository

@Repository
class HelloWorldRepository {

    fun getHelloWorld(): HelloWorld {
        return HelloWorld("Olá mundo!!!")
    }
}
