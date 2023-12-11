
fun main(args: Array<String>) {

    val inputFileContent = FileReader().readFile(fileName = "Input.txt")

    val reversedFileContent = inputFileContent.reader().use {it.readText().reversed()}

    FileWriter().writeFile(fileName = "Output.txt",reversedFileContent)
}
