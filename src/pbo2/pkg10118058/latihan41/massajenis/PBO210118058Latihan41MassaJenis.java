/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan41.massajenis;

/**
 *
 * @author user
 */
public class PBO210118058Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     * Nama:Satyaning Andaru bawalaksana
     * Nim: 10118058
     * kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus=new Kubus(5,250);
        
        System.out.println("======Massa Jenis Kubus======");
      
        
        System.out.println("sisi : " +kubus.getSisi() );
        System.out.println(" Massa : " +kubus.getMassa());
        
        
        System.out.println();
        System.out.println("======Hasil Perhitungan=====");
        System.out.println("Volume : " +kubus.hitungVolume());
        System.out.println("Massa Jenis : " +kubus.hitungMassaJenis());
    }
    
}
