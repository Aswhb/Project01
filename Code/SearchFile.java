package com.caltech.file.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//search the files 
public class SearchFile {
	public static void SearchFile() {
		String path="/Users/asw/Caltech/";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file to search");
		String filenamesearch=sc.next();
		File file=new File(path);
		//display operation
		File filename[]=file.listFiles();
		//for-each
		int flag=0;
		for(File ff:filename) {
			if(ff.getName().equals(filenamesearch)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		
		if(flag==1) {
			System.out.println("file is found");
		}
		else {
			System.out.println("file is not found");
		}
		
		
	}

	
		// TODO Auto-generated method stub
		
	}
