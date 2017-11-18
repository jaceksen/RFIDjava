

import java.util.Scanner;

	public class Glowna{
	    public static void main(String args[]){

	    Scanner scan= new Scanner(System.in);
	    
	    System.out.print("Zeskanuj kartę: ");

//	    For string

	    while(true){
	    String text= scan.nextLine();

//	    System.out.println("\nZeskanowano kartę: " + text);
	    
	    if(text.equals("0005714063"))
	    {
	    	System.out.println("\nKarta należy do Jacka Senia.");
	    	System.out.println("Dostęp do pokoi: 520, 514, 519");
	    }
	    
	    System.out.print("\nZeskanuj kartę: ");
	    }

	    //for int

	    //while(true){
	    //int num= scan.nextInt();

	    //System.out.println("Zeskanowano kartę o numerze: " + num);
	    //}
	    }
	}

