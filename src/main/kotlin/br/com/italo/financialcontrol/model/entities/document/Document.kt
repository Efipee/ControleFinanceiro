package br.com.italo.financialcontrol.model.entities.document

import br.com.italo.financialcontrol.model.entities.person.Person

class Document(val number: String, val type: DocumentType, val owner: Person)