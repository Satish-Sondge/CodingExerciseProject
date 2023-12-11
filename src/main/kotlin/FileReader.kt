import java.io.File
import java.io.InputStream

class FileReader () {

    fun readFile(fileName: String): String {
            val inputStream: InputStream = File(fileName).inputStream()
            return inputStream.reader().use { it.readText() }
    }
}
