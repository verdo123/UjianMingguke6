package com.juaracoding;
import java.util.Scanner;

public class Main {

//Soal No 1--------------------------------------------------

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // memasukkan angka
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        // Evaluasi input mencetak hasil sesuai aturan
        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("BIZZBUZZ");
        } else if (angka % 3 == 0) {
            System.out.println("BIZZ");
        } else if (angka % 5 == 0) {
            System.out.println("BUZZ");
        } else {
            System.out.println("Angka yang dimasukkan bukan kelipatan 3 dan 5");
        }

        scanner.close();
    }
}

//Soal No 2--------------------------------------------------
        public static void main(String[] args) {
            System.out.print("1_3_5_7_9\n");
            System.out.print("_3_5_7_\n");
            System.out.print("3_5_7\n");
            System.out.print("_5_\n");
            System.out.print("5\n");
        }
    }



