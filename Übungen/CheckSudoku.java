package Übungen;

public class CheckSudoku {
    public static void main(String[]args){
        int[][] sudoku1 ={
                {5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}
        };

        System.out.println(checkSudoku(sudoku1));
    }

    public static boolean checkSudoku(int[][] sudoku){
        return checkSudokuZeilen(sudoku) && checkSudokuSpalten(sudoku);
    }

    public static boolean checkSudokuZeilen(int[][] sudoku){
        int value = 0;
        for (int i = 0; i < 9; i++) {
            value = 0;
            for (int j = 0; j < 9; j++) {
                value += sudoku[i][j];
            }
            if(!(value == 45)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkSudokuSpalten(int[][] sudoku){
        int value = 0;
        for (int i = 0; i < 9; i++) {
            value = 0;
            for (int j = 0; j < 9; j++) {
                value += sudoku[j][i];
            }
            if(!(value == 45)){
                return false;
            }
        }
        return true;
    }
}
