/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestsubstring;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author phuze
 */
public class LongestSubstring {

    public static String longestSubstring(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String longestString = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);
            }
            if (longestString.length() < end - start + 1) {
                longestString = input.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
        return longestString;
    }
    
    public static void printResults(String input, int expected) {
        System.out.println("Longest Substring: " + input + ",\tLength: " + 
                            input.length() + "_" + expected);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";
        String test4 = " ";
        String test5 = "aab";
        String test6 = "dvdf";
        
        String solString1 = longestSubstring(test1);
        String solString2 = longestSubstring(test2);
        String solString3 = longestSubstring(test3);
        String solString4 = longestSubstring(test4);
        String solString5 = longestSubstring(test5);
        String solString6 = longestSubstring(test6);
        
        printResults(solString1,3);
        printResults(solString2,1);
        printResults(solString3,3);
        printResults(solString4,1);
        printResults(solString5,2);
        printResults(solString6,3);
    }
    
}
