package org.bajiepka.accounting.controller

import org.bajiepka.accounting.model.Payment
import org.bajiepka.accounting.service.PaymentService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute

@Controller
class PaymentsController(
    private val paymentService: PaymentService
) {

    @ModelAttribute
    fun pageTitle(model: Model) {
        model.addAttribute("title", "Taxes")
        model.addAttribute("description", "Микро-учёт уплаты налогов.")
    }

    @GetMapping("/accounts")
    fun index(model: Model): String {
        model.addAttribute("payments", paymentService.getPayments())
        return "index"
    }
}