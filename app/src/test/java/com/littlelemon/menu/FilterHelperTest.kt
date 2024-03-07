package com.littlelemon.menu

import org.junit.Assert.*
import org.junit.Test

class FilterHelperTest {

    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        val sampleProductsList = mutableListOf(
            ProductItem(title = "Black tea", price = 3.00, category = "Drinks", R.drawable.black_tea),
            ProductItem(title = "Croissant", price = 7.00, category = "Dessert", R.drawable.croissant),
            ProductItem(title = "Bouillabaisse", price = 20.00, category = "Food", R.drawable.bouillabaisse)
        )
        val results: List<ProductItem> =
            FilterHelper().filterProducts(FilterType.Dessert, sampleProductsList)

        assertResults(results)
    }

    private fun assertResults(results: List<ProductItem>) {
        assertEquals(EXPECTED_COUNT, results.size)
        assertEquals(EXPECT_CROISSANT_TITLE, results[0].title)
        assertEquals(EXPECTED_CROISSANT_CATEGORY, results[0].category)
        assertEquals(EXPECTED__CROISSANT_IMAGE, results[0].image)
        assertEquals(EXPECTED_CROISSANT_PRICE, results[0].price, 0.00)
    }


    companion object {
        const val EXPECTED_COUNT: Int  = 1
        const val EXPECTED_CROISSANT_CATEGORY: String = "Dessert"
        const val EXPECT_CROISSANT_TITLE: String = "Croissant"
        const val EXPECTED__CROISSANT_IMAGE: Int = R.drawable.croissant
        const val EXPECTED_CROISSANT_PRICE: Double = 7.00
    }
}