/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3.bidang;

/**
 *
 * @author hp
 */
public class Lingkaran implements MenghitungBidang{

    public int jari2;

    public Lingkaran(int jari2) {
        this.jari2 = jari2;
    }

    @Override
    public double luas() {
        return Math.PI*jari2*jari2;        
     }

    @Override
    public double keliling() {
        return Math.PI*2*jari2;
    }
    
}
