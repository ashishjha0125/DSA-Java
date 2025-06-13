import java.util.Scanner;

public class characterhashing {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Take input string
    String str = s.nextLine();

    // Create a hash array of size 26 (for 'a' to 'z') and initialize to 0
    int hash[] = new int[26];

    // Precompute character frequencies
    for (int i = 0; i < str.length(); i++) {
      // Convert character to index and increment its count
      // Example: 'a' - 'a' = 0, 'b' - 'a' = 1, ..., 'z' - 'a' = 25
      hash[str.charAt(i) - 'a']++;
    }

    // Take number of queries
    int q = s.nextInt();

    // For each query
    while (q-- > 0) {
      // Read character for which frequency is needed
      char ch = s.next().charAt(0);

      // Print frequency of the character
      System.out.println(hash[ch - 'a']);
    }
  }

}
