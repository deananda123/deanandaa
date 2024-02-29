package StrukturData;

import java.util.*;

public class TugasArray {
    public static void main(String[] args) {
        
        System.out.println("Array 1 Dimensi dengan 8 tipe data primitif");
        //1.buatlah array 1 dimensi dengan 8 tipe data dan berikan nilai padda setiap array tersebut
        int a []={1,2,300};
        byte b []={1,2,33};
        short c []={1,2,3,4};
        long d []={1,2,30000};
        float e []={1.3f,2.3f,3.0f};
        double f []={11.2,2.2321,3.12100};
        char g []={'a','=','6','@'};
        boolean h []={true,false,true};
        
        //2.mencetak array dengan 5 metode
        System.out.println("1.for");
        System.out.print("{ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("}");
        
        System.out.println("\n2.for-each");
        System.out.print("{ ");
        for(byte i : b){
            System.out.print(i+" ");
        }
        System.out.println("}");
        
        System.out.println("\n3.while");
        int i =0;
        System.out.print("{ ");
        while(i<c.length){
            System.out.print(c[i]+" ");
            i++;
        }
        System.out.println("}");
        
        System.out.println("\n4.do-while");
        System.out.print("{ ");
        int j =0;
        do{
            System.out.print(d[j]+" ");
            j++;
        }while(j<d.length);
        System.out.println("}");
        
        System.out.println("\n5.class Array");
        System.out.println(Arrays.toString(e));
        
        //3.Array 2 Dimensi dengan inputan
        System.out.println("\n\nArray 2 Dimensi dengan Inputan");
        Scanner De = new Scanner(System.in);
        
        int k [][]= new int[2][2];
        for (int l = 0; l < k.length; l++) {
            for (int m = 0; m < k[l].length; m++) {
                System.out.print("["+l+"]"+"["+m+"]"+"= ");
                k[l][m]= De.nextInt();
            }
           
        }
         System.out.println(Arrays.deepToString(k));
         
         
         //4.ArrayList tipe data Wrapper
         System.out.println("\n\nArrayList Tipe Data Wrapper(Double)");
         ArrayList <Double> n = new ArrayList<>();
         n.add(22.2);
         n.add(160.8);
         n.add(45.7);
         n.add(23.00);
         
         System.out.println(n);
         
         
         //5.ArrayList bertipe data Integer
         System.out.println("\n\nArrayList bertipe data Integer");
         ArrayList<Integer> o = new ArrayList<>();
         
         o.add(11);
         o.add(12);
         o.add(13);
         o.add(14);
         o.add(15);
         System.out.println("isi: "+o);
         
         System.out.println("indeks ke 2: "+o.get(2));
         
         o.set(0, 10);
         System.out.println("Setelah di ganti: "+o);
         
         o.remove(4);
         System.out.println("Setelah Dihapus: "+o);
         
         System.out.println("Ukuran ArrayList: "+ o.size());
    }
    
}
