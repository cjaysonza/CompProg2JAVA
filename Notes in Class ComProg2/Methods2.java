/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sonzamarch7;

/**
 *
 * @author csonza
 */
import javax.swing.*;

public class SonzaMarch7 {

    public static void main(String[] args) {
//        String name = "jOHN mARKUSMINson alVIOLa GUIDonianA";
        String name2 = "jOHn lESTer-cRUz";
//        System.out.println(toProperCase(name));
        System.out.println(ToProperCase(name2));
        System.out.println("");
    }

    private static String toProperCase(String name) {
        String proper = "";
        int endIndex = 0;
        
        if (name.contains(" ")) {
            proper = name.substring(endIndex, endIndex + 1).toUpperCase().concat(name.substring(endIndex + 1, name.indexOf(" ")).toLowerCase());
            endIndex = name.indexOf(" ");
            proper += " " + toProperCase(name.substring(endIndex + 1));
        } else {
            proper = name.substring(endIndex, endIndex + 1).toUpperCase().concat(name.substring(endIndex + 1).toLowerCase());
        }
      return proper;
//
//        String proper = "";
//        if (name.contains(" ")) {
//            proper += toProperCase(name.substring(name.indexOf(" ") + 1));
//        } else {
//            return name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
//        }
//        return proper;
//        // return name.substring(0, 1).concat(name.substring(1).toLowerCase());
    }

//    
//    private static int divide (int x) {
//        return x > 0 ? divide( x / 2) : 
//    }
    
    
    /// Slighty Better version
    
    private static String ToProperCase(String name) {
        
        if(name.contains(" ")) {
            return ToProperCase(name.substring(0, name.indexOf(" "))) + " " + ToProperCase(name.substring(name.indexOf(" ") + 1));
        } else if (name.contains("-")){ 
            return ToProperCase(name.substring(0, name.indexOf("-"))) + "-" + ToProperCase(name.substring(name.indexOf("-") + 1));
        } else {
            return name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
        }
    }
    
    
    private static String isAlphabetical(String word) {
        if (word.length() > 1) {
            return isAlphabetical(word.substring(1));
        } else {
            return Character.isLetter(word.charAt(0)) ? "Is Alphabetical" : "Is not Alphabetical";
        }
    }
    
}
