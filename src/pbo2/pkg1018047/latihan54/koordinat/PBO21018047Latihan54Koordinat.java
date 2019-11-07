/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg1018047.latihan54.koordinat;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class PBO21018047Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat warna = new WarnaKoordinat("jingga",10,4);
        System.out.println("Warna Koordinat : "+warna.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+warna.getX()+", y : "+warna.getY());
    }
    
}
