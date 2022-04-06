package com.kidsgamesprojects.childduties.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kidsgamesprojects.childduties.data.Child
import com.kidsgamesprojects.childduties.ui.BaseViewModel
import com.kidsgamesprojects.childduties.ui.NavigationCommand

class HomeViewModel : BaseViewModel() {

    private val _childList = MutableLiveData<List<Child>>()
    val childList : LiveData<List<Child>> = _childList

    init {
        fetchChildList()
    }

    private fun fetchChildList() {

        var newList = listOf(
            Child(name = "Kuba", dutyPoints = 15, behaviourPoints = 4, drawableName = "@drawable/dragon"),
            Child(name = "Mateusz", dutyPoints = 14, behaviourPoints = 6, drawableName = "@drawable/frog1"),
            Child(name = "Michał", dutyPoints = 13, behaviourPoints = 3, drawableName = "@drawable/lizard"),
            Child(name = "Dawid", dutyPoints = 16, behaviourPoints = 2, drawableName = "@drawable/snake")
        )
        _childList.value = newList
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    fun navigateToAddChild() {
        navigateTo(NavigationCommand.To(HomeFragmentDirections.actionNavigationHomeToChildAddEdit()))
    }
}