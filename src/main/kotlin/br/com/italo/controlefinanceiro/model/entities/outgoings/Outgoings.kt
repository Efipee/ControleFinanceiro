package br.com.italo.controlefinanceiro.model.entities.outgoings

import br.com.italo.controlefinanceiro.model.entities.category.Category
import java.util.Date

class Outgoings(var description: String, var value: Float, var category: Category, val date: Date) {
    val cpf: Int? = null
}
