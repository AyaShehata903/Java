/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2_2;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 *
 * @author Home
 */
public class StringUtils {
    
    public static String betterString (String s1, String s2, BiPredicate<String, String> p){
        if (p.test(s1,s2)){ return s1;}
        else {return s2;}
    }
    
    public static boolean checkLetter (String s, Predicate<Character> p){
        
        for (int i = 0; i<s.length();i++){
        char c = s.charAt(i);
        if(!p.test(c)){return false;}
        }
        return true;
    }
}
