
public class OreillyRandom {

	public static void main(String[] args) {
		String[] Wordlist1 = {"hello","my","name","is","calvin","fu"};
		String[] Wordlist2 = {"This","is","my","name","I","guess"};
		String[] Wordlist3 = {"I'm", "currently","studying","at","uofr"};
		
		int count1 = Wordlist1.length;
		int count2 = Wordlist2.length;
		int count3 = Wordlist3.length;
		
		System.out.println(count1);
		
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(count1);
		int rand2 = randomGenerator.nextInt(count2);
		int rand3 = randomGenerator.nextInt(count3);
		
		String phrase = Wordlist1[rand1] +" "+ Wordlist2[rand2] +" "+ Wordlist3[rand3];
		System.out.println(phrase);
		
		
	}

}
