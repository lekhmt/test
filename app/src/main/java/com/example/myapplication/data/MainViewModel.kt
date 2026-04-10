package com.example.myapplication.data

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel(
    private val api: SearchApi = SimpleSearchApi(),
) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")

    val searchResults: StateFlow<List<String>>
        get() = TODO()

    fun onQueryChange(q: String) {
        _searchQuery.value = q
    }

}