
public interface Animal {
	
	public void animalsound();
	public void sleep();
	
//	public static void main(String[] args) {
//		System.out.println("Hello");
//	}
	
}
	
	class Pig implements Animal {
		
		public void animalsound() {
			System.out.println("hello sound");
		}
		
		public void sleep() {
			System.out.println("hellp sleep");
		}
		
	}
	
	public class Interface {
		
		public static void main(String[] args) {
			Pig newpig = new Pig();
			
			newpig.animalsound();
			newpig.sleep();
		}
	}



