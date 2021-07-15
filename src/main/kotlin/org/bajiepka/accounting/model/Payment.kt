package org.bajiepka.accounting.model

import java.time.LocalDateTime

data class Payment(
    val date: String,
    val agent: String,
    val amount: Double
)