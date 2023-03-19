package com.juaracoding.ujianminggu6;

public class Soal_1 {
    public static void main(String[] args) {
        int a,b;
        a = 1  ;
        b = 100 ;

        //al0garitma perulang mencetak angak 1 - 100
        for (int angka = a ; angka <= b ; angka++)

            // JIKA ANGKA KELIPATAN 3 DAN 5
            if ((angka % 3 == 0) && (angka % 5 == 0 )) {
            System.out.println("BIZZBUZZ");
            }

            // JIKA ANGKA KELIPATAN 3
            else if ((angka % 3) == 0 ) {
                System.out.println("BIZZ");
            }

            // JIKA ANGKA KELIPATAN 5
            else if ((angka % 5) == 0 ){
                System.out.println("BUZZ");
            }

            // SELAIN ITU PRINT ANGKA
            else {
                System.out.println(angka);
            }
    }
}
