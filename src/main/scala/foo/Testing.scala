package foo

object Testing {
  def main(args: Array[String]): Unit = {
    val path = args(0)
    val files = new java.io.File(getClass.getResource(path).getPath).listFiles.toList
    println(files)
  }
}
