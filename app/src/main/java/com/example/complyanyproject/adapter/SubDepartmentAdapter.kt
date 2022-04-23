package com.example.complyanyproject.adapter

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.LoginActivity
import com.example.complyanyproject.fragment.sharedPreferences
import com.example.complyanyproject.interfaces.OnRecyclerClickListener
import com.example.complyanyproject.model.SubDepartmentModelClass

class SubDepartmentAdapter(val context : Context, val itemList : ArrayList<SubDepartmentModelClass>) : RecyclerView.Adapter<SubDepartmentAdapter.SubDepartmentViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SubDepartmentAdapter.SubDepartmentViewHolder{
        val view = LayoutInflater.from(context).inflate(R.layout.sub_department_recycler_layout, parent , false)
        return SubDepartmentViewHolder(view)
    }

    override fun onBindViewHolder(holder: SubDepartmentAdapter.SubDepartmentViewHolder, position: Int) {
        val userData = itemList[position]

        holder.departmentName.text = userData.departmentName
        holder.subDepartmentName.text = userData.subDepartmentName

        holder.imgBlock1.setOnClickListener {

            if (holder.flag == true){

                val dialog = AlertDialog.Builder(context)
                dialog.setTitle("Unblock")
                dialog.setMessage("Are you sure you want to Unblock?")
                dialog.setIcon(R.drawable.ic_block)
                dialog.setPositiveButton("Yes"){text , listener ->
                    holder.imgBlock1.setImageDrawable(context.resources.getDrawable(R.drawable.ic_block))
                }
                dialog.setNegativeButton("No"){text , listener ->

                }
                dialog.create()
                dialog.show()

                holder.flag = false

            }else{

                val dialog = AlertDialog.Builder(context)
                dialog.setTitle("Block")
                dialog.setMessage("Are you sure you want to Block?")
                dialog.setIcon(R.drawable.ic_baseline_block_24)
                dialog.setPositiveButton("Yes"){text , listener ->
                    holder.imgBlock1.setImageDrawable(context.resources.getDrawable(R.drawable.ic_baseline_block_24))
                }
                dialog.setNegativeButton("No"){text , listener ->

                }
                dialog.create()
                dialog.show()

                holder.flag = true
            }

        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class SubDepartmentViewHolder(val view : View) : RecyclerView.ViewHolder(view) {
        val departmentName : TextView = view.findViewById(R.id.departmentName)
        val subDepartmentName : TextView = view.findViewById(R.id.subDepartmentName)
        val imgBlock1 : ImageView = view.findViewById(R.id.imgBlock1)
        var flag = false
    }
}