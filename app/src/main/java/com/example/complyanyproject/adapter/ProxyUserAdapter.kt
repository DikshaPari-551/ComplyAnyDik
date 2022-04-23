package com.example.complyanyproject.adapter

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.ChangeUserModelClass
import com.example.complyanyproject.model.ProxyUserModelClass

class ProxyUserAdapter (val context: Context, val itemList : ArrayList<ProxyUserModelClass>):
    RecyclerView.Adapter<ProxyUserAdapter.ProxyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProxyUserAdapter.ProxyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.proxy_user_recycler_layout , parent , false)
        return ProxyViewHolder(view)

    }

    override fun onBindViewHolder(holder: ProxyViewHolder, position: Int) {
        val userData = itemList[position]

        holder.itemUserName.text = userData.UserName
        holder.itemEntityName.text = userData.EntityName
        holder.itemDepartment.text = userData.Department
        holder.itemEndDate.text = userData.ProxyEndDate

        holder.imgProxyUser.setOnClickListener {

            // added clicks on block
            holder.imgProxyUser.setOnClickListener {

                if (holder.flag == true) {

                    val dialog = AlertDialog.Builder(context)
                    dialog.setTitle("Unblock")
                    dialog.setMessage("Are you sure you want to Unblock?")
                    dialog.setIcon(R.drawable.ic_block)
                    dialog.setPositiveButton("Yes") { text, listener ->
                        holder.imgProxyUser.setImageDrawable(context.resources.getDrawable(R.drawable.ic_block))
                    }
                    dialog.setNegativeButton("No") { text, listener ->

                    }
                    dialog.create()
                    dialog.show()

                    holder.flag = false

                } else {

                    val dialog = AlertDialog.Builder(context)
                    dialog.setTitle("Block")
                    dialog.setMessage("Are you sure you want to Block?")
                    dialog.setIcon(R.drawable.ic_baseline_block_24)
                    dialog.setPositiveButton("Yes") { text, listener ->
                        holder.imgProxyUser.setImageDrawable(context.resources.getDrawable(R.drawable.ic_baseline_block_24))
                    }
                    dialog.setNegativeButton("No") { text, listener ->

                    }
                    dialog.create()
                    dialog.show()

                    holder.flag = true
                }


            }
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ProxyViewHolder(val view : View) : RecyclerView.ViewHolder(view) {

        val itemUserName : TextView = view.findViewById(R.id.itemUserName)
        val itemEntityName : TextView = view.findViewById(R.id.itemEntityName)
        val itemDepartment : TextView = view.findViewById(R.id.itemDepartment)
        val itemEndDate : TextView = view.findViewById(R.id.itemEndDate)
        val imgProxyUser : ImageView = view.findViewById(R.id.imgProxyUser)

        var flag = false
    }


}