package br.com.italo.financialcontrol.model.entities.document

import br.com.italo.financialcontrol.model.entities.person.Person
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp

@Entity
@Table(name = "documents")
class Document(
    @Column(name = "NUMBER_DOCUMENT")
    val number: String,
    @Column(name = "DOCUMENT_TYPE")
    val type: DocumentType,
    @ManyToOne
    @JoinColumn(name = "owner_id")
    val owner: Person
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
