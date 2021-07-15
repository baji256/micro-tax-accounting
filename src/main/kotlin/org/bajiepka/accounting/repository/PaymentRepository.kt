package org.bajiepka.accounting.repository

import org.bajiepka.accounting.repository.model.PaymentDao
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PaymentRepository: CrudRepository<PaymentDao, Int>