public class Search2DArray {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int target = 50;

        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == target) {
                    System.out.println(
                        "Found at row " + i + ", column " + j
                    );

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}
/*
Found at row 1, column 1
  matrix[row][column]
         col
       0   1   2
     ┌───────────
row 0│ 10  20  30
row 1│ 40  50  60
row 2│ 70  80  90
  50
  matrix[1][1] so
  row = 1
column = 1
  */
  
  
