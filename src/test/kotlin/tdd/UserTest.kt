package tdd

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import io.mockk.unmockkAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class UserTest {

    @MockK
//    private val mockedUserFactory = mockk<UserFactory>()
    private lateinit var mockedUserFactory: UserFactory

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)
//        every { mockedUserFactory.createUser(any<String>(), any<String>()) } returns User("Kim", "Ölander")
    }

    @AfterEach
    fun tearDown() {
        unmockkAll()
    }

    @Test
    fun givenLastName_whenUseUserFactory_thenDontReturnDefaultName() {
        //arrange
        every { mockedUserFactory.createUser(any(), any()) } returns User("Kim", "Ölander")
        val expectedUser = User("Kim", "Ölander")

        //act
        val actualUser = mockedUserFactory.createUser("", "")
        println("actual: $actualUser")

        //assert
        assertEquals(expectedUser, actualUser)
    }

    @Test
    fun givenNames_whenCreatingUser_thenNamesAreStored() {
        //arrange
        val expectedUser = User("Kim", "Fritzon")

        //act
        val actualUser = User("Kim", "Fritzon")

        //assert
        assertEquals(expectedUser, actualUser)
    }

    @Test
    fun givenFirstName_whenCreateingUser_thenLastNameIsDefault() {
        //arrange
        val expectedUser = User("Kim", "Fritzon")

        //act
        val actualUser = UserFactory().createUser("Kim")

        //assert
        assertEquals(expectedUser, actualUser)
    }
}