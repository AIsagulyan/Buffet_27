/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		getColor(123,98,244);
        int x = (int)(Math.random() * 255);
        
        getColor(x,234 ,98);

        int z =(int)(Math.random() * 255);
        
        getColor(z,89,68);

        int r =(int)(Math.random() * 255);
        getColor(r,25,)


		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
