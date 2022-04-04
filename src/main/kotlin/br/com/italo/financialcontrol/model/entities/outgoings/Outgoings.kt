package br.com.italo.financialcontrol.model.entities.outgoings

import br.com.italo.financialcontrol.model.entities.category.Category
import br.com.italo.financialcontrol.model.entities.company.Company
import br.com.italo.financialcontrol.model.entities.income.IncomeType
import br.com.italo.financialcontrol.model.entities.person.Person
import java.math.BigDecimal
import java.time.LocalDate

class Outgoings(
    val name: String,
    val description: String,
    val value: BigDecimal,
    val category: Category,
    val date: LocalDate,
    val company: Company,
    val owner: Person,
    val dueDate: LocalDate,
    val amountPaid: BigDecimal,
    val paymentDate: LocalDate
)