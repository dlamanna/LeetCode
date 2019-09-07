/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertdeletesearch_constanttime;

import java.util.ArrayList;

/**
 *
 * @author phuze
 */
public class Log {
    ArrayList<String> logList;
    Log() {
       logList = new ArrayList<String>();
    }
    
    public void log(String logLine) {
        logList.add(logLine);
        System.out.println(logLine);
    }
    
    public void log(boolean bool) {
        String boolString = bool ? "true" : "false";
        logList.add(boolString);
        System.out.println(boolString);
    }
    
    public void log(int logLine) {
        logList.add("Random: " + logLine);
        System.out.println("Random: " + logLine);
    }
}
