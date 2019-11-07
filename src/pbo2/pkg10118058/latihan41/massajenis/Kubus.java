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
class Kubus {
    private int sisi;
    private int massa;

    public Kubus(int sisi, int massa) {
        this.sisi = sisi;
        this.massa = massa;
    }
    
    

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(){
        return (sisi*sisi*sisi);
    
    }
    
    public int hitungMassaJenis(){
        return massa/(sisi*sisi*sisi);
    
    }
    
}
