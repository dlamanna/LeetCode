/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validparentheses;

import java.util.*;

/**
 *
 * @author phuzE
 */
public class ParenTypes {
    public HashMap<Character,Character> paren;
    ParenTypes() {
        paren = new HashMap<>();
        paren.put(')','(');
        paren.put('}','{');
        paren.put(']','[');
    }
    ParenTypes(char char1, char char2) {
        paren.put(char1,char2);
    }
}
