package com.example.complyanyproject.MenuFragments

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.*
import com.example.complyanyproject.fragment.UserFragment
import com.example.complyanyproject.fragment.sharedPreferences


class MenuFragment : Fragment() {

    var flag1 = false
    var flag2 = false
    var flag3 = false
    var flag4 = false
    var flag5 = false
    var flag6 = false



    // Linear Layout
    lateinit var companyManagement : LinearLayout
    lateinit var departmentManagement : LinearLayout
    lateinit var lawOrHeadManagement : LinearLayout
    lateinit var userManagement : LinearLayout
    lateinit var clientGroupManagement : LinearLayout
    lateinit var complianceManagement : LinearLayout
    lateinit var clientManagement : LinearLayout
    lateinit var helpAndSupport : LinearLayout

    // TextView
    lateinit var clientGroupId : TextView
    lateinit var clientSubGroupId : TextView
    lateinit var userId : TextView
    lateinit var changeUserId : TextView
    lateinit var proxyUserId : TextView
    lateinit var txtStandardComplience : TextView
    lateinit var txtSettings : TextView
    lateinit var txtCalenderManagement : TextView
    lateinit var txtDepartment : TextView
    lateinit var txtSubDepartment : TextView
    lateinit var txtUpdateComplaince : TextView
    lateinit var txtLogOut : TextView
    lateinit var txtNewCompliance : TextView

    // Both Arrow Relative Layout
    lateinit var companyArrowLayout : RelativeLayout
    lateinit var departmentArrowLayout : RelativeLayout
    lateinit var lawOrheadArrowLayout : RelativeLayout
    lateinit var userManagementArrowLayout : RelativeLayout
    lateinit var clientGroupManagementArrowLayout : RelativeLayout
    lateinit var complianceManagementArrowLayout : RelativeLayout

    // Right Arrow ImageView
    lateinit var companyArrowRight : ImageView
    lateinit var departmentArrowRight : ImageView
    lateinit var lawOrheadArrowRight : ImageView
    lateinit var userManagementArrowRight : ImageView
    lateinit var clientGroupManagementArrowRight : ImageView
    lateinit var complianceManagementArrowRight : ImageView

    // Down Arrow ImageView
    lateinit var companyArrowDown : ImageView
    lateinit var departmentArrowDown : ImageView
    lateinit var lawOrheadArrowDown : ImageView
    lateinit var userManagementArrowDown : ImageView
    lateinit var clientGroupManagementArrowDown : ImageView
    lateinit var complianceManagementArrowDown : ImageView

    // All menu submenus id
    lateinit var companyManagementMenu : LinearLayout
    lateinit var departmentManagementMenu : LinearLayout
    lateinit var lawOrHeadManagementMenu : LinearLayout
    lateinit var userManagementMenu : LinearLayout
    lateinit var clientGroupManagementMenu : LinearLayout
    lateinit var complianceManagementMenu : LinearLayout

    // sub menu items onclick id (Company Management)
    lateinit var globalCompany: LinearLayout
    lateinit var regionalCompany: LinearLayout
    lateinit var subRegionalCompany: LinearLayout
    lateinit var countryCompany: LinearLayout
    lateinit var countryRegionCompany: LinearLayout
    lateinit var entity: LinearLayout

    // back buttons id (Company Management)
    lateinit var backGlobalCompany: TextView
    lateinit var backRegionalCompany: TextView
    lateinit var backSubRegionalCompany: TextView
    lateinit var backCountryCompany: TextView
    lateinit var backCountryRegionCompany: TextView
    lateinit var backEntity: TextView

    // sub menu items onclick id (Law or Head Management)
    lateinit var law: LinearLayout
    lateinit var subLawOrsubHead: LinearLayout

    // back buttons id (Law or Head Management)
    lateinit var backLawOrHead: TextView
    lateinit var backSubLawOrSubHead: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        // Linear Layout
        companyManagement = view.findViewById(R.id.companyManagement)
        departmentManagement = view.findViewById(R.id.departmentManagement)
        lawOrHeadManagement = view.findViewById(R.id.lawOrHeadManagement)
        userManagement = view.findViewById(R.id.userManagement)
        clientGroupManagement = view.findViewById(R.id.clientGroupManagement)
        complianceManagement = view.findViewById(R.id.complianceManagement)
        clientManagement = view.findViewById(R.id.ClientManagement)
        helpAndSupport = view.findViewById(R.id.helpAndSupport)

