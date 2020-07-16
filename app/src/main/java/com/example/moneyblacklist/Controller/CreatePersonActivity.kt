package com.example.moneyblacklist.Controller

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.moneyblacklist.R
import java.util.*

class CreatePersonActivity : AppCompatActivity(){

    var personAvatar = "profileDefault"
    var personColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_person)

    }


    fun generatePersonAvatar(view: View){
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)

        if (color == 0){
            personAvatar = "light$avatar"
        } else {
            personAvatar = "dark$avatar"
        }

        //val resourceId = resources.getIdentifier(personAvatar, "drawable", packageName)
        //createPersonImageView.setImageResource(resourceId)

    }

    fun generateColorClicked(view: View){
        val random = Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)

        //createPersonImageView.setBackgoundColor(Color.rgb(r,g,b))

        val savedR = r.toDouble() / 255
        val savedG = g.toDouble() / 255
        val savedB = b.toDouble() / 255

        personColor = "[$savedR, $savedG, $savedB, 1]"
        //println(personColor)

    }

    fun createPersonClicked(view: View){

    }

}