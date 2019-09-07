/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseint;

/**
 *
 * @author phuze
 */
public class ReverseInt {

    public static int reverse(int x) {
        if(x > Integer.MAX_VALUE)
            return 0;
        
        int retVal = 0;
        char[] intString = ("" + x).toCharArray();
        char[] newString = new char[intString.length];
        int y = intString[0] == '-' ? 1 : 0;
        if(y == 1)
            newString[0] = '-';
        
        int tempInt = y;                                    // have to make this since we're  incrementing y
        
        for(int i = intString.length-1; i>=tempInt;i--) {
            newString[y] = intString[i];
            y++;
        }
        try {
            retVal = Integer.parseInt(new String(newString));
        }
        catch (NumberFormatException e) {}
        return retVal;
    }  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int test1 = 321;
        int test2 = -123;
        int test3 = 120;
        //int test4 = 9646324351;
        System.out.println(test1 + " : " + reverse(test1));
        System.out.println(test2 + " : " + reverse(test2));
        System.out.println(test3 + " : " + reverse(test3));
    }
    
}
