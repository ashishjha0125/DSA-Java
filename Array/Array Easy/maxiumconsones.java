
// this is questioning is solving the problem of maximum consecutive ones in the binary array  containing 0's and 1's.
// this is the optimal way to solve this question with  the time complexity of O(n) and space complexity of O(1).
public class maxiumconsones {

  public static int consone(int[] array, int n) {
    int maxcount = 0;
    int count = 0;

    for (int num : array) {
      if (num == 1) {
        count++;
        maxcount = Math.max(maxcount, count);
      } else {
        count = 0;
      }

    }

    return maxcount;
  }

  public static void main(String[] args) {

    int[] array = {
        0, 1, 1, 0, 0,
        1, 1, 1, 1, 1,
        1, 0, 0, 0, 0,
        0, 1, 0, 1, 1
    };
    int n = array.length;
    int number = consone(array, n);
    System.out.println("The missing number is: " + number);

  }

}
