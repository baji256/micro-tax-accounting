package org.bajiepka.accounting.repository.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "payments", schema = "micro_accounting")
open class PaymentDao (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(name = "date", nullable = false)
    val date: LocalDateTime,

    @Column(name = "agent", nullable = false)
    val agent: String,

    @Column(name = "amount", nullable = false)
    val amount: Double
)