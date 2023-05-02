import java.util.Scanner;

public class Airplane {
	
	private static String name;
	private static float TOW_min, TOW_max, range, speed, hourly_cost, fuel_rate ;
	private static float mass, distance, payments;
	
	public Airplane(String name, float Tow_min, float TOW_max, float range, float speed, float hourly_cost, float fuel_rate) {
		this.name = name;
		this.TOW_min = Tow_min;
		this.TOW_max = TOW_max;
		this.range = range;
		this.speed = speed;
		this.hourly_cost = hourly_cost;
		this.fuel_rate = fuel_rate;
	}
	
	public Airplane(float mass, float distance, float payments) {
		this.mass = mass;
		this.distance = distance;
		this.payments = payments;
	}
	
//	public String getName() {
//		return name;
//	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of planes");
		Scanner s = new Scanner(System.in);
		int numAirplanes = s.nextInt();
		
		Airplane[] airplanes = new Airplane[numAirplanes];
		
		//Plane Attributes
		for(int i=0; i<numAirplanes; i++) {
			System.out.println("Enter the Airplane number" +(i+1)+"'s "+ "attributes: <name> <TOW_min> <TOW_max> <range> <speed> <hourly_cost> <fuel\\_rate>.");
			
			String source = s.next();
			float TOW_min = s.nextFloat();
			float TOW_max = s.nextFloat();
			float range = s.nextFloat();
			float speed = s.nextFloat();
			float hourly_cost = s.nextFloat();
			float fuel_rate = s.nextFloat();
			
			airplanes[i] = new Airplane(source, TOW_min, TOW_max, range, speed, hourly_cost, fuel_rate);
		}
		
		//Three tokens
	
		float totalProfit = 0;
		float profits = 0;
		
		String bestPlane = null;
		float bestProfit = Float.NEGATIVE_INFINITY;
		
		System.out.println("Enter: <mass> <distance> <payment>.");
		
		while (true){
			
			String input=s.next();
			
			float mass = Float.parseFloat(input);
			float distance = s.nextFloat();
			float payments = s.nextFloat();
			
				for(int i=0; i<numAirplanes;i++) {
			
					if(input.equals("quit")) {
						break;
					}
								
				//what's the formula
				profits = payments-(airplanes[i].hourly_cost * (distance/airplanes[i].speed)*mass*(airplanes[i].fuel_rate));
				
				if(profits>bestProfit) {
				bestProfit = profits;
				
				//get name
				bestPlane = airplanes[i].name;	
				}
			}
			
			if (bestPlane == null) {
	            System.out.println("Decline");
	            break;
	        } else {
	            System.out.println(bestPlane +" "+bestProfit);
	            totalProfit += bestProfit;
	        }
					
		}
		
		System.out.printf("Total profit: $%.2f\n", totalProfit);
        s.close();
        
	}//main method
				
}