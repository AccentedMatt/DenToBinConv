package DenaryToBinaryConverter;

import java.util.Scanner;

public class DenToBinConv {
	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		System.out.print("Input a Base-10 natural number (from 0 - 255) to convert into an unsigned byte: ");
	    String numbertocheckstring = scanner.nextLine();
	    scanner.close();
	    int numbertocheck = Integer.parseInt(numbertocheckstring);
		
		String[] binarray = {"0","0","0","0","0","0","0","0"};
		int currentarrayaddress = 7;
		
		boolean activeconv = true;
		
		int modvalue = 0;
		int divvalue = 0;
		
		if (numbertocheck == 0) {
			activeconv = false;
		}
		else{
			while (activeconv) {
				modvalue = numbertocheck % 2;
				divvalue = numbertocheck / 2;
				
				numbertocheck = divvalue;
				String modvaluestring = String.valueOf(modvalue);
				binarray[currentarrayaddress] = modvaluestring;
				
				if (divvalue == 0 || currentarrayaddress <= 0) {
	                   activeconv = false;
	            } 
				else {
	            	currentarrayaddress--;
	            }
			}
		}
		
		String stringtoprint = String.join("",binarray);
		
		System.out.println("Your value in binary is " + stringtoprint);
	}
}