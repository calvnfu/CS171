/*Calvin(Jingaho) Fu, jfu14@u.rochester.edu, Feb 1st 2023,CalvulatorHW
 * 
 * 
 */
import java.util.Scanner;

public class CalculatorHW {

	public static void main(String[] args) {
		
		//Calculator conversion
		
		double f = 1;
		double c = 1;
		double ftoc = (5/9)*(f-32);
		double ctof = (9/5)*c+32;
		double ftof = 1;
		double ctoc = 1;
		
		double kgtolb = 2.20462;
		double lbtokg = 0.453592;
		double kgtokg = 1;
		double lbtolb = 1;
		
		double mtoft = 3.28084;
		double fttom = 0.3048;
		double mtom = 1;
		double fttoft = 1;
		
		double htomin = 60;
		double mintoh = 0.0166667;
		double htoh = 1;
		double mintomin = 1;
		
			
			System.out.println("Enter the message corresponding to <value> <source> to <dest>. Press any keys to start and space bar to stop.");
			
			//surround if else logic with a while loop
			
			//create second scanner 
			// Scanner scan2 = new Scanner(input)
			// String svalue = scan2.next()
			//convert svalue to double
			// keep doing scan2.next to get source, "to", dest
			
			Scanner sc = new Scanner(System.in);
			
			String input;
			while (!(input = sc.nextLine()).equals("")) {
				Scanner sc2 = new Scanner(input);
				
				String svalue = sc2.next();
				//double value = sc2.nextDouble();
				double value = Double.parseDouble(svalue);
				
				String source = sc2.next();
				
				sc2.next();
				String dest = sc2.next();
			
			
			if (source.equals("m") && dest.equals("ft")) {
				System.out.printf("%.3f",value*mtoft);
			} 
			else if (source.equals("ft") && dest.equals("m")) {
				System.out.printf("%.3f",value*fttom);
			}
			else if (source.equals("m") && dest.equals("m")) {
				System.out.printf("%.3f",value*mtom);
			}	
			else if (source.equals("ft") && dest.equals("ft")) {
				System.out.printf("%.3f",value*fttoft);
			}
			
			//m & h
			else if (source.equals("min") && dest.equals("h")) {
				System.out.printf("%.3f",value*mintoh);
			}
			else if (source.equals("h") && dest.equals("min")) {
				System.out.printf("%.3f",value*htomin);
			}
			else if (source.equals("h") && dest.equals("h")) {
				System.out.printf("%.3f",value*htoh);
			}
			else if (source.equals("min") && dest.equals("min")) {
				System.out.printf("%.3f",value*mintomin);
			}
			
			//f & c
			else if (source.equals("f") && dest.equals("c")) {
				System.out.printf("%.3f",value*ftoc);
			}
			else if (source.equals("c") && dest.equals("f")) {
				System.out.printf("%.3f",value*ctof);
			}
			else if (source.equals("f") && dest.equals("f")) {
				System.out.printf("%.3f",value*ftof);
			}
			else if (source.equals("c") && dest.equals("c")) {
				System.out.printf("%.3f",value*ctoc);
			}
			
			//kg & lb
			else if (source.equals("kg") && dest.equals("lb")) {
				System.out.printf("%.3f",value*kgtolb);
			}
			else if (source.equals("lb") && dest.equals("kg")) {
				System.out.printf("%.3f",value*lbtokg);
			}
			else if (source.equals("kg") && dest.equals("kg")) {
				System.out.printf("%.3f",value*kgtokg);
			}
			else if (source.equals("lb") && dest.equals("lb")) {
				System.out.printf("%.3f",value*lbtolb);
			}
			else {
				System.out.println("***Unable to convert from "+ source +" to " +dest);
			}
			
			}//end of while loop
			
			
		}	


	
	
}
