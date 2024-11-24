/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TOSHIBA
 */
import java.util.Base64;

public class PWEncriptDecript {
    
     public static void main(String[] args){  
     }
     
     public static String encript (String Password){
                  
         
         byte[] encript = Base64.getEncoder().encode(Password.getBytes());
         String encripted =  new String(encript);
         return (encripted);
         

     }
     
     
     public static String decript(String encripted){
     
         byte[] decript = Base64.getDecoder().decode(encripted);
         String decripted = new String(decript);
         return (decripted);
     
     }
    
}
