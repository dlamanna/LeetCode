/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromenumber;

/**
 * @author phuzE
 * @leetcode 9
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int len = str.length();
        char[] backChar = new char[len];
        for(int i = len-1;i>=0;i--) {
            backChar[i] = str.charAt(len-(i+1));
        }
        String backStr = new String(backChar);
        //System.out.println("" + str + " /// " + backStr);
        return str.equals(backStr);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
    
}
