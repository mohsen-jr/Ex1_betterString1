/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabet;

/**
 *
 * @author mahmoud_mohsen
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String s1 = "mahmoud";
         String s2 = "mahmoud1111";
        boolean aChar = alphabet.isChar(s1);
        if(aChar)
            System.out.println("string contains only alphabets");
        else
            System.out.println("string does not contain only alphabets");
        boolean bChar = alphabet.isChar(s2);
        if(bChar)
            System.out.println("string contains only alphabets");
        else
            System.out.println("string does not contain only alphabets");
    }
    
}
