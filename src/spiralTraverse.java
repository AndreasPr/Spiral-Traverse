/**
 * Created on 09/Jan/2021 to Spiral-Traverse
 */
public class spiralTraverse {


    private static void spiral(int[][] matrix, int rows, int columns){

        int start_row_index = 0;
        int end_row_index = rows;
        int start_column_index = 0;
        int end_column_index = columns;
        int i;

        while(start_row_index < end_row_index && start_column_index < end_column_index){

            // Print the first row from the remaining rows
            for(i = start_column_index; i < end_column_index; ++i){
                System.out.println(matrix[start_row_index][i] + " ");
            }
            start_row_index++;

            // Print the last column from the remaining columns
            for(i = start_row_index; i < end_row_index; ++i){
                System.out.println(matrix[i][end_column_index - 1] + " ");
            }
            end_column_index--;

            //Print the last row from the remaining rows
            if(start_row_index < end_row_index){
                for(i = end_column_index - 1; i >= start_column_index; --i){
                    System.out.println(matrix[end_row_index - 1][i] + " ");
                }
                end_row_index--;
            }

            //Pring the first column from the remaining columns
            if(start_column_index < end_column_index){
                for(i = end_row_index - 1; i >= start_row_index; --i){
                    System.out.println(matrix[i][start_column_index] + " ");
                }
                start_column_index++;
            }
        }
    }

    public static void main(String args[]){

        int rows = 3;
        int columns = 3;
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        spiral(matrix, rows, columns);
    }
}
