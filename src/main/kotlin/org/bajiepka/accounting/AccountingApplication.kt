package org.bajiepka.accounting

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class AccountingApplication

fun main(args: Array<String>) {
    runApplication<AccountingApplication>(*args)
}
