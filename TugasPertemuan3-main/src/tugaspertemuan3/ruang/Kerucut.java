/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3.ruang;

import tugaspertemuan3.bidang.Lingkaran;

/**
 *
 * @author hp
 */
public class Kerucut extends Lingkaran implements MenghitungRuang{
    int tinggi;

    public Kerucut(int tinggi, int jari2) {
        super(jari2);
        this.tinggi = tinggi;
    }
    
    

    @Override
    public double volume() {
        return Math.PI*jari2*jari2*tinggi/3;
    }

    @Override
    public double luasPermukaan() {
        float selimut;
        selimut=(float) Math.sqrt(jari2*jari2+tinggi*tinggi);
        return Math.PI*jari2*selimut;
        
    }
    
    
}
