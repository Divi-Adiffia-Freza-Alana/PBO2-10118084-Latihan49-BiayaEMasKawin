/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg1011084.latihan49.biayaemaskawin;

/**
 *
 * @author Freza
 */
public class Emas {
    private double harga;
    private double jumlah;

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
    public double totalharga(double harga,double jumlah){
        return jumlah*harga;
    }
    
}