        // TextView
        clientGroupId = view.findViewById(R.id.clientGroupId)
        clientSubGroupId = view.findViewById(R.id.clientSubGroupId)
        userId = view.findViewById(R.id.userId)
        changeUserId = view.findViewById(R.id.changeUserId)
        proxyUserId = view.findViewById(R.id.proxyUserId)
        txtStandardComplience = view.findViewById(R.id.txtStandardComplience)
        txtSettings = view.findViewById(R.id.txtSettings)
        txtCalenderManagement = view.findViewById(R.id.txtCalenderManagement)
        txtDepartment = view.findViewById(R.id.txtDepartment)
        txtSubDepartment = view.findViewById(R.id.txtSubDepartment)
        txtUpdateComplaince = view.findViewById(R.id.txtUpdateComplaince)
        txtLogOut = view.findViewById(R.id.txtLogOut)
        txtNewCompliance = view.findViewById(R.id.txtNewCompliance)


        // Both Arrow Relative Layout
        companyArrowLayout  = view.findViewById(R.id.companyArrowLayout)
        departmentArrowLayout = view.findViewById(R.id.departmentArrowLayout)
        lawOrheadArrowLayout = view.findViewById(R.id.lawOrheadArrowLayout)
        userManagementArrowLayout = view.findViewById(R.id.userManagementArrowLayout)
        clientGroupManagementArrowLayout = view.findViewById(R.id.clientGroupManagementArrowLayout)
        complianceManagementArrowLayout = view.findViewById(R.id.complianceManagementArrowLayout)

        // Right Arrow ImageView
        companyArrowRight = view.findViewById(R.id.companyArrowRight)
        departmentArrowRight = view.findViewById(R.id.departmentArrowRight)
        lawOrheadArrowRight = view.findViewById(R.id.lawOrheadArrowRight)
        userManagementArrowRight = view.findViewById(R.id.userManagementArrowRight)
        clientGroupManagementArrowRight = view.findViewById(R.id.clientGroupManagementArrowRight)
        complianceManagementArrowRight = view.findViewById(R.id.complianceManagementArrowRight)

        // Down Arrow ImageView
        companyArrowDown = view.findViewById(R.id.companyArrowDown)
        departmentArrowDown = view.findViewById(R.id.departmentArrowDown)
        lawOrheadArrowDown = view.findViewById(R.id.lawOrheadArrowDown)
        userManagementArrowDown = view.findViewById(R.id.userManagementArrowDown)
        clientGroupManagementArrowDown = view.findViewById(R.id.clientGroupManagementArrowDown)
        complianceManagementArrowDown = view.findViewById(R.id.complianceManagementArrowDown)

        // All menu submenus id
        companyManagementMenu = view.findViewById(R.id.companyManagementMenu)
        departmentManagementMenu = view.findViewById(R.id.departmentManagementMenu)
        lawOrHeadManagementMenu = view.findViewById(R.id.lawOrHeadManagementMenu)
        userManagementMenu = view.findViewById(R.id.userManagementMenu)
        clientGroupManagementMenu = view.findViewById(R.id.clientGroupManagementMenu)
        complianceManagementMenu = view.findViewById(R.id.complianceManagementMenu)

        // sub menu items onclick id (Company Management)
        globalCompany = view.findViewById(R.id.globalcompany)
        regionalCompany = view.findViewById(R.id.regionalCompany)
        subRegionalCompany = view.findViewById(R.id.subRegionalcompany)
        countryCompany = view.findViewById(R.id.countryCompany)
        countryRegionCompany = view.findViewById(R.id.CountryRegionCompany)
        entity = view.findViewById(R.id.entity)

//        // back buttons id (Company Management)
//        backGlobalCompany = view.findViewById(R.id.backGlobalCompany)
//        backRegionalCompany = view.findViewById(R.id.backRegionalCompany)
//        backSubRegionalCompany = view.findViewById(R.id.backSubRegionalCompany)
//        backCountryCompany = view.findViewById(R.id.backCountryCompany)
//        backCountryRegionCompany = view.findViewById(R.id.backCountryRegionCompany)
//        backEntity = view.findViewById(R.id.backEntity)

        // sub menu items onclick id (Law or Head Management)
        law = view.findViewById(R.id.law)
        subLawOrsubHead = view.findViewById(R.id.subLawOrsubHead)

//        // back buttons id (Law or Head Management)
//        backLawOrHead = view.findViewById(R.id.backLawOrHead)
//        backSubLawOrSubHead = view.findViewById(R.id.backSubLawOrSubHead)

