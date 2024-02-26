package StrukturData;

import java.util.*;

public class Tugas1 {

    public static void main(String[] args) {
        System.out.println("ARRAY SATU DIMENSI TIPE DATA PRIMIRTIF");
        byte[] a = {1, 2, 3};
        System.out.println("-byte");
        System.out.println(Arrays.toString(a) + "\n");

        short[] b = new short[3];
        short x = 1;
        for (int i = 0; i < b.length; i++) {
            b[i] = x++;
        }
        System.out.println("-short");
        System.out.println(Arrays.toString(b) + "\n");

        Scanner De = new Scanner(System.in);
        int[] c = new int[3];
        for (int i = 0; i < c.length; i++) {
            System.out.print("masukkan angka: ");
            c[i] = De.nextInt();
        }
        System.out.println("-int");
        System.out.println(Arrays.toString(c) + "\n");

        long[] d = new long[3];
        Random y = new Random();
        for (int i = 0; i < d.length; i++) {
            d[i] = y.nextLong(3);
        }
        System.out.println("-long");
        for (long z : d) {
            System.out.println(z);
        }
        System.out.println();

        float[] e = {1.2f, 2.3f, 3.1f};
        byte s = 0;
        System.out.println("-float");
        while (s < e.length) {
            System.out.println(e[s]);
            s++;
        }
        System.out.println();

        double[] f = {1.22, 2.3, 3.1};
        byte o = 0;
        do {
            System.out.println(f[o]);
            o++;
        } while (o < f.length);
        
        System.out.println("-char");
        char[] g = {'a','b','c'};
        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i]);
        }
        
        boolean [] h = {true, false, false};
        System.out.println("-boolean");
        for (boolean i: h) {
            System.out.print(i+" , ");
        }
        

    }

}
