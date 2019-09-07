/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversewords;

/**
 *
 * @author phuzE
 */
public class ReverseWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String message = "cake pound steal";

        String outMsg = reverseWords(message);

        System.out.println(outMsg);
    }
    
    public static String reverseWords(String input) {
        String[] message = input.split(" ");
        String output = "";
        for(int i = message.length-1;i>=0;i--) {
            output = output + message[i];
            if(i >= 0)
                output += " ";
        }
        return output;
    }
    
}
