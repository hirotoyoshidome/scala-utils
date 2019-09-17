import java.nio.file.{Paths, Files}
import scala.io.Source
import java.io.PrintWriter

/**
 *
 * file handling sample
 **/
object MyFileHandling{
    def main(args: Array[String]): Unit = {
        val fileName: String = "sample.txt"
        val filePath = Paths.get(fileName)
        println(filePath)
        // file size
        println(Files.size(filePath))

        //write file
        val pw = new PrintWriter(fileName)
        pw.write("add test")
        pw.close()

        // read file
        val source = Source.fromFile(fileName, "UTF-8")
        source.getLines.foreach{ line => 
          println(line)
        }
        source.close()
    }
}