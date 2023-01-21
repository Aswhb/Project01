package com.caltech.file.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//create a file in a directory
public class FileEx {
	public static void FileEx() throws IOException {
		String path="/Users/asw/Caltech/";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String filename=sc.next();
		String finalpath=path+filename;
		System.out.println(finalpath);
		//create a file
		File file=new File(finalpath);
		boolean res=file.createNewFile();
		if(res!=true) {
			System.out.println("file is not created");
		}
		else {
			System.out.println("file is created ");
		}
		
	}

	
		
		
	}


