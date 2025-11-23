package pnm.tigade.dessert.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import pnm.tigade.dessert.data.DessertUiState
import pnm.tigade.dessert.data.Datasource
import pnm.tigade.dessert.R

class DessertViewModel : ViewModel() {

    private val _dessertUiState = MutableStateFlow(DessertUiState())
    val dessertUiState: StateFlow<DessertUiState> = _dessertUiState.asStateFlow()

    private val desserts = Datasource.dessertList

    fun onDessertClicked() {
        _dessertUiState.update { currentState ->
            val dessertsSold = currentState.dessertsSold + 1
            val nextDessertIndex = determineDessertIndex(dessertsSold)
            currentState.copy(
                revenue = currentState.revenue + currentState.currentDessertPrice,
                dessertsSold = dessertsSold,
                currentDessertImageId = desserts[nextDessertIndex].imageId,
                currentDessertPrice = desserts[nextDessertIndex].price
            )
        }
    }

    private fun determineDessertIndex(dessertsSold: Int): Int {
        var dessertIndex = 0
        for (index in desserts.indices) {
            if (dessertsSold >= desserts[index].startProductionAmount) {
                dessertIndex = index
            } else {
                break
            }
        }
        return dessertIndex
    }
}