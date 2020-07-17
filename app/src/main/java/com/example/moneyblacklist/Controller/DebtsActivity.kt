package com.example.moneyblacklist.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moneyblacklist.Adapters.DebtsRecycleAdapter
import com.example.moneyblacklist.R
import com.example.moneyblacklist.Services.DataService
import com.example.moneyblacklist.Utilities.EXTRA_PERSON
import kotlinx.android.synthetic.main.activity_debts.*
import kotlinx.android.synthetic.main.content_main.*

class DebtsActivity : AppCompatActivity() {

    lateinit var adapter: DebtsRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debts)

        val personType = intent.getStringExtra(EXTRA_PERSON)
        adapter = DebtsRecycleAdapter(this, DataService.getDebts(personType.toString()))

//        val layoutManager = GridLayoutManager(this, 2)
//        debtsListView.layoutManager = layoutManager
//        debtsListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        debtsListView.layoutManager = layoutManager
        debtsListView.adapter = adapter
        debtsListView.setHasFixedSize(true)

    }
}