
import java.util.Base64;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TOSHIBA
 */

public class tester {
   
    
     public static void main(String[] args){
         
         String aa = "Hello world!";
         
         
        String enc = PWEncriptDecript.encript(aa);
        System.out.println(enc);
        
        String dec = PWEncriptDecript.decript("MTIzNDU2Nzg=");
        System.out.println(dec);
        
        
                 
     }
    
    
}
