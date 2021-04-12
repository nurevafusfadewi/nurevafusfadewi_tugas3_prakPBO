/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3;

import tugaspertemuan3.ruang.Kerucut;
import tugaspertemuan3.ruang.Balok;
import tugaspertemuan3.bidang.Lingkaran;
import tugaspertemuan3.bidang.PersegiPanjang;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        int pilih1= 0;
        int panjang,lebar,tinggi,jari2;
        
        do{
            
            try{
                
                System.out.println("INPUT");
                System.out.print("1. BALOK\n2. KERUCUT\n3. EXIT\nPILIH : ");
                pilih= input.nextInt();
                if(pilih==1){
                    System.out.print("PANJANG : ");panjang=input.nextInt();
                    System.out.print("LEBAR   : ");lebar=input.nextInt();
                    System.out.print("TINGGI  : ");tinggi=input.nextInt();
                
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang,lebar);
                    Balok balok = new Balok(panjang,lebar,tinggi);
                
                    System.out.println("_________OUTPUT_________");
                    System.out.println("LUAS PERSEGI            : "+persegiPanjang.luas());
                    System.out.println("KELILING PERSEGI        : "+persegiPanjang.keliling());
                    System.out.println("VOLUME BALOK            : "+balok.volume());
                    System.out.println("LUAS PERMUKAAN BALOK    : "+balok.luasPermukaan());
                    System.out.println("LUAS PERSEGI 2          : "+balok.luas(panjang,tinggi));
                    System.out.println("LUAS PERSEGI 3          : "+balok.luas(panjang,lebar,tinggi)+"\n");
                }
                else if(pilih==2){
                    System.out.print("JARI-JARI : ");jari2=input.nextInt();
                    System.out.print("TINGGI    : ");tinggi=input.nextInt();
                    
                    Lingkaran lingkaran = new Lingkaran(jari2);
                    Kerucut kerucut = new Kerucut(tinggi,jari2);
                    
                    System.out.println("_______OUTPUT_______");
                    System.out.println("LUAS LINGKARAN        : "+lingkaran.luas());
                    System.out.println("KELILING LINKARAN     : "+lingkaran.keliling());
                    System.out.println("VOLUME KERUCUT        : "+kerucut.volume());
                    System.out.println("LUAS PERMUKAAN KERUCUT: "+kerucut.luasPermukaan()+"\n");
                }
                else if(pilih !=3)
                    System.out.println("Masukkan angka yang tersedia di MENU\n");
            } catch(Exception error){
                    System.out.println("Error : "+error.getMessage()+"\n");
                    String inputText = input.next();
                    pilih = Integer.valueOf(pilih1);
                }
         
        }while(pilih != 3);
    }
    
}
