package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.complyanyproject.databinding.ActivityProfileBinding
import java.io.IOException

class ProfileActivity : AppCompatActivity() {


    private lateinit var binding: ActivityProfileBinding
    val SELECT_REQUEST_CODE = 1
//    var flag1 = false
//    var flag2 = false
//    var flag3 = false
//    var flag4 = false
//    var validateVariable = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


//        setFirstNameFocusChangeListener()
//        setLastNameFocusChangeListener()
//        setEmailFocusChangeListener()
//        setMobileNumberFocusChangeListener()

        binding.btnUpate.setOnClickListener {

                val firstName = binding.etFirstName.text.toString().trim()
                val lastName = binding.etLastName.text.toString().trim()
                val email = binding.etEmail.text.toString().trim()
                val mobileNumber = binding.etMobileNumber.text.toString()

                if (firstName.isEmpty()){
                    binding.etFirstName.setError("This field is required")
                }
                else if(firstName.length < 2){
                    binding.etFirstName.setError("First name contains atleast 2 characters")
                }
                else if (lastName.isEmpty()){
                    binding.etLastName.setError("This field is required")
                }
                else if (lastName.length < 2){
                    binding.etLastName.setError("Last name contains atleast 2 characters")
                }
                else if (lastName == firstName){
                    binding.etLastName.setError("Last name must be diffrerent")
                }
                else if (email.isEmpty()){
                    binding.etEmail.setError("This field is required")
                }
                else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    binding.etEmail.setError("Please enter valid email")
                }
                else if(mobileNumber.length < 10){
                    binding.etMobileNumber.setError("Please enter valid number")
                }
                else{
                    binding.etFirstName.text.clear()
                    binding.etLastName.text.clear()
                    binding.etEmail.text.clear()
                    binding.etMobileNumber.text.clear()
                    binding.etAddress.text.clear()

                    Toast.makeText(this, "Profile Updated...",Toast.LENGTH_SHORT).show()
                }
        }


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