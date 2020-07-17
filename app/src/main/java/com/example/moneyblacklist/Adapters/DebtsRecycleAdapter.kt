package com.example.moneyblacklist.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moneyblacklist.Model.Debt
import com.example.moneyblacklist.R
import kotlinx.android.synthetic.main.debt_list_item.view.*

class DebtsRecycleAdapter( val context: Context, val debts: List<Debt>): RecyclerView.Adapter<DebtsRecycleAdapter.DebtHolder>() {

    inner class DebtHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val debtConcept = itemView?.findViewById<TextView>(R.id.debtConcept)
        val debtAmount = itemView?.findViewById<TextView>(R.id.debtAmount)

        fun bindDebt(debt: Debt, context: Context){
            debtConcept?.text = debt.concept
            debtAmount?.text = String.format("%.0f", debt.amount) + " €";
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DebtHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.debt_list_item, parent, false)
        return DebtHolder(view)
    }

    override fun getItemCount(): Int {
        return debts.count()
    }

    override fun onBindViewHolder(holder: DebtHolder, position: Int) {
        holder?.bindDebt(debts[position], context)
    }

}