import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class FileReaderTest {

    @MockK
    private lateinit var fileReader : FileReader

    @BeforeTest
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)
        fileReader = mockk<FileReader>()
        every { fileReader.readFile(any()) } returns ExpectedValue
    }

    @Test
    fun `test input reader`() {
       val contentString =  fileReader.readFile(Filename)
        assertEquals(contentString, ExpectedValue)
    }

    private companion object {
        val ExpectedValue = "ABC"
        val Filename = ""
    }
}
