import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class Sha {
  public static void main(String[] args) {
    Random rand = new Random();
    String input = "calvinfu" + rand.nextInt();
    String hash = getSHA256Hash(input);
    while (!hash.startsWith("00")) {
      input = "calvinfu" + rand.nextInt();
      hash = getSHA256Hash(input);
    }
    System.out.println("input: " + input);
    System.out.println("hash: " + hash);
  }

  private static String getSHA256Hash(String input) {
    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-256");
      byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
      StringBuilder hexString = new StringBuilder();
      for (byte b : hash) {
        String hex = Integer.toHexString(0xff & b);
        if (hex.length() == 1) {
          hexString.append('0');
        }
        hexString.append(hex);
      }
      return hexString.toString();
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
  }

    
