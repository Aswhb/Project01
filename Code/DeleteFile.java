//delete a file
package com.caltech.file.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//delete a file in a directory
public class DeleteFile {
	public static void DeleteFile() {
		String path="/Users/asw/Caltech/";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String filename=sc.next();
		String finalpath=path+filename;
		System.out.println(finalpath);
		
		File file=new File(finalpath);
		//delete operation
		file.delete();
		System.out.println("file gets deleted");
		
	}
		
}

