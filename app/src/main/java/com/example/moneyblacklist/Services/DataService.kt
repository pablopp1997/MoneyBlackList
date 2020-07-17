package com.example.moneyblacklist.Services

import com.example.moneyblacklist.Model.Debt
import com.example.moneyblacklist.Model.Person

object DataService {

    val persons = listOf(
        Person("Pablo", "","#FFFFFF", null),
        Person("Catalin", "", "#000000", null)
    )

    val pablo_debts = listOf(
        Debt("Concepto1", 5.00, false),
        Debt("Concepto2", 5.30, true)
    )

    val catalin_debts = listOf(
        Debt("Concepto3", 2.50, false),
        Debt("Concepto4", 4.00, true)
    )

    val empty_debts = listOf<Debt>()

    fun getDebts(person: String): List<Debt>{
        return when(person){
            "Pablo" -> pablo_debts
            "Catalin" -> catalin_debts
            else -> empty_debts
        }
    }

}