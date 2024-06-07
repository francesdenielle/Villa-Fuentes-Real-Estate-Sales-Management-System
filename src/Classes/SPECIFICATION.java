/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @authors
 * Ang, Kimberly Gale Y.
 * Caberto, Drizzle Joy V.
 * Doydoy, John Darryl A.
 * Magno, Frances Denielle C.
 * Tiongco, Annika Bianca A.
 */
public class SPECIFICATION {
    
    private ADDRESS address;
    private int lotSize;
    private int br;
    private int storey;

    public SPECIFICATION(ADDRESS address, int lotSize, int br, int storey) {
        this.address = address;
        this.lotSize = lotSize;
        this.br = br;
        this.storey = storey;
    }
    
    

    public ADDRESS getAddress() {
        return address;
    }

    public void setAddress(ADDRESS address) {
        this.address = address;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public int getBr() {
        return br;
    }

    public void setBr(int br) {
        this.br = br;
    }

    public int getStorey() {
        return storey;
    }

    public void setStorey(int storey) {
        this.storey = storey;
    }
    
    
}
