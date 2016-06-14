package com.Shanklish.BattingStats;

import java.util.Scanner;
import org.w3c.dom.NamedNodeMap;


public class BattingStats
    {

	public static void main( String[] args )
	{
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Please enter the number of at bats");
	    int numofBats = scan.nextInt();
	    scan.nextLine();
	    	    
	    int [] battingArray = new int [numofBats];
	    
	    int sum = 0;
	    
	    double count = 0;
	    
	    for(int i = 0; i < battingArray.length; i++)
		{
		   System.out.println("Please enter the result for at-bat number " + i);
		   battingArray[i] = scan.nextInt();
		    
		   if(battingArray[i] != 0)
		       count++;
		   
		   sum += battingArray[i];
		   
		}
	    
	    float average = ((float)count / numofBats);
	    float slug = (float)sum/numofBats;
	    
	    System.out.println("The batting average is " + average + "00" + " and the slugging percentage is " + slug+"00");

	}

    }
