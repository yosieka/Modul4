/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanAbstract;

/**
 *
 * @author malang
 */
public class abstractSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bangunDatar ob = new bujurSangkar(10);
        System.out.println("Luas bujur sangkar dengan sisi 10 :" + ob.hitungLuas());
        System.out.println("Kelilingnya :" +ob.hitungKeliling());
        System.out.println("\n");
        
        bangunDatar oj = new lingkaran(7);
        System.out.println("Luas Lingkaran dengan jari-jari 7 :" + oj.hitungLuas());
        System.out.println("Kelilingnya :" + oj.hitungKeliling());
        
    }
    
}
