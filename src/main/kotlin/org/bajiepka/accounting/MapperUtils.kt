package org.bajiepka.accounting

import org.bajiepka.accounting.model.Payment
import org.bajiepka.accounting.repository.model.PaymentDao
import java.time.format.DateTimeFormatter

fun PaymentDao.toPayment(): Payment = Payment(
    date = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")),
    agent = agent,
    amount = amount)