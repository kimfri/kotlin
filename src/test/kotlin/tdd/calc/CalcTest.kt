package tdd.calc

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class CalcTest {

    private val calc = Calc()
    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Nested
    inner class Add {
        @Test
        fun givenPositiveTerms_whenAdding_thenReturnPositiveAnswer() {
            //act
            val expected = 9
            val actual = calc.add(6, 3)
            //assert
            assertEquals(expected, actual)
        }

        @Test
        fun givenOnePositiveAndOneBiggerNegative_whenAdding_thenReturnNegativeAnswer() {
            //act
            val expected = -9
            val actual = calc.add(9, -18)
            //assert
            assertTrue(actual < 0)
            assertEquals(expected, actual)
        }
    }

    @Nested
    inner class Sub {
        @Test
        fun givenTermXLessThanTermY_whenSubtracting_thenReturnNegativeValue() {
            //act
            val expected = -9
            val actual = calc.sub(9, 18)
            //assert
            assertTrue(actual < 0)
            assertEquals(expected, actual)
        }
    }

    @Nested
    inner class Div {
        @Test
        fun givenZeroAsDivider_whenDividing_thenThrowException() {
            //assert
            assertThrows<ArithmeticException> {calc.div(10, 0)}
        }
    }
}
