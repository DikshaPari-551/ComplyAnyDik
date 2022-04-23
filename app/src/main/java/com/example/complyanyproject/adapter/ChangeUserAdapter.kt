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

class ChangeUserAdapter(val context: Context, val itemList : ArrayList<ChangeUserModelClass>):RecyclerView.Adapter<ChangeUserAdapter.ChangeUserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChangeUserAdapter.ChangeUserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.change_user_recycler_layout , parent , false)
        return ChangeUserViewHolder(view)

    }

    override fun onBindViewHolder(holder: ChangeUserAdapter.ChangeUserViewHolder, position: Int) {
        val userData = itemList[position]

        holder.itemName.text = userData.EntityName
        holder.itemUser.text = userData.CurrentUser
        holder.itemDepartment.text = userData.Department
        holder.itemUserName.text = userData.ReplaceUserName

        holder.imgChangeBlock.setOnClickListener {

            // added clicks on block
            holder.imgChangeBlock.setOnClickListener {

                if (holder.flag1 == true) {

                    val dialog = AlertDialog.Builder(context)
                    dialog.setTitle("Unblock")
                    dialog.setMessage("Are you sure you want to Unblock?")
                    dialog.setIcon(R.drawable.ic_block)
                    dialog.setPositiveButton("Yes") { text, listener ->
                        holder.imgChangeBlock.setImageDrawable(context.resources.getDrawable(R.drawable.ic_block))
                    }
                    dialog.setNegativeButton("No") { text, listener ->

                    }
                    dialog.create()
                    dialog.show()

                    holder.flag1 = false

                } else {

                    val dialog = AlertDialog.Builder(context)
                    dialog.setTitle("Block")
                    dialog.setMessage("Are you sure you want to Block?")
                    dialog.setIcon(R.drawable.ic_baseline_block_24)
                    dialog.setPositiveButton("Yes") { text, listener ->
                        holder.imgChangeBlock.setImageDrawable(context.resources.getDrawable(R.drawable.ic_baseline_block_24))
                    }
                    dialog.setNegativeButton("No") { text, listener ->

                    }
                    dialog.create()
                    dialog.show()

                    holder.flag1 = true
                }
            }


            }

        }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ChangeUserViewHolder(val view : View) : RecyclerView.ViewHolder(view) {

        val itemName : TextView = view.findViewById(R.id.itemName)
        val itemUser : TextView = view.findViewById(R.id.itemUser)
        val itemDepartment : TextView = view.findViewById(R.id.itemDepartment)
        val itemUserName : TextView = view.findViewById(R.id.itemUserName)
        val imgChangeBlock :ImageView = view.findViewById(R.id.imgChangeBlock)
        var flag1 = false


    }
}