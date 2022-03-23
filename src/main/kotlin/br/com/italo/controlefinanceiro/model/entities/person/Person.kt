package br.com.italo.controlefinanceiro.model.entities.person

import br.com.italo.controlefinanceiro.model.entities.income.Income
import java.time.LocalDate

class Person(val nome: String, val cpf: String, val dataNasc: LocalDate, val income: List<Income>)
