package StrukturData;

import java.util.*;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
         System.out.println("masukkan batas: ");
        int a= De.nextInt();
        
        String b []= new String[a];
        
        for (int i = 0; i < b.length; i++) {
            System.out.println("Masukkan: ");
            b[i]=De.next();
        }
        System.out.println(Arrays.toString(b));
       
    }
    
}
