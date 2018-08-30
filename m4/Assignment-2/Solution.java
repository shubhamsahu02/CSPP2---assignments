import java.util.Scanner;
/**
 *main class.
 */
public final class Solution {
    /* Fill the main function to print resultant of addition of matrices*/
    /**
     * //@return.
     */
    private Solution() {
     }

    /**
     * @param args [description]
     */

    public static void main(final String[] args) {
      int[][] arr1;
      int[][] arr2;
      int[][] sum;
      Scanner s = new Scanner(System.in);
      int row1 = s.nextInt();
      int column1 = s.nextInt();
      arr1 = new int[row1][column1];
      for (int i = 0; i < row1; i++) {
        for (int j = 0; j < column1; j++) {
            arr1[i][j] = s.nextInt();
        }
      }
      int row2 = s.nextInt();
      int column2 = s.nextInt();
      arr2 = new int[row2][column2];
      for (int i = 0; i < row2; i++) {
        for (int j = 0; j < column2; j++) {
            arr2[i][j] = s.nextInt();
    }
      }
      if ((row1 == row2) && (column2 == column2)) {
        sum = new int[row1][column2];
        for (int i = 0; i < row2; i++) {
        for (int j = 0; j < column2; j++) {
             sum[i][j] = arr1[i][j] + arr2[i][j];
        }
    }

     for (int i = 0; i < row2; i++) {
        for (int j = 0; j < column2; j++) {
            System.out.print(sum[i][j]);
             if (j < column2 - 1) {
                System.out.print(" ");
    }
      }
    System.out.println("");
    }
    } else {
    System.out.println("not possible");
}
}

}
