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
public class PersegiPanjang implements MenghitungBidang{

    public int panjang;
    public int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
    @Override
    public double luas() {
        return panjang*lebar;    
    }

    @Override
    public double keliling() {
        return 2*panjang+2*lebar;
    }
}
