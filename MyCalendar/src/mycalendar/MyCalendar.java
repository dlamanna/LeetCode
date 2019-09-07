/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalendar;
import java.util.*;

/**
 * @author phuze
 * @leetcode 729
 */
public class MyCalendar {
    private HashMap<Integer,Integer> calendar;
    
    /**
     * @param args the command line arguments
     */
    public MyCalendar() {
        calendar = new HashMap<Integer,Integer>();
    }
    
    public boolean book(int start, int end) {
        for(Map.Entry<Integer,Integer> entry : calendar.entrySet()) {
            if(end <= entry.getKey())
                continue;
            else if (start >= entry.getValue())
                continue;
            else
                return false;
        }
        calendar.put(start, end);
        return true;
    }
    
    public static void main(String[] args) {
        MyCalendar cal = new MyCalendar();
        System.out.println(cal.book(47,50));
        System.out.println(cal.book(33,41));
        System.out.println(cal.book(39,45));      
        System.out.println(cal.book(33,42));
        System.out.println(cal.book(25,32));
        System.out.println(cal.book(26,35));
        System.out.println(cal.book(19,25));
        System.out.println(cal.book(3,8));
        System.out.println(cal.book(8,13));
        System.out.println(cal.book(18,27));
    }
    
}
