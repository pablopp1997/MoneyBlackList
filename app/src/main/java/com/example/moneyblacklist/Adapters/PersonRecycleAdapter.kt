package com.example.moneyblacklist.Adapters

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moneyblacklist.Model.Person
import com.example.moneyblacklist.R

class PersonRecycleAdapter(val context: Context, val persons: List<Person>) : RecyclerView.Adapter<PersonRecycleAdapter.Holder>() {

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val personImage = itemView?.findViewById<ImageView>(R.id.personImage)
        val personName = itemView?.findViewById<TextView>(R.id.personName)

        fun bindPerson(person: Person, context: Context){
            val resourceId = context.resources.getIdentifier(person.image, "drawable", context.packageName)
            personImage?.setImageResource(resourceId)
            personName?.text = person.name
            personName?.setTextColor(Color.WHITE)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.person_list_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return persons.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindPerson(persons[position], context)
    }
}