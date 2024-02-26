package StrukturData;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        System.out.println("ARRAY DUA DIMENSI TIPE DATA PRIMIRTIF");
        short[][] b = new short[3][3];
        short x = 1;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = x++;

            }
        }
        System.out.println("-short");
        System.out.println(Arrays.deepToString(b) + "\n");

        byte[][] a = {{1, 2, 3}, {1, 2, 3}};
        System.out.println("-byte");
        System.out.println(Arrays.deepToString(a) + "\n");

        Scanner De = new Scanner(System.in);
        int[][] c = new int[3][3];
        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < c[i].length; j++) {
                System.out.print("masukkan angka: ");
                c[i][j] = De.nextInt();
            }

        }
        System.out.println("-int");
        System.out.println(Arrays.deepToString(c) + "\n");

        long[][] d = new long[3][3];
        Random y = new Random();
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = y.nextLong(3);
            }
        }
        System.out.println("-long");
        System.out.println(Arrays.deepToString(d) + "\n");

        float[][] e = {{1.2f, 2.3f}, {2.4f, 6.0f}};
        byte s = 0;
        
        System.out.println("-float");
        while (s < e.length) {
            byte k = 0;
            while (k < e[s].length) {
                System.out.print(e[s][k] + ", ");
                k++;
                
            }
            System.out.println();
            s++;

        }
        System.out.println("\ndouble");

        double[][] f = {{1.22, 2.3},{2.4, 3.2}};
        byte o = 0;
        do {
            byte t = 0;
            do{
            System.out.print(f[o][t]+", ");
            t++;
            }while(t< f[o].length);
            System.out.println();
            o++;
        } while (o < f.length);

        System.out.println("-char");
        char[][] g = {{'a', 'b', 'c'},{'#','-','*'}};
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                 System.out.print(g[i][j]+", ");
            }
            System.out.println();
        }

        boolean[][] h = {{true, false, false},{true, false, false}};
        System.out.println("-boolean");
        System.out.println(Arrays.deepToString(h));

    }

}
