import com.kmmania.AthleteImpl
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AthleteImplTest {

    @Test
    fun `mySpeciality() method should return correct speciality`() {
        // Given
        val speciality = "Running"
        val athlete = AthleteImpl(speciality)

        // Then
        val result = athlete.mySpeciality()

        // When
        assertThat(result).isEqualTo("My speciality is Running.")
    }
}