import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Tag
import kotlin.math.PI

class MainKtTest {
    val EPS = 0.000001

    @Disabled
    @Test
    @Tag("var2")
    fun testVar2calcF() {
        assertEquals(1.824795, var2calcF(2, -1, 1.2), EPS)
        assertEquals(1.284295, var2calcF(3, 1, 0.5), EPS)
        assertEquals(0.0, var2calcF(0, 0, 1.0), EPS)
        assertEquals(1.9399, var2calcF(5, -3, 0.8), EPS)
        assertEquals(1.553226, var2calcF(1, 2, 1.1), EPS)
    }

    @Disabled
    @Test
    @Tag("var2")
    fun testVar2calcZ() {
        assertEquals(0.417724, var2calcZ(2, -1, 1.2, 0.7), EPS)
        assertEquals(-0.333633, var2calcZ(1, -1, 1.0, 1.0), EPS)
        assertEquals(3.651155, var2calcZ(4, 0, 1.0, 0.5), EPS)
        assertEquals(6.753470, var2calcZ(6, 1, 0.5, 1.2), EPS)
        assertEquals(1.0, var2calcZ(0, 1, 2.0, 0.3), EPS)
    }
}