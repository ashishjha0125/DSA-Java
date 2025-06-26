public class missingnumber {

  public static int missingNumber(int[] array, int n) {

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
    int number = missingNumber(array, n);
    System.out.println("The missing number is: " + number);

  }
}
// this is a optimal approach for solving this question with time complexity on
// O(n) and space complexity of O(1) .
// there is one more optimal approach to solve this question is XOR method