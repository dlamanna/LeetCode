package insertdeletesearch_constanttime;

import java.util.*;

public class RandomizedCollection {
    private HashMap<Integer,Integer> myCollection;
    private ArrayList<Integer> arrList;
    private final boolean showContentsAfterOperation = true;
    
    /** Initialize your data structure here. */
    public RandomizedCollection() {
         myCollection = new HashMap<Integer,Integer>();
         arrList = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        boolean retVal = false;
        if(myCollection.get(val) == null) 
            retVal = true;

        int size = arrList.size();
        arrList.add(val);
        myCollection.put(val,size);
        
        if(showContentsAfterOperation)
            printContents();
        
        return retVal;  
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        Integer index = myCollection.get(val);
        if(index != null && !arrList.isEmpty()) {
            myCollection.remove(val);
            int size = arrList.size();
            Integer last = arrList.get(0);               
            
            if(size > 1) {
                try {
                    last = arrList.get(size-1);
                    Collections.swap(arrList,index,size-1);
                    arrList.remove(size-1);
                }
                catch (IndexOutOfBoundsException error) {
                    System.out.println("### " + error);
                }
            }
            else {
                arrList.remove(0);
            }
                
            myCollection.put(last,index);
            if(showContentsAfterOperation)
                printContents();
            return true;
        }
        else {
            if(showContentsAfterOperation)
                printContents();
            return false;
        }
    }
    
    public void printContents() {
        System.out.print("[");
        for(int i = 0;i<arrList.size()-1;i++) {
            System.out.print(arrList.get(i) + ",");
        }
        System.out.print(arrList.get(arrList.size()-1) + "]\n");
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        if(!arrList.isEmpty()) {
            Random rand = new Random();
            int n = rand.nextInt(arrList.size());

            return arrList.get(n);
        }
        else
            return -1;
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */