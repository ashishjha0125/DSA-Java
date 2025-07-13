public class rotatematrixby90 {

  // Utility to print matrix
  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.print(val + " ");
      }
      System.out.println();
    }
  }

  // ✅ Brute-force method: Uses extra space
  public static int[][] rotateMatrixBrute(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;
    int[][] rotated = new int[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        rotated[j][row - 1 - i] = matrix[i][j];
      }
    }
    return rotated;
  }

  // ✅ Optimal method: In-place rotation using transpose + reverse
  public static void rotateMatrixOptimal(int[][] matrix) {
    int n = matrix.length;

    // Step 1: Transpose the matrix
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        // Swap matrix[i][j] and matrix[j][i]
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    // Step 2: Reverse each row
    for (int i = 0; i < n; i++) {
      int left = 0, right = n - 1;
      while (left < right) {
        int temp = matrix[i][left];
        matrix[i][left] = matrix[i][right];
        matrix[i][right] = temp;
        left++;
        right--;
      }
    }
  }

  public static void main(String[] args) {
    int[][] originalMatrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    System.out.println("🔹 Original Matrix:");
    printMatrix(originalMatrix);

    // Brute-force Rotation
    int[][] bruteResult = rotateMatrixBrute(originalMatrix);
    System.out.println("\n Rotated Matrix (Brute-force - extra space):");
    printMatrix(bruteResult);

    // For in-place, clone the original matrix again
    int[][] inPlaceMatrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    rotateMatrixOptimal(inPlaceMatrix);
    System.out.println("\nRotated Matrix (Optimal - in-place):");
    printMatrix(inPlaceMatrix);
  }
}
