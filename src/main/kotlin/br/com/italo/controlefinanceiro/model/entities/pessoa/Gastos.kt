package br.com.italo.controlefinanceiro.model.entities.pessoa

import java.util.Date

class Gastos(var descricao: String, var valor: Float, var categoria: Categoria, val date: Date) {
    val cpf: Int? = null

}