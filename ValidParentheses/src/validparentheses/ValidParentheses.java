/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validparentheses;

import java.util.*;

/**
 * @leetcode 20
 * @author phuzE
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        char[] array = s.toCharArray();
        Stack charQ = new Stack();
        ParenTypes p = new ParenTypes();
        char c;
        boolean retBool = false;
        
        for(int i = 0;i<s.length();i++) {
            if(array[i] == ')' || array[i] == ']' || array[i] == '}') {
                Object o = p.paren.get(array[i]); // get the corresponding opening parentheses
                if(o == null)
                    System.out.println("o == null");
                else {
                    c = (char)o;
                    System.out.println("Comparing: " + c);
                    if(c == (char)charQ.peek()) {
                        System.out.println("Popping: " + c);
                        charQ.pop();
                    }
                    else {
                        System.out.println("\t### Returning false on: " + array[i]);
                        return false;
                    }
                }
            }
            else {
                System.out.println("Pushing: " + array[i]);
                charQ.push(array[i]);
            }
        }
        System.out.println("\tOut of for loop");
        if(charQ.isEmpty())
            retBool = true;
        
        return retBool;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String test1 = "()";        //true
        String test2 = "(){}[]";    //true
        String test3 = "(]";        //false
        String test4 = "([)]";      //false
        String test5 = "{[]}";      //true
        boolean testVal = isValid(test5);
        System.out.println("Valid: " + testVal);
    }
    
}
