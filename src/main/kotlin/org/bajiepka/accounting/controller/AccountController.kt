package org.bajiepka.accounting.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute

@Controller
class AccountController {

    @ModelAttribute
    fun pageTitle(model: Model) {
        model.addAttribute("title", "Taxes.")
        model.addAttribute("description", "Микро-учёт уплаты налогов.")
    }

    @GetMapping("/accounts")
    fun index(model: Model): String {
        val payments = null
        model.addAttribute("payments", payments)
        return "index"
    }
}