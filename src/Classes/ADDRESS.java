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
public class ADDRESS {
    
    private int blk;
    private int lt;
    private int houseNumber;

    public ADDRESS(int blk, int lt, int houseNumber) {
        this.blk = blk;
        this.lt = lt;
        this.houseNumber = houseNumber;
    }

    public int getBlk() {
        return blk;
    }

    public void setBlk(int blk) {
        this.blk = blk;
    }

    public int getLt() {
        return lt;
    }

    public void setLt(int lt) {
        this.lt = lt;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    
    
    
}
