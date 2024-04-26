import com.kmmania.Athlete
import com.kmmania.Thrower
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class ThrowerTest {
    @Test
    fun `display() method should display correct information`() {
        // Given
        val firstName = "Ryan"
        val lastName = "Crouser"
        val speciality = "shot put"
        val athleteMock = mock(Athlete::class.java)
        `when`(athleteMock.mySpeciality()).thenReturn("My speciality is $speciality.")
        val thrower = Thrower(firstName, lastName, athleteMock)

        // When
        thrower.display()

        // Then
        assertThat(thrower.firstName).isEqualTo(firstName)
        assertThat(thrower.lastName).isEqualTo(lastName)
        verify(athleteMock).mySpeciality()
    }
}