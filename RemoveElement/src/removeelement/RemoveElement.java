/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeelement;

/**
 *
 * @author phuzE
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int startLength = nums.length;
        int j = 0;
        int i = 0;
        for(i = 0;i<startLength;i++) {
            if(nums[i] != val) {
                //nums[i] = -1;
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int test1[] = {3,2,2,3};
        int test2[] = {0,1,2,2,3,0,4,2};
        int ret1 = removeElement(test1,3);
        int ret2 = removeElement(test2,2);
        System.out.println("New Length (test1): " + ret1);
        System.out.println("New Length (test2): " + ret2);
    }
    
}
