/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanstring;
import java.util.*;

/**
 *
 * @author dusti
 */
public class RomanNumeral {
    private HashMap<Character,Integer> numeralTable;
    
    RomanNumeral() {
        numeralTable = new HashMap<Character,Integer>();
        numeralTable.put('m',1000);
        numeralTable.put('d',500);
        numeralTable.put('c',100);
        numeralTable.put('l',50);
        numeralTable.put('x',10);
        numeralTable.put('v',5);
        numeralTable.put('i',1);
    }
    
    public int get(char roman) {
        return numeralTable.get(roman);
    }
}
