/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanstring;

/**
 *
 * @author dusti
 */
public class RomanString {
    public static int romanToInt(String s) {
        RomanNumeral rn = new RomanNumeral();
        char[] romanString = s.toLowerCase().toCharArray();
        int sum = 0;
        int num1, num2;
        
        for(int i = 0;i<romanString.length;i++) {
            num1 = rn.get(romanString[i]);
            num2 = 0;
            if(i < romanString.length-1)
                num2 = rn.get(romanString[i+1]);
            
            if(num2 > num1) {
                sum += (num2 - num1);
                i++;                                        // jump ahead another place
                System.out.format("+%d - %d\n",num2,num1);
            }
            else {
                sum += num1;
                System.out.format("+%d\n",num1);
            }
        }
        
        return sum;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String romanString = "mcmxciv";
        System.out.println(romanString);
        int sum = romanToInt(romanString);
        System.out.println("Sum: " + sum);
    }
    
}
