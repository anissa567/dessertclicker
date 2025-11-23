package pnm.tigade.dessert.data

import androidx.annotation.DrawableRes
import pnm.tigade.dessert.R

data class DessertUiState(
    val revenue: Int = 0,
    val dessertsSold: Int = 0,
    @DrawableRes val currentDessertImageId: Int = R.drawable.cupcake,
    val currentDessertPrice: Int = 5
)