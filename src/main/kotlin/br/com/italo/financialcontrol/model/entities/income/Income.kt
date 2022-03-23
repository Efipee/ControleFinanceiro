package br.com.italo.financialcontrol.model.entities.income

import br.com.italo.financialcontrol.model.entities.company.Company
import java.math.BigDecimal

class Income(val value: BigDecimal, val type: IncomeType, val company: Company)
