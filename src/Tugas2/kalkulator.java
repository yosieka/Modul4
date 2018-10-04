
package Tugas2;

public class kalkulator implements operasi {
    private double bil1;
    private double bil2;

    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }
    
    

    @Override
    public double penjumlahan() {
        return bil1+bil2;
    }

    @Override
    public double pengurangan() {
        return bil1-bil2;
    }

    @Override
    public double perkalian() {
        return bil1*bil2;
    }

    @Override
    public double pembagian() {
        return bil1/bil2;
    }
    
}
