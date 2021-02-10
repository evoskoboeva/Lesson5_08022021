package com.companyCat;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Lesson_Task2();
        Lesson_Task7();


    }


     private static void Lesson_Task7() {
        // 7. Дан Двумерный массив из четного числа строк. Поменять
        //местами первую строку со второй, третью — с четвертой
        //и т. д.

        final int ROWS = 8;
        final int COLS = 7;
        final int TWO = 2;
        int[][] matrix = new int[ROWS][COLS];
        int[] matrixReverse = new int[TWO * COLS];

        int reverse;
        int next;

        for (int row = 0; row < ROWS; row++) {
            for (int columns = 0; columns < COLS; columns++) {
                matrix[row][columns] = (int) (Math.random() * 1000 / 10.);
                System.out.print("\t" + matrix[row][columns] + "\t");
            }
            System.out.println();

        }
        System.out.println(System.lineSeparator());
            int circle = ROWS/TWO;
            int circle1=0;

            do {
                reverse = 0;

                for (int row = circle1; row < TWO+circle1; row += 1) {
                    for (int columns = 0; columns < COLS; columns++) {
                        matrixReverse[reverse++] = matrix[row][columns];
                    }
                    //System.out.println(Arrays.toString(matrixReverse));
                }

                for (reverse = 0; reverse < COLS; reverse++) {
                    next = matrixReverse[reverse + COLS];
                    matrixReverse[reverse + COLS] = matrixReverse[reverse];
                    matrixReverse[reverse] = next;
                }
                //System.out.println(Arrays.toString(matrixReverse));

                reverse = 0;
                for (int rows = circle1; rows < TWO+circle1; rows += 1) {
                    for (int columns = 0; columns < COLS; columns++) {
                        matrix[rows][columns] = matrixReverse[reverse++];
                        System.out.print("\t" + matrix[rows][columns] + "\t");
                    }
                    System.out.println();
                }
                circle--;
                circle1+=2;

            }while (circle !=0);

        }


    private static void Lesson_Task2() {
        //2. Найти сумму элементов Двумерного массива
        //вещественных чисел C[15, 15], расположенных на
        //главной диагонали. (элементы главной диагонали – это
        //элементы у которых индекс столбца и строки совпадает,
        //например matrix[1][1] – второй элемент главной
        //диагонали матрицы)

        final int ROWS = 15, COLUMNS = 15;
        double[][] matrix = new double[ROWS][COLUMNS];
        double sum = 0;

        for (int row = 0; row < ROWS; row++) {
            for (int cols = 0; cols < COLUMNS; cols++) {
                matrix[row][cols] = (int)(Math.random() * 100)/10;
                //matrix[row][cols] = 5; //для теста

                System.out.print("\t"+matrix[row][cols]+"\t");
                if (row == cols) {
                    sum += matrix[row][cols];
                }
            }
            System.out.println();
        }
        System.out.print("\t" + (int)sum+"\t");

    }
}

