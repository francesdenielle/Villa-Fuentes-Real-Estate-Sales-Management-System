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
public class TRANSACTION {
    
    
    private BUYER buyer;
    
    private double cost;
    private int estateID;
    private String standing; 
    private String date;
    
    public TRANSACTION(BUYER buyer, double cost, int estateID, String standing,String date) {
        this.buyer = buyer;
        this.cost = cost;
        this.estateID = estateID;
        this.standing = standing;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
  
    
    public BUYER getBuyer() {
        return buyer;
    }

    public void setBuyer(BUYER buyer) {
        this.buyer = buyer;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getEstateID() {
        return estateID;
    }

    public void setEstateID(int estateID) {
        this.estateID = estateID;
    }

    public String getStanding() {
        return standing;
    }

    public void setStanding(String standing) {
        this.standing = standing;
    }
    
    
    
}
