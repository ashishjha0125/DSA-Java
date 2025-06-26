public class missingnumber {

  public static int linearsearchmethod(int[] array, int n) { // brutforce approach time complexity is O(n^2) and space
                                                             // complexity is O(1)

    for (int i = 1; i <= n + 1; i++) {
      boolean found = false;
      for (int j = 0; j < n; j++) {
        if (array[j] == i) {
          found = true;
          break;
        }
      }
      if (found == false) {
        return i;
      }

    }

    return -1;
  }

  public static int hashingmethod(int array[], int n) { // better approach time complexity is O(n) and space complexity
                                                        // is O(n)
    int[] hash = new int[n + 2];

    for (int num : array) {
      hash[num]++;
    }
    for (int i = 1; i < n + 2; i++) {
      if (hash[i] == 0) {
        return i;
      }
    }
    return -1;
  }

  public static int optimalmissingNumber(int[] array, int n) { // optimal approach time complexity is O(n) and space
                                                               // complexity is O(1)

    int expectedsum = (n + 1) * (n + 2) / 2;
    int actualsum = 0;
    for (int num : array) {
      actualsum = actualsum + num;

    }

    return expectedsum - actualsum;
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 6, 7, 8, 9 };
    int n = array.length;

    int number1 = linearsearchmethod(array, n);
    System.out.println("The missing number using brut approach  is: " + number1);

    int number2 = hashingmethod(array, n);
    System.out.println("The missing number using better approach  is: " + number2);

    int number3 = optimalmissingNumber(array, n);
    System.out.println("The missing number using optimal is: " + number3);

  }
}
