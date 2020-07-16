package com.example.moneyblacklist.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moneyblacklist.Adapters.PersonRecycleAdapter
import com.example.moneyblacklist.R
import com.example.moneyblacklist.Services.DataService
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    lateinit var adapter : PersonRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Adapter ficha Person
        adapter = PersonRecycleAdapter(this, DataService.persons)
        personListView.adapter = adapter

        //Manager Layout
        val layoutManager = LinearLayoutManager(this)
        personListView.layoutManager = layoutManager
        personListView.setHasFixedSize(true)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()

            //AQUI NOS LLEVARIA A LA PANTALLA DE AÑADIR UN NUEVO DEUDOR (PERSONA)
            val createPersonIntent = Intent(this, CreatePersonActivity::class.java)
            startActivity(createPersonIntent)

        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
    }



    fun createUserBtnClicked(view: View){
        val createPersonIntent = Intent(this, CreatePersonActivity::class.java)
        startActivity(createPersonIntent)
    }
}