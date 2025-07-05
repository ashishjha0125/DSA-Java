
import java.util.*;

public class nextPermutation {

  public static void nextpermutation(int[] array) {
    int n = array.length;
    int pivot = -1;
    for (int i = n - 2; i >= 0; i--) {
      if (array[i] < array[i + 1]) {
        pivot = i;
        break;
      }
    }
    if (pivot == -1) {
      int j = n - 1;
      int i = 0;
      while (i < j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
      }

      return;
    }
    for (int i = n - 1; i >= pivot; i--) {
      if (array[i] > array[pivot]) {
        int temp = array[i];
        array[i] = array[pivot];
        array[pivot] = temp;
        break;
      }
    }
    int i = pivot + 1, j = n - 1;
    while (i < j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 21, 6, 7, 8, 9, 20, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    nextpermutation(nums);
    System.out.println("Next permutation: " + java.util.Arrays.toString(nums));
  }
}
