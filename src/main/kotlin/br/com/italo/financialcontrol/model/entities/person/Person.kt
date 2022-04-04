package br.com.italo.financialcontrol.model.entities.person

import br.com.italo.financialcontrol.model.entities.document.Document
import br.com.italo.financialcontrol.model.entities.income.Income
import br.com.italo.financialcontrol.model.entities.outgoings.Outgoings
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp

@Entity
@Table(name = "persons")
class Person(
    @Column
    val name: String,
    @OneToMany(mappedBy = "owner")
    val documents: List<Document>,
    @Column(name = "BIRTH_DATE")
    val birthDate: LocalDate,
    val income: List<Income>,
    val outgoings: Outgoings
) { // Válido deixar usuário registrar só uma saída, ou deixar uma List<Outgoings>?
    @Id
    @GeneratedValue(generator = "UUID")
    val id: UUID? = null

    @CreationTimestamp
    @Column(columnDefinition = "TIMESTAMP", name = "CREATED_AT", nullable = false, updatable = false)
    val createdAt: LocalDateTime? = null

    @UpdateTimestamp
    @Column(columnDefinition = "TIMESTAMP", name = "UPDATED_AT", nullable = false)
    val updatedAt: LocalDateTime? = null
}
