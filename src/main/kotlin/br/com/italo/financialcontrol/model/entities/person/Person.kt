package br.com.italo.financialcontrol.model.entities.person

import br.com.italo.financialcontrol.model.entities.document.Document
import br.com.italo.financialcontrol.model.entities.income.Income
import br.com.italo.financialcontrol.model.entities.outgoings.Outgoings
import java.time.LocalDate

class Person(val name: String, val documents: List<Document>, val birthdate: LocalDate, val income: List<Income>, val outgoings: Outgoings) // Válido deixar usuário registrar só uma saída, ou deixar uma List<Outgoings>?
