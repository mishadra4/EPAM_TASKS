package EPAM_LECTURE_2;

import java.util.ArrayList;

/**
 * Created by User on 23-Dec-17.
 */
public class Matrix {
    private Integer sumUpperMainDiagonal;
    private Integer sumLowerMainDiagonal;
    private ArrayList<Integer> [] matrix;
    public void createMatrix(){
        matrix = new ArrayList[4];
        for (int i = 0; i < 4; i++) {
            matrix[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i].add(j, 0);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                matrix[i].add(j, (int) (Math.random() * 10));
                matrix[j].add(i,  10 + (int)(Math.random() * 10));
            }
        }
    }
    public void printMatrix(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i].get(j) + "\t");
            }
            System.out.println();
        }
    }
    public void sumElements(){
        sumLowerMainDiagonal = 0;
        sumUpperMainDiagonal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                sumUpperMainDiagonal += matrix[i].get(j);
                sumLowerMainDiagonal += matrix[j].get(i);
            }
        }
        System.out.println("Sum of upper main diagonal elements = " + sumUpperMainDiagonal);
        System.out.println("Sum of lower main diagonal elements = " + sumLowerMainDiagonal);
    }
}
