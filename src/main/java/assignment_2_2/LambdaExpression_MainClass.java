/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2_2;

import assignment_2_2.StringUtils;
import java.util.function.BiPredicate;

/**
 *
 * @author Home
 */
public class LambdaExpression_MainClass {
    
        public static void main(String[] args){
            
            //Task 1 Lambda Expression
            String string1 = "Aya1";
            String string2 = "Tarek";
            //Test case 1
            String longer = StringUtils.betterString(string1, string2, (s1,s2) -> s1.length() > s2.length());
            System.out.println(longer);
            //Test case 2
            String first = StringUtils.betterString(string1, string2, (s1,s2) -> true);
            System.out.println(first);
            
            //Task 2 Lambda Expression
            // Test case 1
            String string3 = "Aya";
            boolean stringLetter1 = StringUtils.checkLetter(string3,(c) -> Character.isLetter(c));
            if(stringLetter1){System.out.println("String Contains only Alphabets");}
            else {System.out.println("String Contains not only Alphabets");}
            
            //Test case 2 
            String string4 = "Aya1";
            boolean stringLetter2 = StringUtils.checkLetter(string4,(c) -> Character.isLetter(c));
            if(stringLetter2){System.out.println("String Contains only Alphabets");}
            else {System.out.println("String Contains not only Alphabets");}
            
        }
        
}
