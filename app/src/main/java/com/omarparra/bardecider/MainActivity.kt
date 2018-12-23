package com.omarparra.bardecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val myBarList = arrayListOf("WingMan", "Barezzito", "La Real", "Vancouver Wings", "Chapu", "Banana's")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBarBtn.setOnClickListener {
            //set a random value
            val random = Random()
            val randomList = random.nextInt(myBarList.count())
            //now we have to assign the value to the txt
            chooseBarTxt.text = myBarList[randomList]
        }

        addBarBtn.setOnClickListener {
            //get Bartext
            val addBar = addBarTxt.text.toString()
            //add it to our list
            myBarList.add(addBar)
            //clear our input bar
            addBarTxt.text.clear()
            //we print the myBarList elements
            println(myBarList)
        }
    }
}
