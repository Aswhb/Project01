//display the files in an ascending order
package com.caltech.file.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//display the files in an ascending order
public class DisplayAscending {
	public static void DisplayAscending() throws IOException {
		String path="/Users/asw/Caltech/";
		File file=new File(path);
		//display operation
		File filename[]=file.listFiles();
		//for-each
		System.out.println("the list of files in asscending order in the "+ path +"is");
		for(File ff:filename) {
			System.out.println(ff.getName());
		}
		
		
	}

	
		// TODO Auto-generated method stub
		
	}

