/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

/**
 * @author phuzE
 * Reverse a string in-place
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String input1 = "dustin";
        String input1 = "wooffwoof";
        char[] string1 = input1.toCharArray();
        //char[] string2 = input2.toCharArray();
        
        int z = string1.length-1;
        for(int i = 0;i<z;i++) {
            char temp = string1[i];
            string1[i] = string1[z];
            string1[z] = temp;
            z--;
        }
        
        System.out.println(string1);
    }
    
}
