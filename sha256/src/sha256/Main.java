package sha256;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    // Create a BigInteger from a string

    BigInteger bigInt = new BigInteger("2").pow(256);

    // Create a BigInteger from an int
    BigInteger bigInt2 = BigInteger.valueOf(2).pow(256);
    

    // Perform arithmetic operations
    BigInteger sum = bigInt.add(bigInt2);
    BigInteger product = bigInt.multiply(bigInt2);

    // Print the results
    System.out.println("bigInt: " + bigInt);
    System.out.println("bigInt2: " + bigInt2);
    System.out.println("sum: " + sum);
    System.out.println("product: " + product);
  }
}
