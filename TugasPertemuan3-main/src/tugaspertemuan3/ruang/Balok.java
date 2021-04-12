/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3.ruang;

import tugaspertemuan3.bidang.PersegiPanjang;

/**
 *
 * @author hp
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{

    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    
    @Override
    public double volume() {
        return panjang*lebar*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
    }
    
    public double luas(int panjang, int tinggi){
        return panjang*tinggi;
    }
    public double luas(int panjang, int lebar, int tinggi){
        return lebar*tinggi;
    }
    
    
}
