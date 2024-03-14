package com.example.customlistviewproject

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(val context : Activity,val arrayList: ArrayList<User>) :
    ArrayAdapter<User>(context,R.layout.each_item,arrayList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)

        val view = inflater.inflate(R.layout.each_item,null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.tv_name)
        val lastMsg = view.findViewById<TextView>(R.id.tV_last_msg)
        val lastMsgTime = view.findViewById<TextView>(R.id.tV_lastmsg_time)


        image.setImageResource(arrayList[position].UserImageId)
        name.text = arrayList[position].UserName
        lastMsg.text = arrayList[position].UserLastMsg
        lastMsgTime.text = arrayList[position].UserLastMsgTime



        return view
    }

}
