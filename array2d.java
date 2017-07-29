//Travonna Wilson 
//this is my own work
//7/28/17
//CST-105

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class array2d { 

	public static void main (String[] args)  {
		
		Scanner reader = null;
	
		try {
			reader = new Scanner(new File("C:/Users/Derrick/Desktop/hi.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		String str = reader.nextLine();
		 
		 
		while (reader.hasNext()){
			str = reader.nextLine();
			
		}
		
		
		char[][] getarray = new char[20][45];
		
		int charCount = 0;
		for (int row = 0; row < getarray.length; row++) {
			for (int column = 0; column < getarray [row].length; column ++) {
				if (charCount < str.length()){
					
				}
			}
		}
		
			 int row = 0;
			for (char column = 0; column < getarray[row].length; column ++) {
				 getarray [row][column] = str.charAt(charCount);
				 
			 }
			{
				 
				int column = 0;
				getarray [row][column] = '@';
			 }
			 charCount+=1;
	
			
				for (int column1 = 0; column1 < getarray[0].length; column1 ++) {
					for (int row1 = 0; row1 < getarray.length; row1 ++){
							 System.out.print(getarray[row1][column1] );
							 
					}
				}
			
							 
					 }
				}
				
		
	


		
		
	
		
	
	

							 
					
						
					 
			
				 
			 
		 
		
		
		   
		 
		
	


	
	

