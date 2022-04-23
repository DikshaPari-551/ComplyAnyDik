package com.example.complyanyproject.adapter

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.CreateUserActivity
import com.example.complyanyproject.interfaces.OnRecyclerClickListener
import com.example.complyanyproject.model.ModelClass

class UserAdapter(val context : Context, val itemList : ArrayList<ModelClass>,  val onRvClickListener: OnRecyclerClickListener): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_recycler_layout, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val userData = itemList[position]

        holder.userName.text = userData.name
        holder.userID.text = userData.id
        holder.userEmail.text = userData.email
        holder.userMobile.text = userData.mobile

        // added clicks on edit
        holder.imgUserEdit.setOnClickListener {

            val dialog = AlertDialog.Builder(context)
            dialog.setTitle("Edit")
            dialog.setMessage("Are you sure you want to Edit?")
            dialog.setPositiveButton("Yes"){text, listener->
                Intent(context, CreateUserActivity::class.java).also {
                    context.startActivity(it)
                }
            }
            dialog.setNegativeButton("No"){text, listener ->

            }
            dialog.create()
            dialog.show()
        }

        // added clicks on block
        holder.imgUserBlock.setOnClickListener {

            if (holder.flag1 == true) {

                val dialog = AlertDialog.Builder(context)
                dialog.setTitle("Unblock")
                dialog.setMessage("Are you sure you want to Unblock?")
                dialog.setIcon(R.drawable.ic_block)
                dialog.setPositiveButton("Yes") { text, listener ->
                    holder.imgUserBlock.setImageDrawable(context.resources.getDrawable(R.drawable.ic_block))
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
                    holder.imgUserBlock.setImageDrawable(context.resources.getDrawable(R.drawable.ic_baseline_block_24))
                }
                dialog.setNegativeButton("No") { text, listener ->

                }
                dialog.create()
                dialog.show()

                holder.flag1 = true
            }

            holder.layout.setOnClickListener {
                onRvClickListener.onClick(position)
            }

        }

        // added clicks on delete
        holder.imgUserDelete.setOnClickListener {

            val dialog = AlertDialog.Builder(context)
            dialog.setTitle("Delete")
            dialog.setMessage("Are you sure you want to Delete?")
            dialog.setIcon(R.drawable.ic_delete)
            dialog.setPositiveButton("Yes") { text, listener ->

            }
            dialog.setNegativeButton("No") { text, listener ->

            }
            dialog.create()
            dialog.show()

        }

        // added clicks on naviagate
        holder.imgUserNavigate.setOnClickListener {
            Intent(context, CreateUserActivity::class.java).also{
                context.startActivity(it)
            }
        }

        // added clicks on layout
        holder.layout.setOnClickListener {
            onRvClickListener.onClick(position)
        }

    }


    override fun getItemCount(): Int {
        return itemList.size
    }

    class UserViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val userName : TextView = view.findViewById(R.id.itemName)
        val userID: TextView = view.findViewById(R.id.itemId)
        val userEmail: TextView = view.findViewById(R.id.itemEmail)
        val userMobile : TextView = view.findViewById(R.id.itemMobile)
        val layout :   CardView = view.findViewById(R.id.layout)
        val imgUserBlock : ImageView = view.findViewById(R.id.imgUserBlock)
        val imgUserEdit : ImageView = view.findViewById(R.id.imgUserEdit)
        val imgUserDelete : ImageView = view.findViewById(R.id.imgUserDelete)
        val imgUserNavigate : ImageView = view.findViewById(R.id.imgUserNavigate)


        var flag1 = false
    }

}