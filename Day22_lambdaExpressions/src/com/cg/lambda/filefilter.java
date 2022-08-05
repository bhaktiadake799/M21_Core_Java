package com.cg.lambda;
import java.io.File;
import java.io.FileFilter;
public class filefilter {

	public static void main(String[] args) {
//		lambda expression
		FileFilter obj=(File pathname)->pathname.getName().endsWith(".txt");
		File dir = new File("C:\\Users\\Bhakti Adake\\Desktop\\J.D.ele");
		File[]contents = dir.listFiles(obj);
		for (File i : contents)
		{
			System.out.println(i);
		}
		

	}

}
