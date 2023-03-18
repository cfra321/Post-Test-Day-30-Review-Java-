package com.juaracoding.ujianminggu6;

public class Soal_2 {
    public static void main(String[] args) {
        int n = 9;
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                if (j %2 == 0 ){
                    System.out.print("_");
                }
                else {
                    System.out.print(j);
                }
            }
            n--;
            System.out.println();
        }
    }

}
