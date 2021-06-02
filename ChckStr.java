/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkstring;

/**
 *
 * @author mousa
 */
public class ChckStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s;
        s="hphp";
        
       
        
        boolean a =s.chars().allMatch(Character::isLetter);
        System.out.println(a);
        // TODO code application logic here
    }
    
}
