//initilizing
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
//val conf = new SparkConf().setMaster("local").setAppName("My App")
//val sc = new SparkContext("local", "My App")


    object HelloWorld {
      def main(args: Array[String]): Unit = {
val conf = new SparkConf().setAppName("wordCount")
val sc = new SparkContext(conf)
// Load our input data.
val input = sc.textFile("Rea")
// Split it up into words.
val words = input.flatMap(line => line.split(" "))
// Transform into word and count.
val counts = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}
// Save the word count back out to a text file, causing evaluation.
counts.saveAsTextFile("outputFile")
}
}
