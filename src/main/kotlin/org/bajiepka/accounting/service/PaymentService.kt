package org.bajiepka.accounting.service

import org.bajiepka.accounting.model.Payment
import org.bajiepka.accounting.repository.PaymentRepository
import org.bajiepka.accounting.repository.model.PaymentDao
import org.bajiepka.accounting.toPayment
import org.springframework.stereotype.Service

@Service
class PaymentService(
    private val paymentRepository: PaymentRepository
) {

    fun getPayments(): List<Payment> = paymentRepository.findAll()
        .map(PaymentDao::toPayment)
        .toList()
}