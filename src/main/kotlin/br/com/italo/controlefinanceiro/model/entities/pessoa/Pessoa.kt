package br.com.italo.controlefinanceiro.model.entities.pessoa

import java.util.Date

class Pessoa(var nome: String, var salario: Double, var dataNasc: Date, val renda: Int? = null) {
    val cpf: Int? = null

}