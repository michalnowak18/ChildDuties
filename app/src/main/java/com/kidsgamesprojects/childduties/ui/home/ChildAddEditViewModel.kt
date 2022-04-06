package com.kidsgamesprojects.childduties.ui.home

import androidx.lifecycle.MutableLiveData
import com.kidsgamesprojects.childduties.ui.BaseViewModel
import java.util.*

class ChildAddEditViewModel : BaseViewModel() {
    private val _childName = MutableLiveData<String>().apply {
        value = ""
    }
    val childName: MutableLiveData<String> = _childName

    private val _birthdayDate = MutableLiveData<Date>().apply {
        value = Calendar.getInstance().time
    }
    val birthdayDate: MutableLiveData<Date> = _birthdayDate
}