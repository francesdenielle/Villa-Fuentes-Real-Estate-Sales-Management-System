/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @authors
 * Ang, Kimberly Gale Y.
 * Caberto, Drizzle Joy V.
 * Doydoy, John Darryl A.
 * Magno, Frances Denielle C.
 * Tiongco, Annika Bianca A.
 */
public interface ESTATE_INTERFACE {
    
    
    public static ArrayList<ESTATE> ESTATE_ARRAYLIST() throws IOException{
        
        // initialize ArrayList for Estate 
        ArrayList<ESTATE> estates = new ArrayList<ESTATE>();
        
        ESTATE estate; 
        
        String file = "src\\csv\\estates.csv";
        
        BufferedReader reader = null;
         
        String line = "";
        
        try{
            
            reader = new BufferedReader(new FileReader(file));
            
           
            while((line= reader.readLine()) != null){   
                 String[] row = line.split(",");
                
                estate = new ESTATE(Integer.parseInt(row[0]),
                         new SPECIFICATION( new ADDRESS(Integer.parseInt(row[1]),
                                 Integer.parseInt(row[2]),
                                 Integer.parseInt(row[3])),
                                 Integer.parseInt(row[4]),
                                 Integer.parseInt(row[5]),
                                 Integer.parseInt(row[6])
                                  ), 
                                Double.parseDouble(row[7]), row[8]
                
                           );
                
                estates.add(estate);           
            }
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        reader.close();
        
        return estates;
        
    }
}
