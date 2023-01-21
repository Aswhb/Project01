package com.caltech.file.project;

import java.io.IOException;
import java.util.Scanner;

public class Main{
	private static final boolean True = false;
	public static void main(String[] args) throws IOException
	
	{
		try (Scanner ab = new Scanner(System.in)) {
			int select;
			boolean run=true;
			
			while(run== true)
			{
				System.out.println("LockedMe.com");
				System.out.println("Choose the option");
				System.out.println("1: Display Files in Ascenidng Order");
				System.out.println("2: Sub Menu");
			    System.out.println("3: Exit");
			    select =ab.nextInt();
			    
			    switch(select) {
			    
			    case 1:
			    	DisplayAscending.DisplayAscending();
					break;
			    case 2:
			        boolean subRun = true;
			        while (subRun)
			        {
			            System.out.println("1. Create a file");
			            System.out.println("2. Delete a file");
			            System.out.println("3. Search a file");
			            System.out.println("4. Exit submenu");
			            int subChoice =ab.nextInt();
			         
			            
			   switch(subChoice)
			     {
			     case 1:
					FileEx.FileEx();
					break;
			     case 2:
			         DeleteFile.DeleteFile();
			         break;
			     case 3:
			         SearchFile.SearchFile();
			         break;
			     case 4:
			         subRun = false;
			         break;
			 }
    }
			        break;
			    case 3:
			    	run = false;
			    	break;
}
}
		}
}
}
     					

