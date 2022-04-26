import org.junit.Test

import org.junit.Assert.*

class AutotestsKtTest {

    @Test
    fun calculatePrice_default() {
        //1. Arrange — подготовка данных (задание переменных).
        val itemCount = 1

        //2.Act — выполнение целевого действия (вызов функции).
        var result = calculatePrice(itemCount)
        //3.Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(100, result)
    }

    @Test
    fun calculatePrice_basicDiscount() {
        //1. Arrange — подготовка данных (задание переменных).
        val itemCount = 1
        val itemPrice = 100
        val discount = 100
        val discountStart = 1_000
        val userLevel = "gold"
        //2.Act — выполнение целевого действия (вызов функции).
        var result = calculatePrice(
            itemCount,
            itemPrice,
            discount,
            discountStart,
            userLevel
        )
        //3.Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(90, result)
    }

    @Test
    fun calculatePrice_extraDiscount() {
        //1. Arrange — подготовка данных (задание переменных).
        val itemCount = 100
        val itemPrice = 100
        val discount = 100
        val discountStart = 1_000
        val userLevel = "gold"
        //2.Act — выполнение целевого действия (вызов функции).
        var result = calculatePrice(
            itemCount,
            itemPrice,
            discount,
            discountStart,
            userLevel
        )
        //3.Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(8910, result)
    }

    @Test
    fun userLevelToDiscount_default() {
        //1. Arrange — подготовка данных (задание переменных).
        //ничего не задаем

        //2.Act — выполнение целевого действия (вызов функции).
        var result = userLevelToDiscount()
        //3.Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(0.0, result, 0.000001)
    }

    @Test
    fun userLevelToDiscount_levelSetting() {
        //1. Arrange — подготовка данных (задание переменных).
        val level = "silver"
        //2.Act — выполнение целевого действия (вызов функции).
        var result = userLevelToDiscount(level)
        //3.Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(0.05, result, 0.000001)
    }

}