package br.com.italo.financialcontrol.model.entities.outgoings

import br.com.italo.financialcontrol.model.entities.category.Category
import br.com.italo.financialcontrol.model.entities.company.Company
import br.com.italo.financialcontrol.model.entities.person.Person
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp

@Entity
@Table(name = "outgoings")
class Outgoings(
    @Column
    @ManyToOne
    @JoinColumn(name = "owner_id")
    val owner: Person,
    @Column
    val description: String,
    @OneToMany
    @JoinColumn(name = "categories")
    val category: Category,
    @OneToMany
    val company: Company,
    @Column(name = "DUE_DATE")
    val dueDate: LocalDate,
    @Column
    val amount: BigDecimal,
    @Column(name = "PAYMENT_DATE")
    val paymentDate: LocalDate,
    @Column(name = "AMOUNT_PAID")
    val amountPaid: BigDecimal
) {
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
