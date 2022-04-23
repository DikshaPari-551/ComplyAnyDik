package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityConfigureStandardBinding
import com.example.complyanyproject.selectorActivity.CompanySelectorActivity

class ConfigureStandardActivity : AppCompatActivity() {

    private lateinit var binding : ActivityConfigureStandardBinding

    // Buttons
    lateinit var btnNextStandardCompilance : Button
    lateinit var btnNextApplicableLaws : Button
    lateinit var btnBackAssignUserAndDepartment : Button

    // card view as layout
    lateinit var cvAssignUserLayout : CardView
    lateinit var cvAppilicableLayout : CardView

    // textview
    lateinit var backStandardComplience : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConfigureStandardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Buttons
        btnNextStandardCompilance = findViewById(R.id.btnNextStandardCompilance)
        btnNextApplicableLaws = findViewById(R.id.btnNextApplicableLaws)
        btnBackAssignUserAndDepartment = findViewById(R.id.btnBackAssignUserAndDepartment)

        // card view
        cvAssignUserLayout = findViewById(R.id.cvAssignUserLayout)
        cvAppilicableLayout = findViewById(R.id.cvAppilicableLayout)

        // adding back btn method
        backStandardComplience = findViewById(R.id.backStandardComplience)
        backStandardComplience.setOnClickListener {
            onBackPressed()
        }

        // added clicks on standard next
        btnNextStandardCompilance.setOnClickListener {
            cvAppilicableLayout.visibility = View.VISIBLE
            cvAssignUserLayout.visibility = View.GONE
        }

        // added clicks on applicable law next
        btnNextApplicableLaws.setOnClickListener {
            cvAppilicableLayout.visibility = View.GONE
            cvAssignUserLayout.visibility = View.VISIBLE
        }

