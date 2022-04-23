package com.example.complyanyproject.activity

import android.app.Activity
import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityNewComplianceBinding
import com.example.complyanyproject.selectorActivity.CompanySelectorActivity
import java.util.*

class NewComplianceActivity : AppCompatActivity() {

    var flag1 = false
    var flag2 = false
    var flag3 = false
    var flag4 = false

    private lateinit var binding : ActivityNewComplianceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewComplianceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // added back method
        binding.backNewComplaince.setOnClickListener {
            onBackPressed()
        }

        // added click on Select Entity option
        binding.selectEntityCreateCompliance.setOnClickListener {

            if (flag1 != true){

                binding.selectEntityLayoutCreateCompliance.visibility = View.VISIBLE
                binding.cvSelectLawAndUserCreateCompliance.visibility = View.GONE
                binding.cvDefineComplianceLayout.visibility = View.GONE
                binding.cvReminderLayout.visibility = View.GONE

            }
            else{
                flag1 = true
            }
        }

        // added clicks on law and user
        binding.rlSelectLawAndUserLayout.setOnClickListener {

            if (flag2 != true){
                binding.selectEntityLayoutCreateCompliance.visibility = View.GONE
                binding.cvSelectLawAndUserCreateCompliance.visibility = View.VISIBLE
                binding.cvDefineComplianceLayout.visibility = View.GONE
                binding.cvReminderLayout.visibility = View.GONE
            }
            else{
                flag2 = true
            }
        }

        // added clicks on define compliance
        binding.rlSelectDefineComplianceLayout.setOnClickListener {

            if(flag3 != true){

                binding.selectEntityLayoutCreateCompliance.visibility = View.GONE
                binding.cvSelectLawAndUserCreateCompliance.visibility = View.GONE
                binding.cvDefineComplianceLayout.visibility = View.VISIBLE
                binding.cvReminderLayout.visibility = View.GONE

            }
            else{
                flag3 = true
            }
        }

        // added clicks on reminder and escalation
        binding.rlReminderLayout.setOnClickListener {

            if (flag4 != true){

                binding.selectEntityLayoutCreateCompliance.visibility = View.GONE
                binding.cvSelectLawAndUserCreateCompliance.visibility = View.GONE
                binding.cvDefineComplianceLayout.visibility = View.GONE
                binding.cvReminderLayout.visibility = View.VISIBLE

            }
            else{
                flag4 = true
            }
        }

        // added toasts on every  buttons
        binding.btnReview.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        binding.btnComplianceDialog.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        binding.btnAdd.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        binding.btnRecurring.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        binding.btnClientSubGroupbutton.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        binding.btnClientNew.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        binding.btnComplianceType.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }





        // added clicks selector box
        // added select entity
        binding.rlSelectGlobalRegionCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 1)
            }
        }

        binding.rlSelectGlobalSubRegionCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 2)
            }
        }

        binding.rlSelectCountyOfficeCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 3)
            }
        }

        binding.rlSelectCountryRegionCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 4)
            }
        }

        binding.rlSelectEntityCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 5)
            }
        }

        // added select law and user
        binding.rlSelectComplianceTypeCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 6)
            }
        }

        binding.rlSelectLawAndHeadCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 7)
            }
        }

        binding.rlSelectSubLawAndSubHeadCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 8)
            }
        }

        binding.rlSelectDepartmentCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 9)
            }
        }

        binding.rlSelectSubDepartmentCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 10)
            }
        }

        binding.rlSelectResponsibleUserCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 11)
            }
        }

        binding.rlSelectClientGroupCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 12)
            }
        }

        binding.rlSelectClientSubGroupCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 13)
            }
        }

        binding.rlSelectClientCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 14)
            }
        }

        binding.llSelectPenaltyLateCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 15)
            }
        }

        binding.rlSelectComplianceNatureCreateCompliance.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 16)
            }
        }

        binding.rlSelectEscapsulationCreateCompliance1.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 17)
            }
        }

        binding.rlSelectEscapsulationCreateCompliance2.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 18)
            }
        }

        // added file picker code

        binding.btnAttach.setOnClickListener {
            binding.txtFileName.text = "ComplyAny.pdf"
        }


        // added date picker code

        val calendar: Calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val date = calendar.get(Calendar.DAY_OF_MONTH)

        binding.txtDueDate.text = "$date-${month + 1}-$year"

        binding.txtRevisedDueDate.text = "$date-${month + 1}-$year"

        binding.imgDueDate.setOnClickListener {

            val datePickerDialog = this.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        binding.txtDueDate.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                    }, year, month, date
                )
            }

            datePickerDialog?.show()
        }

        binding.imgRevisedDueDate.setOnClickListener {

            val datePickerDialog = this.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        binding.txtRevisedDueDate.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                    }, year, month, date
                )
            }

            datePickerDialog?.show()
        }

    }

    override fun onBackPressed() {
        finish()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // added text in Select Entity
        if (requestCode == 1){
            if (resultCode == Activity.RESULT_OK){
                binding.txtGlobalRegionCreateCompliance.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 2){
            if (resultCode == Activity.RESULT_OK){
                binding.txtGlobalSubRegionCreateCompliance.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 3){
            if (resultCode == Activity.RESULT_OK){
                binding.txtCountryOfficeCreateCompliance.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 4){
            if (resultCode == Activity.RESULT_OK){
                binding.txtCountryRegionCreateCompliance.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 5){
            if (resultCode == Activity.RESULT_OK){
                binding.txtEntityNameCreateCompliance.text = data?.getStringExtra("hello")
            }
        }


        // added text in select law and user
        if (requestCode == 6){
            if (resultCode == Activity.RESULT_OK){
                binding.txtComplianceTypeCreateCompliance.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 7){
            if (resultCode == Activity.RESULT_OK){
                binding.txtLawAndHeadCreateCompliance.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 8){
            if (resultCode == Activity.RESULT_OK){
                binding.SubLawAndSubHeadTextView.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 9){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectDepartmentCreateCompliance.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 10){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSubDepartmentCreateCompliance.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 11){
            if (resultCode == Activity.RESULT_OK){
                binding.txtResponsibleUserCreateCompliance.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 12){
            if (resultCode == Activity.RESULT_OK){
                binding.txtClientGroupCreateCompliance.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 13){
            if (resultCode == Activity.RESULT_OK){
                binding.txtClientSubGroupCreateCompliance.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 14){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectClientCreateCompliance.text = data?.getStringExtra("hello")
            }
        }


        // added text in define compliance
        if (requestCode == 15){
            if (resultCode == Activity.RESULT_OK){
                binding.txtPenaltyLateCreateCompliance.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 16){
            if (resultCode == Activity.RESULT_OK){
                binding.txtComplianceNatureCreateCompliance.text = data?.getStringExtra("hello")
            }
        }


        // added text in reminder and escalation
        if (requestCode == 17){
            if (resultCode == Activity.RESULT_OK){
                binding.txtEscalationCreateCompliance1.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 18){
            if (resultCode == Activity.RESULT_OK){
                binding.txtEscalationCreateCompliance2.text = data?.getStringExtra("hello")
            }
        }

    }

}