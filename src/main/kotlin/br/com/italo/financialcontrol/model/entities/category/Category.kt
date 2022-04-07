package br.com.italo.financialcontrol.model.entities.category

import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp

@Entity
@Table(name = "categories")
class Category(
    @Column(name = "CATEGORY_TYPE") // Dúvida sobre como definir chave estrangeira quando table só tem um valor
    val type: String
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
