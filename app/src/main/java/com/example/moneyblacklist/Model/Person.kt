package com.example.moneyblacklist.Model

class Person(val name: String, val image: String, val color: String, val debts: List<Debt>?){
    override fun toString(): String {
        return name
    }

}