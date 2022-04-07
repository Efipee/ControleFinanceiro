package br.com.italo.financialcontrol.model.entities.company

import br.com.italo.financialcontrol.model.entities.document.Document
import br.com.italo.financialcontrol.model.entities.document.DocumentType
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp

@Entity
@Table(name = "companies")
class Company(
    @Column
    val documents: List<DocumentType>,
    @JoinColumn(name = "NAME_COMPANY")
    val nameCompany: String
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