        // added clicks on Assign user back
        btnBackAssignUserAndDepartment.setOnClickListener {
            cvAssignUserLayout.visibility = View.GONE
            cvAppilicableLayout.visibility = View.VISIBLE
        }

        
        // added clicks on Standard compliance select option
        // added clicks on global region
        binding.rlSelectGlobalRegion.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 1)
            }
        }

        // added clicks on global sub regions
        binding.rlSelectGlobalSubRegion.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 2)
            }
        }

        // added clicks on country office
        binding.rlCountyOffice.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 3)
            }
        }

        // added clicks on entity name
        binding.rlEntityName.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 4)
            }
        }

        // added clicks on applicable laws select option
        // added clicks on income tax
        binding.rlSelectIncomeTax1.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 11)
            }
        }
        binding.rlSelectIncomeTax2.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 12)
            }
        }
        binding.rlSelectIncomeTax3.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 13)
            }
        }

        // added clicks on good and service
        binding.rlSelectGoodsAndService1.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 21)
            }
        }

        binding.rlSelectGoodsAndService2.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 22)
            }
        }

        // added clicks on labour law
        binding.rlSelectLabourLaw.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also {
                startActivityForResult(it, 31)
            }
        }

        // added clicks on corporate law
        binding.rlSelectCorporateLaw.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 32)
            }
        }

        // added clicks on state professional tax
        binding.rlSelectStateProfessionalTax.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 33)
            }
        }

        // added click on assign user and department select option
        // added clicks on Income Tax
        binding.rlSelectIncomeTax11.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 101)
            }
        }

        binding.rlSelectIncomeTax12.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 102)
            }
        }

        binding.rlSelectIncomeTax13.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 103)
            }
        }

        // added clicks on Goods and Services
        binding.rlSelectGoodsAndService111.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 111)
            }
        }

        binding.rlSelectGoodsAndService12.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 112)
            }
        }

        binding.rlSelectGoodsAndService13.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 113)
            }
        }


        // added clicks on Companies act
        binding.rlSelectCompaniesAct1.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 201)
            }
        }

        binding.rlSelectCompaniesAct2.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 202)
            }
        }

        binding.rlSelectCompaniesAct3.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 203)
            }
        }

        // added clicks on profident fund act
        binding.rlSelectProfidentFundAct1.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 301)
            }
        }

        binding.rlSelectProfidentFundAct2.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 302)
            }
        }

        binding.rlSelectProfidentFundAct3.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 303)
            }
        }

        // added clicks on Employe state insurance
        binding.rlSelectEmployeesStateInsurance1.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 401)
            }
        }

        binding.rlSelectEmployeesStateInsurance2.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 402)
            }
        }

        binding.rlSelectEmployeesStateInsurance3.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 403)
            }
        }

    }

    override fun onBackPressed() {
        finish()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // added text in standard compliance
        if (requestCode == 1){
            if (resultCode == Activity.RESULT_OK){
                binding.txtGlobalRegion.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 2){
            if (resultCode == Activity.RESULT_OK){
                binding.txtGlobalSubRegion.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 3){
            if (resultCode == Activity.RESULT_OK){
                binding.txtCountyOffice.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 4){
            if (resultCode == Activity.RESULT_OK){
                binding.txtEntityName.text = data?.getStringExtra("hello")
            }
        }



        // added text in Applicable laws
        // added income tax
        if (requestCode == 11){
            if (resultCode == Activity.RESULT_OK){
                binding.txtIncomeTax1.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 12){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectIncomeTax2.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 13){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectIncomeTax3.text = data?.getStringExtra("hello")
            }
        }

        // added good and service
        if (requestCode == 21){
            if (resultCode == Activity.RESULT_OK){
                binding.txtGoodsAndService1.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 22){
            if (resultCode == Activity.RESULT_OK){
                binding.txtGoodsAndService2.text = data?.getStringExtra("hello")
            }
        }

        // added labour law
        if (requestCode == 31){
            if (resultCode == Activity.RESULT_OK){
                binding.txtLabourLaw.text = data?.getStringExtra("hello")
            }
        }

        // added corporate law
        if (requestCode == 32){
            if (resultCode == Activity.RESULT_OK){
                binding.txtCorporateLaw.text = data?.getStringExtra("hello")
            }
        }

        // added state Professional Tax
        if (requestCode == 33){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectStateProfessionalTax.text = data?.getStringExtra("hello")
            }
        }

        // added text in assign user and department
        // income text
        if (requestCode == 101){
            if (resultCode == Activity.RESULT_OK){
                binding.txtIncomeTax11.text = data?.getStringExtra("hello")
            }
        }
        if (requestCode == 102){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectIncomeTax12.text = data?.getStringExtra("hello")
            }
        }
        if (requestCode == 103){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectIncomeTax13.text = data?.getStringExtra("hello")
            }
        }

        // good and service
        if (requestCode == 111){
            if (resultCode == Activity.RESULT_OK){
                binding.txtGoodsAndService11.text = data?.getStringExtra("hello")
            }
        }
        if (requestCode == 112){
            if (resultCode == Activity.RESULT_OK){
                binding.txtGoodsAndService12.text = data?.getStringExtra("hello")
            }
        }
        if (requestCode == 113){
            if (resultCode == Activity.RESULT_OK){
                binding.txtGoodsAndService13.text = data?.getStringExtra("hello")
            }
        }

        // companies act
        if (requestCode == 201){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectCompaniesAct1.text = data?.getStringExtra("hello")
            }
        }
        if (requestCode == 202){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectCompaniesAct2.text = data?.getStringExtra("hello")
            }
        }
        if (requestCode == 203){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectCompaniesAct3.text = data?.getStringExtra("hello")
            }
        }

        // profident fund act
        if (requestCode == 301){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectProfidentFundAct1.text = data?.getStringExtra("hello")
            }
        }
        if (requestCode == 302){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectProfidentFundAct2.text = data?.getStringExtra("hello")
            }
        }
        if (requestCode == 303){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectProfidentFundAct3.text = data?.getStringExtra("hello")
            }
        }

        // Employes state Insurance
        if (requestCode == 401){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectEmployeesStateInsurance1.text = data?.getStringExtra("hello")
            }
        }
        if (requestCode == 402){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectEmployeesStateInsurance2.text = data?.getStringExtra("hello")
            }
        }
        if (requestCode == 403){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectEmployeesStateInsurance3.text = data?.getStringExtra("hello")
            }
        }
    }
}