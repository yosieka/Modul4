/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanInterface;

/**
 *
 * @author malang
 */
public class InterfaceSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        InterfaceBujurSangkar ob = new InterfaceBujurSangkar(10){};
        System.out.println("Luas bujur sangkar dengan sisi 10 :" +ob.hitungLuas());
        System.out.println("Kelilingnya :" + ob.hitungKeliling());
        System.out.println("\n");
        
        InterfaceBangunDatar oj = new InterfaceSegitiga(6, 8){};
        System.out.println("Luas Segitiga dengan alas 6, dan tinggi 8 :" + oj.hitungLuas());
        System.out.println("Kelilingnya :" + oj.hitungKeliling());
    }
    
}
