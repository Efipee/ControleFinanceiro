package br.com.italo.controlefinanceiro.model.entities.person

import br.com.italo.controlefinanceiro.model.entities.income.Income
import java.time.LocalDate

class Person(val name: String, val cpf: String, val birthdate: LocalDate, val income: List<Income>)
