/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 *
 * @author malang
 */
public class classUji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ulangi, ulangi2;
        System.out.println("Yosieka Putri Wibawa/ XRPL6/ 40");
        System.out.println("================================");
        System.out.println("<<<<<<<<OPERASI BILANGAN>>>>>>>>");
        System.out.println("================================");
        System.out.println();
        Scanner cf = new Scanner(System.in);
        kalkulator data = new kalkulator();
        do{
        System.out.print("Masukkan bilangan ke-1 :");
        double bil1 = cf.nextDouble();
        data.setBil1(bil1);
        System.out.print("Masukkan bilangan ke-2 :");
        double bil2 = cf.nextDouble();
        data.setBil2(bil2);
            System.out.println();
        do{
        System.out.println("Pilihan operasi bilangan");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.print("Masukkan pilihan operasi :");
        int pilih = cf.nextInt();
            System.out.println("--------------------------------");
        if(pilih == 1){
            System.out.println(bil1+" + "+bil2);
            System.out.println("Hasil penjumlahan kedua bilangan :" + data.penjumlahan());
            System.out.println();
        }
        if(pilih == 2){
            System.out.println(bil1+" - "+bil2);
                    System.out.println("Hasil pengurangan kedua bilangan :" +data.pengurangan());
                    System.out.println();
        }
        if(pilih == 3){
            System.out.println(bil1+" * "+bil2);
                    System.out.println("Hasil perkalian kedua bilangan :" +data.perkalian());
                    System.out.println();
        }
        if (pilih == 4){
            System.out.println(bil1+" / "+bil2);
           System.out.println("Hasil pembagian kedua bilangan :" +data.pembagian()); 
            System.out.println();
        }
            System.out.print("Apakah ingin mengulangi dengan angka yang sama? 1 for YA dan 0 for Tidak :");
            ulangi = cf.nextInt();
            System.out.println();
        }while(ulangi == 1);
            System.out.print("Apakah ingin mengulangi dengan angka yang berbeda? 1 for Ya dan 0 for Tidak :");
            ulangi2 = cf.nextInt();
            System.out.println();
        }while(ulangi2 == 1);
        System.out.println("=============SELESAI==============");
    }
    
}
