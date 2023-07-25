package edu.msudenver.cs3013.lab04

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    // LiveData for saved parking location.
    val savedParkingLocation: MutableLiveData<String> = MutableLiveData<String>()

    // Function to update the saved parking location.
    fun updateParkingLocation(location: String) {
        savedParkingLocation.value = location
    }
}
