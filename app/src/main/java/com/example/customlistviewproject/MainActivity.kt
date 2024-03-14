package com.example.customlistviewproject

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val userImg = intArrayOf(R.drawable.pic0,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3)
        val userName = arrayOf("Sidhu Moose Wala","Daljit Dosanjh","Satinder Sartaj","Ranjit Bawa")
        val userLastMsg = arrayOf("Hello Everyone","Good morning","What are you doing","Where are you going")
        val userLastMsgTime = arrayOf("7:00 am","9:35 am","5:00 pm","3:30 pm")
        val userNumber = arrayOf("7814570407","8872038605","8146552092","8872966172")

        userArrayList = ArrayList()

        for (eachIndex in userName.indices){
            val user = User(userImg[eachIndex],userName[eachIndex],userLastMsg[eachIndex],userLastMsgTime[eachIndex]
            ,userNumber[eachIndex])

            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.list_View)

        listView.adapter = MyAdapter(this,userArrayList)



    }
}