package br.com.italo.controlefinanceiro.model.entities.income

import br.com.italo.controlefinanceiro.model.entities.company.Company
import java.math.BigDecimal

class Income(val value: BigDecimal, val type: IncomeType, val company: Company)
