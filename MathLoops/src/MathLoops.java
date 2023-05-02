/* Calvin(Jnghao) Fu, jfu14@u.rochester.edu, February 20th, Mathloops
 */

import java.util.Scanner;

public class MathLoops {
	
	//Execute the main method
		public static void main(String[]args) {
			
			Scanner scan = new Scanner(System.in);
			
			String input;
			while(!(input=scan.nextLine()).equals("quit")) {
				
				Scanner userinput = new Scanner(input);	
				String source = userinput.next();
				long num = userinput.nextLong();
				
				if (source.equals("prime")) {
					if (prime(num)) {
						System.out.println("True");
					}else {
						System.out.println("False");
					}
				}
				
				if (source.equals("factors")) {
					System.out.println("Factors:" +" "+factors(num));
				}
	
				}
			}
		
	public static boolean prime(long num) {
		
		if(num < 2) {
            boolean prime = true;
        } else{
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    return false;
                }
            }
        }return true;
	}
	
	
	//find the factors of the number
	public static String factors(long num) {
		String result = "";
		int factor = 2;
		
		while (factor <=num) {
			if (num % factor == 0 && prime(factor)) {
				result += factor + " ";
				num /= factor;
	
			}else {
				factor++;
			}
		}
		return result.trim();
		
		
		}
	}
		


