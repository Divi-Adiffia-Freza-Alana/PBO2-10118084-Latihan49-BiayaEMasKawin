/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg1011084.latihan49.biayaemaskawin;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan biaya emas kawin

 */
public class PBO21011084Latihan49BiayaEMasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas emas = new Emas();
        emas.setJumlah(15.7);
        emas.setHarga(570000);
        System.out.println("Harga Emas Per gram :"+emas.getHarga());
        System.out.println("Jumlah total yang dibutuhkan :"+emas.getJumlah());
        System.out.println("Harga Total :"+emas.totalharga(emas.getHarga(),emas.getJumlah()));
    }
    
}