        companyManagement.setOnClickListener {

            if (flag1 == true) {
                companyArrowDown.visibility = View.GONE
                companyArrowRight.visibility = View.VISIBLE
                companyManagementMenu.visibility = View.GONE
                flag1 = false
            } else {
                companyArrowDown.visibility = View.VISIBLE
                companyArrowRight.visibility = View.GONE
                companyManagementMenu.visibility = View.VISIBLE
                departmentManagementMenu.visibility = View.GONE
                lawOrHeadManagementMenu.visibility = View.GONE
                userManagementMenu.visibility = View.GONE
                clientGroupManagementMenu.visibility = View.GONE
                complianceManagementMenu.visibility = View.GONE
                flag1 = true
            }

        }

        departmentManagement.setOnClickListener {

            if (flag2 == true) {
                departmentArrowDown.visibility = View.GONE
                departmentArrowRight.visibility = View.VISIBLE
                departmentManagementMenu.visibility = View.GONE
                flag2 = false
            }
            else {
                departmentArrowDown.visibility = View.VISIBLE
                departmentArrowRight.visibility = View.GONE
                departmentManagementMenu.visibility = View.VISIBLE
                companyManagementMenu.visibility = View.GONE
                lawOrHeadManagementMenu.visibility = View.GONE
                userManagementMenu.visibility = View.GONE
                clientGroupManagementMenu.visibility = View.GONE
                complianceManagementMenu.visibility = View.GONE
                flag2 = true
            }

        }

        lawOrHeadManagement.setOnClickListener {

            if (flag3 == true) {
                lawOrheadArrowDown.visibility = View.GONE
                lawOrheadArrowRight.visibility = View.VISIBLE
                lawOrHeadManagementMenu.visibility = View.GONE
                flag3 = false
            }
            else {
                lawOrheadArrowDown.visibility = View.VISIBLE
                lawOrheadArrowRight.visibility = View.GONE
                lawOrHeadManagementMenu.visibility = View.VISIBLE
                departmentManagementMenu.visibility = View.GONE
                companyManagementMenu.visibility = View.GONE
                userManagementMenu.visibility = View.GONE
                clientGroupManagementMenu.visibility = View.GONE
                complianceManagementMenu.visibility = View.GONE

                flag3 = true
            }

        }

        userManagement.setOnClickListener {

            if (flag4 == true) {
                userManagementArrowDown.visibility = View.GONE
                userManagementArrowRight.visibility = View.VISIBLE
                userManagementMenu.visibility = View.GONE
                flag4 = false
            }
            else {
                userManagementArrowDown.visibility = View.VISIBLE
                userManagementArrowRight.visibility = View.GONE
                userManagementMenu.visibility = View.VISIBLE
                departmentManagementMenu.visibility = View.GONE
                companyManagementMenu.visibility = View.GONE
                lawOrHeadManagementMenu.visibility = View.GONE
                clientGroupManagementMenu.visibility = View.GONE
                complianceManagementMenu.visibility = View.GONE
                flag4 = true
            }

        }

        clientGroupManagement.setOnClickListener {

            if (flag5 == true) {
                clientGroupManagementArrowDown.visibility = View.GONE
                clientGroupManagementArrowRight.visibility = View.VISIBLE
                clientGroupManagementMenu.visibility = View.GONE
                flag5 = false
            }
            else {
                clientGroupManagementArrowDown.visibility = View.VISIBLE
                clientGroupManagementArrowRight.visibility = View.GONE
                clientGroupManagementMenu.visibility = View.VISIBLE
                departmentManagementMenu.visibility = View.GONE
                companyManagementMenu.visibility = View.GONE
                lawOrHeadManagementMenu.visibility = View.GONE
                userManagementMenu.visibility = View.GONE
                complianceManagementMenu.visibility = View.GONE
                flag5 = true
            }

        }

        complianceManagement.setOnClickListener {

            if (flag6 == true) {
                complianceManagementArrowDown.visibility = View.GONE
                complianceManagementArrowRight.visibility = View.VISIBLE
                complianceManagementMenu.visibility = View.GONE
                flag6 = false
            }
            else {
                complianceManagementArrowDown.visibility = View.VISIBLE
                complianceManagementArrowRight.visibility = View.GONE
                complianceManagementMenu.visibility = View.VISIBLE
                departmentManagementMenu.visibility = View.GONE
                companyManagementMenu.visibility = View.GONE
                lawOrHeadManagementMenu.visibility = View.GONE
                userManagementMenu.visibility = View.GONE
                clientGroupManagementMenu.visibility = View.GONE
                flag6 = true
            }

        }

