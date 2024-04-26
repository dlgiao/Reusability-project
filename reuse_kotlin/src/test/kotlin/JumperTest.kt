import com.kmmania.AthleteInterface
import com.kmmania.Jumper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class JumperTest {

    @Test
    fun `display() method should display correct information`() {
        // Given
        val firstName = "Marco"
        val lastName = "Tamberi"
        val speciality = "high jump"
        val athleteMock = mock(AthleteInterface::class.java)
        `when`(athleteMock.mySpeciality()).thenReturn("My speciality is $speciality.")
        val jumper = Jumper(firstName, lastName, athleteMock)

        // When
        jumper.display()

        // Then
        assertThat(jumper.firstName).isEqualTo(firstName)
        assertThat(jumper.lastName).isEqualTo(lastName)
        verify(athleteMock).mySpeciality()
    }
}