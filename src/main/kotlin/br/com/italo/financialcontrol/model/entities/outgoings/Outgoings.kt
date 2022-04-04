package br.com.italo.financialcontrol.model.entities.outgoings

import br.com.italo.financialcontrol.model.entities.category.Category
import br.com.italo.financialcontrol.model.entities.company.Company
import br.com.italo.financialcontrol.model.entities.person.Person
import java.math.BigDecimal
import java.time.LocalDate

@SuppressWarnings("LongParameterList")
class Outgoings(
    val owner: Person,
    val description: String,
    val category: Category,
    val company: Company,
    val dueDate: LocalDate,
    val amount: BigDecimal,
    val paymentDate: LocalDate,
    val amountPaid: BigDecimal
)
