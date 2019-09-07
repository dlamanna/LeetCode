/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watchmovies;
import java.util.*;

/**
 *
 * @author phuzE
 * Write a function that takes an integer flightLength (in minutes) and a vector
 * of integers movieLengths (in minutes) and returns a boolean indicating
 * whether there are two numbers in movieLengths whose sum equals flightLength. 
 */
public class WatchMovies {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int flightLength = 130;
        Vector movieList = new Vector();
        movieList.add(59);
        movieList.add(61);
        movieList.add(44);
        movieList.add(56);
        movieList.add(129);
        movieList.add(1);
        
        String outString = recommend(flightLength,movieList) ? "There are 2 movies that fit perfectly!" : 
                                                                "There are not 2 movies of correct lengths, u lose";
        
        System.out.println(outString);
        
    }
    
    public static boolean recommend(int duration, Vector movieList) {
        for(int x = 0; x < movieList.size();x++) {
            for(int y = 0;y < movieList.size();y++) {
                if(x != y) {
                    if((int)movieList.get(x) + (int)movieList.get(y) == duration)
                        return true;
                }
            }
        }
        return false;
    } 
    
}
