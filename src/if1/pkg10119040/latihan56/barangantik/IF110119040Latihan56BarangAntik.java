/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan56.barangantik;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program ini berisi program menenampilkan umur barang antik
 * dengan metode pendekatan berbasis objek
 */
public class IF110119040Latihan56BarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int umur = 234;
        BarangAntik barangantik  = new BarangAntik(umur);
        Radio radio = new Radio(umur);
        radio.setName("Radio");
        radio.getName();
        barangantik .umur =(234);
        barangantik .tampilumur();
    }
    
}
