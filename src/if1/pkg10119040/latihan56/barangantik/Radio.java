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
public class Radio extends BarangAntik {
    private String name;

    public Radio(int umur) {
        super(umur);
    }

    public String getName() {
         System.out.println("Nama barang Antik : "+name+" AM");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
