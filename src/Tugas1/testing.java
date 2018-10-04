package Tugas1;

import java.util.Scanner;

/**
 *
 * @author malang
 */
public class testing {

    public static void main(String[] args) {
        Scanner ck = new Scanner(System.in);

        System.out.println("Yosieka Putri Wibawa/ XRPL 6/ 40");
        int ulangi;
        do {
            System.out.println("=================================");
            System.out.println("<<<<<<<<BERAT BADAN IDEAL>>>>>>>>");
            System.out.println("=================================");
            System.out.print("Masukkan tinggi badan someone : ");
            double tinggi = ck.nextDouble();
            System.out.println();
            System.out.println("Pilihan jenis Kelamin");
            System.out.println("1.Laki-Laki");
            System.out.println("2.Perempuan");
            System.out.print("Masukkan pilihan jenis kelamin :");
            int pilih = ck.nextInt();

            if (pilih == 1) {
                manusia lk = new Laki(tinggi);
                String jeniskel1 = "Laki-Laki";
                System.out.println("=================================");
                System.out.println();
                System.out.println("Jenis Kelamin :" + jeniskel1);
                System.out.println("Tinggi badan :" + lk.tinggiBadan() + " Cm");
                System.out.println("Berat badan ideal :" + lk.hitBbi() + " Kg");
            }
            if (pilih == 2) {
                manusia pr = new perempuan(tinggi);
                String jeniskel2 = "Perempuan";
                System.out.println("=================================");
                System.out.println();
                System.out.println("Jenis Kelamin :" + jeniskel2);
                System.out.println("Tinggi badan :" + pr.tinggiBadan() + " Cm");
                System.out.println("Berat badan ideal :" + pr.hitBbi() + " Kg");
            }
            System.out.print("Apakah ingin mengulangi? 1 for Ya dan 0 for Tidak :");
            ulangi = ck.nextInt();
            System.out.println();

        } while (ulangi == 1);
        System.out.println("==============SELESAI===============");
    }
}
