import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("Digite o número de dentro da matriz 3x3 ["+i+"]["+j+"]:");
                int inteiros = in.nextInt();
                matriz[i][j] = inteiros;
            }
        }

        print2D(matriz);
    }



    public static void print2D(int mat[][]) {
        for (int[] row : mat) {
            for (int j = 0; j < row.length; j++) {
                System.out.print("[" + row[j] + "] ");
            }
            System.out.println();
        }
    }
    }
