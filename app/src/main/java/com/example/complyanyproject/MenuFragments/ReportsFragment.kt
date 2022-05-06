package com.example.complyanyproject.MenuFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.complyanyproject.R

class ReportsFragment : Fragment() {

    lateinit var global : TextView
    lateinit var entity : TextView
    lateinit var department : TextView
    lateinit var globalEntity : TextView
    lateinit var entityFunction : TextView
    lateinit var rent : TextView
    lateinit var insuarance : TextView
    lateinit var agreement : TextView
    lateinit var bankGurantee : TextView
    lateinit var complienceData : TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_reports, container, false)

        global = view.findViewById(R.id.globalLayout)
        entity = view.findViewById(R.id.entityLayout)
        department = view.findViewById(R.id.departmentLayout)
        globalEntity = view.findViewById(R.id.globalEntityLayout)
        entityFunction = view.findViewById(R.id.entityFuntionLayout)
        rent = view.findViewById(R.id.rentLayout)
        insuarance = view.findViewById(R.id.insuranceLayout)
        agreement = view.findViewById(R.id.agreementLayout)
        bankGurantee = view.findViewById(R.id.bankLayout)
        complienceData = view.findViewById(R.id.ComplienceDataLayout)


        global.setOnClickListener {
            Toast.makeText(context, "Global", Toast.LENGTH_SHORT).show()
        }
        entity.setOnClickListener {
            Toast.makeText(context, "Entity", Toast.LENGTH_SHORT).show()
        }
        department.setOnClickListener {
            Toast.makeText(context, "Department", Toast.LENGTH_SHORT).show()
        }
        globalEntity.setOnClickListener {
            Toast.makeText(context, "Global Entity Department", Toast.LENGTH_SHORT).show()
        }
        entityFunction.setOnClickListener {
            Toast.makeText(context, "Entity Function", Toast.LENGTH_SHORT).show()
        }
        rent.setOnClickListener {
            Toast.makeText(context, "Rent", Toast.LENGTH_SHORT).show()
        }
        insuarance.setOnClickListener {
            Toast.makeText(context, "Insurance", Toast.LENGTH_SHORT).show()
        }
        agreement.setOnClickListener {
            Toast.makeText(context, "Agreement", Toast.LENGTH_SHORT).show()
        }
        complienceData.setOnClickListener {
            Toast.makeText(context, "Complience Data", Toast.LENGTH_SHORT).show()
        }
        bankGurantee.setOnClickListener {
            Toast.makeText(context, "Bank Guarantee", Toast.LENGTH_SHORT).show()
        }


        return view
    }


}