import java.util.*;

public class leadersInArray {

  public static List<Integer> findLeaders(int[] arr) {
    int n = arr.length;
    List<Integer> leaders = new ArrayList<>();
    int maxfromRight = arr[n - 1];
    leaders.add(maxfromRight); // The last element is always a leader
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] > maxfromRight) {
        maxfromRight = arr[i];
        leaders.add(maxfromRight);
      }
    }
    Collections.reverse(leaders); // Reverse to maintain order
    return leaders;
  }

  public static void main(String[] args) {
    int[] arr = { 16, 17, 4, 3, 5, 2 };
    System.out.println("Leaders in the array: ");
    List<Integer> leaders = findLeaders(arr);
    System.out.println(leaders);
  }
}
