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
public class ESTATE {
    
    private int id;
    private SPECIFICATION specs;
    private double price;
    private String status; 

    public ESTATE(int id, SPECIFICATION specs, double price, String status) {
        this.id = id;
        this.specs = specs;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SPECIFICATION getSpecs() {
        return specs;
    }

    public void setSpecs(SPECIFICATION specs) {
        this.specs = specs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
