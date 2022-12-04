//***************************************************** Spiral-Matrix ************************************************************

package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int maxNum = 0;
        int i = 0;
        int j = 0;
        int p = 0;
        int tillRow = rows - 1;
        int tillColumn = columns - 1;


        int[][] spiralMatrix = new int[rows][columns];

        if (tillRow == 0) {
            for (i = 0; i < spiralMatrix.length; i++) {
                for (j = 0; j < spiralMatrix[i].length; j++) {
                    spiralMatrix[i][j] = ++maxNum;
                }
            }
        } else

            while (maxNum < rows * columns - 1) {

                // Looping in row to the right, starting from up
                while (j < tillColumn) {
                    spiralMatrix[i][j] = ++maxNum;
                    j++;
                }

                // Looping in column, down
                while (i < tillRow) {
                    spiralMatrix[i][j] = ++maxNum;
                    i++;
                }

                // Looping in column, up
                while (j > p) {
                    spiralMatrix[i][j] = ++maxNum;
                    j--;
                }

                tillRow--;
                tillColumn--;
                p++;
                // Looping in row to the left, starting from down
                while (i > p) {
                    spiralMatrix[i][j] = ++maxNum;
                    i--;
                }

            }

        if (maxNum == rows * columns - 1) spiralMatrix[i][j] = ++maxNum;

        return spiralMatrix;
    }
}
