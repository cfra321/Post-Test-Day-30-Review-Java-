package com.juaracoding.ujianminggu6;

public class Soal_2 {
    public static void main(String[] args) {
        int n = 9;
        int i, j;

        //LOOPING SAMPAI NILAI I = N
        for (i = 1; i <= n; i++) {

            //LOOPING NILAI J SAMPAI J = N
            for (j = i; j <= n; j++) {

                // JIKA ANGKA GENAP MAKA PRINT _
                if (j %2 == 0 ){
                    System.out.print("_");
                }
                //SELAIN GENAP PRINT NILAI NYA
                else {
                    System.out.print(j);
                }
            }
            //DECREMEN  NILAI N (9) DAN PRINT LINE BARU
            n--;
            System.out.println();
        }
    }

}
