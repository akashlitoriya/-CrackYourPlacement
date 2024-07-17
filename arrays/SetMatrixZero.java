package arrays;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int matrix[][] = {{0,1,2,0}, {6,3,0,5},{9,10,0,11}};
        //bruteForce(matrix);
        optimized(matrix);
        System.out.println(Arrays.deepToString(matrix));;
    }   
    private static void bruteForce(int matrix[][]){
        //for each matrix[i][j] == 0, we will mark ith row and jth col to have zero
        //T.C = O(M * N) S.C = O(M + N)
        int n = matrix.length;
        int m = matrix[0].length;
        int row[] = new int[n];
        int col[] = new int[m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    } 

    private static void optimized(int matrix[][]){
        //Optimized - Instead of using two array to mark row and col, we will use 1st row and 1st column
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1;
        //Traversing matrix and marking 1st row and col accordingly
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j != 0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }
        //mark with zero from 1,1 -> n - 1, m - 1
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        //Mark 1st col and then 1st row
        if(matrix[0][0] == 0){
            for(int j = 0; j < m; j++){
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int i = 0; i < n; i++){
                matrix[i][0] = 0;
            }
        }
    }

}
