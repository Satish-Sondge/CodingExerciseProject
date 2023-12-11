import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class FileWriterTest {

    @MockK
    private lateinit var fileWriter : FileWriter

    @BeforeTest
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)
        fileWriter = mockk<FileWriter>()
        every { fileWriter.writeFile(any(),any()) } returns ExpectedValue
    }

    @Test
    fun `test input reader`() {
        val contentString =  fileWriter.writeFile(Filename, ContentString)
        assertEquals(contentString, ExpectedValue)
    }

    private companion object {
        val ExpectedValue = "CBA"
        val Filename = ""
        val ContentString = ""
    }
}
