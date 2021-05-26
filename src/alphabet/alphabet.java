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
public class alphabet {
    public static boolean isChar(String s1){
        return  s1.chars().allMatch(Character::isLetter);
        
    }
    
}
