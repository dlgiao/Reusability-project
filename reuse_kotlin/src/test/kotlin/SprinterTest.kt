import com.kmmania.Sprinter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class SprinterTest {
    @Test
    fun `display() method should display correct information`() {
        // Given
        val firstName = "Usain"
        val lastName = "Bolt"
        val speciality = "sprinting"
        val sprinter = Sprinter(firstName, lastName, speciality)

        // Stub the mySpeciality method directly on the sprinter object
        val spySprinter = spy(sprinter)
        doReturn("My speciality is sprinting.").`when`(spySprinter).mySpeciality()

        // When
        spySprinter.display()

        // Then
        assertThat(spySprinter.firstName).isEqualTo(firstName)
        assertThat(spySprinter.lastName).isEqualTo(lastName)
        verify(spySprinter).mySpeciality()
    }
}