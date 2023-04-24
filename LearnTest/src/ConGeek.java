
class Geek {
	Geek(String name){
		System.out.println("this is " + name);
	}
	
	Geek (int num, String name){
		System.out.println(num + " " + name);
	}
	
	Geek(long id){
		System.out.println(id);
	}
}



public class ConGeek {

	public static void main(String[] args) {

		Geek geek1 = new Geek("Hello");
		
		
		Geek geek2 = new Geek(10,"what");
		
		
		Geek geek3 = new Geek(200);
		
	}

}
