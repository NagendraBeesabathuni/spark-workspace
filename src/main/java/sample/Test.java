package sample;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparkConf sc = new SparkConf().setAppName("sample").setMaster("local");
		JavaSparkContext jsc = new JavaSparkContext(sc);
		JavaRDD<String> rdd1 = jsc.textFile("C:/Users/nagen/Downloads/spark-2.3.0-bin-without-hadoop/spark-2.3.0-bin-without-hadoop/README.md");
        System.out.println(rdd1.count());
	}

}
