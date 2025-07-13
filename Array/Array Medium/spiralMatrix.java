public class spiralMatrix {

  public static void printSpiral(int[][] matrix) {
    int top = 0;
    int bottom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;

    System.out.println("Spiral Order Traversal:");

    while (top <= bottom && left <= right) {

      // Traverse from left to right (Top row)
      for (int i = left; i <= right; i++) {
        System.out.print(matrix[top][i] + " ");
      }
      top++; // Move top boundary down

      // Traverse from top to bottom (Right column)
      for (int i = top; i <= bottom; i++) {
        System.out.print(matrix[i][right] + " ");
      }
      right--; // Move right boundary left

      // Traverse from right to left (Bottom row) if top <= bottom
      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          System.out.print(matrix[bottom][i] + " ");
        }
        bottom--; // Move bottom boundary up
      }

      // Traverse from bottom to top (Left column) if left <= right
      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          System.out.print(matrix[i][left] + " ");
        }
        left++; // Move left boundary right
      }
    }
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 }
    };

    System.out.println("Original Matrix:");
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.print(val + " ");
      }
      System.out.println();
    }

    System.out.println();
    printSpiral(matrix);
  }
}
