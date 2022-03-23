package br.com.italo.controlefinanceiro.model.repositories.helloworld

import br.com.italo.controlefinanceiro.model.entities.pessoa.HelloWorld
import org.springframework.stereotype.Repository

@Repository
class HelloWorldRepository {

    fun getHelloWorld(): HelloWorld {
        return HelloWorld("Olá mundo!!!")
    }
}

main