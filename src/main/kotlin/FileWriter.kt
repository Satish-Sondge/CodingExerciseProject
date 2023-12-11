import java.io.File
import java.io.InputStream

class FileWriter {

    fun writeFile(fileName : String, contentString : String) : String {
        val outputFile = File(fileName)
        outputFile.writeText(contentString)

        val inputStream: InputStream = outputFile.inputStream()
        return inputStream.reader().use { it.readText() }
    }
}