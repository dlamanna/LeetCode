/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertdeletesearch_constanttime;

/**
 *
 * @author phuze
 */
public class InsertDeleteSearch_ConstantTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Log log = new Log();
        RandomizedCollection myCollection = new RandomizedCollection();
        log.log("Insert(1): " + myCollection.insert(1));
        log.log("Insert(1): " + myCollection.insert(1));
        log.log("Insert(2): " + myCollection.insert(2));
        log.log("Insert(2): " + myCollection.insert(2));
        log.log("Insert(2): " + myCollection.insert(2));
        log.log("Remove(1): " + myCollection.remove(1));
        log.log("Remove(1): " + myCollection.remove(1));
        log.log("Remove(2): " + myCollection.remove(2));
        log.log("Insert(1): " + myCollection.insert(1));
        log.log("Remove(2): " + myCollection.remove(2));
        log.log("Random: " + myCollection.getRandom());
        log.log("Random: " + myCollection.getRandom());
        log.log("Random: " + myCollection.getRandom());
        log.log("Random: " + myCollection.getRandom());
        log.log("Random: " + myCollection.getRandom());
        log.log("Random: " + myCollection.getRandom());
        log.log("Random: " + myCollection.getRandom());
        log.log("Random: " + myCollection.getRandom());
        log.log("Random: " + myCollection.getRandom());
        log.log("Random: " + myCollection.getRandom());
    }
    
}