        // added click listeners on sub menu items (Company Management)
        globalCompany.setOnClickListener{
            Intent(activity as Context, GlobalCompanyActivity::class.java).also{
                startActivity(it)
            }
        }

        regionalCompany.setOnClickListener{
            Intent(activity as Context, RegionalCompanyActivity::class.java).also{
                startActivity(it)
            }
        }

        subRegionalCompany.setOnClickListener{
            Intent(activity as Context, SubRegionalCompanyActivity::class.java).also{
                startActivity(it)
            }
        }

        countryCompany.setOnClickListener{
            Intent(activity as Context, CountryCompanyActivity::class.java).also{
                startActivity(it)
            }
        }

        countryRegionCompany.setOnClickListener{
            Intent(activity as Context, CountryRegionCompanyActivity::class.java).also{
                startActivity(it)
            }
        }

        entity.setOnClickListener{
            Intent(activity as Context, EntityActivity::class.java).also{
                startActivity(it)
            }
        }

        // added click listeners on sub menu items (Law or Head Management)
        law.setOnClickListener{
            Intent(activity as Context, LawOrHeadActivity::class.java).also{
                startActivity(it)
            }
        }

        subLawOrsubHead.setOnClickListener{
            Intent(activity as Context, SubLawOrSubHeadActivity::class.java).also{
                startActivity(it)
            }
        }

        // added click on clientGroupManagement
        clientGroupId.setOnClickListener {
            Intent(activity as Context, ClientGroupActivity::class.java).also{
                startActivity(it)
            }
        }
        clientSubGroupId.setOnClickListener {
            Intent(activity as Context, ClientSubGroupActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clickListener on clientManagement
        clientManagement.setOnClickListener {
            Intent(activity as Context, ClientManagement::class.java).also{
                startActivity(it)
            }
        }

        // added clickListener on userManagement
        userId.setOnClickListener {
            Intent(activity as Context, UserActivity::class.java).also{
                startActivity(it)
            }
        }

        changeUserId.setOnClickListener {
            Intent(activity as Context, ChangeUserActivity::class.java).also{
                startActivity(it)
            }
        }

        proxyUserId.setOnClickListener {
            Intent(activity as Context, ProxyUserActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on help&Support
        helpAndSupport.setOnClickListener {
            Intent(activity as Context, HelpAndSupportActivity::class.java).also{
                startActivity(it)
            }
        }


        // standard configure option
        txtStandardComplience.setOnClickListener {
            Intent(activity as Context, ConfigureStandardActivity::class.java).also{
                startActivity(it)
            }
        }

        txtUpdateComplaince.setOnClickListener {
            Intent(activity as Context, UpdateComplainceActivity::class.java).also{
                startActivity(it)
            }
        }

        txtNewCompliance.setOnClickListener {
            Intent(activity as Context, NewComplianceActivity::class.java).also{
                startActivity(it)
            }
        }


        // added clicks on Settings option
        txtSettings.setOnClickListener {
            Intent(activity as Context, SettingsActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on calender management
        txtCalenderManagement.setOnClickListener {
            Intent(activity as Context, CalenderManagementActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on department management
        txtDepartment.setOnClickListener {
            Intent(activity as Context, DepartmentActivity::class.java).also{
                startActivity(it)
            }
        }

        txtSubDepartment.setOnClickListener {
            Intent(activity as Context, SubDepartmentActivity::class.java).also{
                startActivity(it)
            }
        }


        // added log out method
        txtLogOut.setOnClickListener {

            val dialog = AlertDialog.Builder(activity as Context)
            dialog.setTitle("Log Out")
            dialog.setMessage("Are you sure you want to logout?")
            dialog.setIcon(R.drawable.splash_screen)
            dialog.setPositiveButton("Yes"){text , listener ->
                sharedPreferences.edit().putBoolean("isLoggedIn", false).apply()
                Intent(activity as Context, LoginActivity::class.java).also{
                    startActivity(it)
                    this.activity?.finish()
                }
            }
            dialog.setNegativeButton("No"){text , listener ->

            }
            dialog.create()
            dialog.show()


        }

        return view
    }


    }

