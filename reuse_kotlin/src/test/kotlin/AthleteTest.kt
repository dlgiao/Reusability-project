import com.kmmania.Athlete
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AthleteTest {
    @Test
    fun `mySpeciality() method should return correct speciality`() {
        // Given
        val speciality = "Running"
        val athlete = Athlete(speciality)

        // When
        val result = athlete.mySpeciality()

        // Then
        assertThat(result).isEqualTo("My speciality is $speciality.")
    }
}