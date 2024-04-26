import com.kmmania.AthleteInterface
import com.kmmania.DistanceRunner
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class DistanceRunnerTest {

    @Test
    fun `display() method should display correct information`() {
        // Given
        val firstName = "Eliud"
        val lastName = "Kipchoge"
        val speciality = "marathon"
        val athleteMock = mock(AthleteInterface::class.java)
        `when`(athleteMock.mySpeciality()).thenReturn("My speciality is $speciality.")
        val distanceRunner = DistanceRunner("Eliud", "Kipchoge", athleteMock)

        // When
        distanceRunner.display()

        // Then
        assertThat(distanceRunner.firstName).isEqualTo(firstName)
        assertThat(distanceRunner.lastName).isEqualTo(lastName)
        verify(athleteMock).mySpeciality()
    }

}