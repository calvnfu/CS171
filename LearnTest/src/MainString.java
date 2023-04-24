
public class MainString {
	
	public static void main(String[] args) {
		
		String name = "Calvin";
		
		boolean iname = name.equals("Calvin");
		System.out.println(iname);
		
		//int result = name.length();
		String result = name.trim();
		System.out.println(result);
		
		char cha = name.charAt(3);
		System.out.println(cha);
		
		int namep = name.indexOf("i");
		System.out.println(namep);
		
		boolean result1 = name.isEmpty();
		System.out.println(result1);
		
		String name2 = name.toUpperCase();
		System.out.println(name2);
		
		String name3 = name.replace("a","b");
		System.out.println(name3);
		
		
		
		
		
	}

}
