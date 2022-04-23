package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.UserRoleModelClass

class UserRoleAdapter(val context: Context, val itemList : ArrayList<UserRoleModelClass> ):
    RecyclerView.Adapter<UserRoleAdapter.UserRoleViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UserRoleViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.user_role_recycler_layout, parent, false)
        return UserRoleViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserRoleViewHolder, position: Int) {
        val userData = itemList[position]

        holder.userRoleName.text = userData.roleName
        holder.userRoleCreatedAt.text = userData.createdAt
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class UserRoleViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val userRoleName : TextView = view.findViewById(R.id.userRoleName)
        val userRoleCreatedAt : TextView = view.findViewById(R.id.userRoleCreatedAt)

    }
}