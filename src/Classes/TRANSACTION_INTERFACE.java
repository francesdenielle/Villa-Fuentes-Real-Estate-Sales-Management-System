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
public interface TRANSACTION_INTERFACE {
    
    public static ArrayList<TRANSACTION> TRANSACTION_ARRAYLIST() throws IOException{
        
        ArrayList<TRANSACTION> transactions = new ArrayList<TRANSACTION>();
        
        TRANSACTION transaction =null;
        
        String path = "src\\csv\\CLIENTS.csv";
        
        BufferedReader reader = null;
        
        String line = "";
        
        try{
            
            reader = new BufferedReader(new FileReader(path));
            
            while((line = reader.readLine()) != null){
                
                String row[] = line.split(",");
                
                transaction = new TRANSACTION(
                        
                                new BUYER(
                                        row[0],row[1],row[2]
                                ),
                                Double.parseDouble(row[3]),Integer.parseInt(row[4]),row[5],row[6]
                
                                );
                
                transactions.add(transaction);
            }
            
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        reader.close();
        
        return transactions;
    }
}
