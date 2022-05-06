package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.complyanyproject.databinding.ActivityProfileBinding
import java.io.IOException

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    val SELECT_REQUEST_CODE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnUpate.setOnClickListener {

                val firstName = binding.etFirstName.text.toString().trim()
                val lastName = binding.etLastName.text.toString().trim()
                val email = binding.etEmail.text.toString().trim()
                val mobileNumber = binding.etMobileNumber.text.toString()

                if (firstName.isEmpty()){
                    binding.txtFirstName.visibility = View.VISIBLE
                    binding.txtFirstName.text = "*Please enter first name"
                    binding.txtLastName.text=""
                    binding.txtEmail.text=""
                    binding.txtPhone.text=""
                    binding.etFirstName.requestFocus()
                }
                else if(firstName.length < 2){
                    binding.txtFirstName.text = "*First name contains atleast 2 characters"
                  //  binding.txtFirstName.text = "*Please enter first name"
                    binding.txtLastName.text=""
                    binding.txtEmail.text=""
                    binding.txtPhone.text=""
                    binding.etFirstName.requestFocus()

                }
                else if (lastName.isEmpty()){
                    binding.txtLastName.visibility = View.VISIBLE
                    binding.txtLastName.text = "*Please enter last name"
                    binding.txtFirstName.text = ""
                  //  binding.txtLastName.text=""
                    binding.txtEmail.text=""
                    binding.txtPhone.text=""
                    binding.etLastName.requestFocus()

                }
                else if (lastName.length < 2){
                    binding.txtLastName.text = "*Last name contains atleast 2 characters"
                    binding.txtFirstName.text = ""
                   // binding.txtLastName.text=""
                    binding.txtEmail.text=""
                    binding.txtPhone.text=""
                    binding.etLastName.requestFocus()

                }
                else if (lastName == firstName){
                    binding.txtLastName.text = "*Last name must be different"
                    binding.txtFirstName.text = ""
                   // binding.txtLastName.text=""
                    binding.txtEmail.text=""
                    binding.txtPhone.text=""
                    binding.etLastName.requestFocus()

                }
                else if (email.isEmpty()){
                    binding.txtEmail.visibility = View.VISIBLE
                    binding.txtEmail.text = "*Please enter email address"
                    binding.txtFirstName.text = ""
                    binding.txtLastName.text=""
                    binding.txtPhone.text=""
                    binding.etEmail.requestFocus()

                }
                else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    binding.txtEmail.text = "*Please enter valid email"
                    binding.etEmail.requestFocus()
                    binding.txtFirstName.text = ""
                    binding.txtLastName.text=""
                   // binding.txtEmail.text=""
                    binding.txtPhone.text=""

                }
                else if(mobileNumber.isEmpty()){
                    binding.txtPhone.visibility = View.VISIBLE
                    binding.txtPhone.text = "*Please enter mobile number"
                    binding.txtFirstName.text = ""
                    binding.txtLastName.text=""
                    binding.txtEmail.text=""
             //       binding.txtPhone.text=""
                    binding.etMobileNumber.requestFocus()

                }
                else if(mobileNumber.length < 10){
                    binding.txtPhone.visibility = View.VISIBLE
                    binding.txtPhone.text = "*Please enter valid number"
                    binding.txtFirstName.text = ""
                    binding.txtLastName.text=""
                    binding.txtEmail.text=""
                //    binding.txtPhone.text=""
                    binding.etMobileNumber.requestFocus()

                }
                else{

                    // hide tv texts
                    binding.txtFirstName.visibility = View.GONE
                    binding.txtLastName.visibility = View.GONE
                    binding.txtEmail.visibility = View.GONE
                    binding.txtPhone.visibility = View.GONE

                    // remove texts of tv texts
                    binding.txtFirstName.text = ""
                    binding.txtLastName.text = ""
                    binding.txtEmail.text = ""
                    binding.txtPhone.text = ""

                    // remove texts from edit text
                    binding.etFirstName.text.clear()
                    binding.etLastName.text.clear()
                    binding.etEmail.text.clear()
                    binding.etMobileNumber.text.clear()
                    binding.etAddress.text.clear()

                    Toast.makeText(this, "Profile Updated...",Toast.LENGTH_SHORT).show()
                }
        }


        // added image picker code
        binding.imageIcon.setOnClickListener {
            val galleryIntent = Intent(
                Intent.ACTION_PICK,
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            )
            startActivityForResult(galleryIntent, SELECT_REQUEST_CODE)
        }

        binding.circleImageView.setOnClickListener {
            val galleryIntent = Intent(
                Intent.ACTION_PICK,
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            )
            startActivityForResult(galleryIntent, SELECT_REQUEST_CODE)
        }

        binding.toolbarBackIcon.setOnClickListener {
            onBackPressed()
        }

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // added image in image view
        if (resultCode == Activity.RESULT_CANCELED) {
            return
        }

        if (requestCode == SELECT_REQUEST_CODE) {
            if (data != null) {
                val contentURI: Uri? = data.data
                try {
                    val bitmap =
                        MediaStore.Images.Media.getBitmap(this?.contentResolver, contentURI)
                    binding.circleImageView.setImageBitmap(bitmap)
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
        }
    }


    override fun onBackPressed() {
        finish()
    }

//    // validating firstname
//    private fun setFirstNameFocusChangeListener() : Boolean{
//
//        binding.etFirstName.setOnFocusChangeListener {_, focus ->
//
//            if (!focus){
//
//                val firstName = binding.etFirstName.text.toString().trim()
//
//                if(firstName.isEmpty()){
//                    flag1 = false
//                    binding.etFirstName.setError("This field is required")
//                }
//                else if(firstName.length < 2){
//                    flag1 = false
//                    binding.etFirstName.setError("first name contains atlease 2 characters")
//                }
//                else{
//                    flag1 = true
//                }
////                else{
////                    val upperString: String =
////                        firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase()
////                }
//            }
//        }
//        if (flag1){
//            return flag1
//        }
//        return flag1
//    }
//
//
//    // validating lastname
//    private fun setLastNameFocusChangeListener() : Boolean{
//
//        val firstName = binding.etFirstName.text.toString().trim()
//        binding.etLastName.setOnFocusChangeListener {_, focus ->
//
//            if (!focus){
//                val lastName = binding.etLastName.text.toString().trim()
//
//                if(lastName.isEmpty()){
//                    flag2 = false
//                    binding.etLastName.setError("This field is required")
//                }
//                else if(lastName.length < 2){
//                    flag2 = false
//                    binding.etLastName.setError("last name contains atleast 2 characters")
//                }
//                else if(firstName == lastName){
//                    flag2 = false
//                    binding.etLastName.setError("last name must be different")
//                }
//                else{
//                    flag2 = true
//                }
////                else{
////                    val upperString: String =
////                        firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase()
////                }
//            }
//        }
//        if (flag2){
//            return flag2
//        }
//        return flag2
//    }
//
//    // validating email
//    private fun setEmailFocusChangeListener() : Boolean{
//
//
//        binding.etEmail.setOnFocusChangeListener {_, focus ->
//
//            if (!focus){
//
//                val email = binding.etEmail.text.toString().trim()
//
//                if (email.isEmpty()){
//                    flag3 = false
//                    binding.etEmail.setError("This field is required")
//                }
//
//                if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
//                    flag3 = false
//                    binding.etEmail.setError("Enter valid email")
//                }
//                else{
//                    flag3 = true
//                }
////                else{
////                    val upperString: String =
////                        firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase()
////                }
//            }
//        }
//        if (flag3){
//            return flag3
//        }
//        return flag3
//    }
//
//    // validating mobile number
//    private fun setMobileNumberFocusChangeListener() : Boolean{
//
//        binding.etMobileNumber.setOnFocusChangeListener {_, focus ->
//
//            if (!focus){
//
//                val mobileNumber = binding.etMobileNumber.text.toString().trim()
//
//                if(mobileNumber.length < 10){
//                    flag4 = false
//                    binding.etMobileNumber.setError("Enter Valid Number")
//                }
//                else{
//                    flag4 = true
//                }
//            }
//        }
//        if (flag4){
//            return flag4
//        }
//        return flag4
//    }
//
//
////    // validating address
////    private fun setAddressFocusChangeListener() : Boolean{
////
////        var flag = false
////        binding.etAddress.setOnFocusChangeListener {_, focus ->
////
////            if (!focus){
////
////                val address = binding.etAddress.text.toString().trim()
////
////                if(address.isEmpty()){
////                    binding.etAddress.setError("This field is required")
////                }
////                else{
////                    flag = true
////                }
////            }
////        }
////        if (flag){
////            return true
////        }
////        return false
////    }


}