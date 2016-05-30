/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler.Problem_001_to_025;

import java.util.*;

/**
 *
 * @author bpolus
 * 
 * Title      : Problem 4: Largest palindrome product
 * 
 * Description: A palindromic number reads the same both ways. The largest
 *              palindrome made from the product of two 2-digit numbers is 
 *              9009 = 91 × 99.
 * 
 *              Find the largest palindrome made from the product of two 
 *              3-digit numbers.
 */
public class Project_Euler_Problem_004 {

    public static long findMaxPalindrome3Digits() {

        int iReturn = -1;
        
        for (int i=100; i<=999; i++) {
            for (int j=100; j<=999; j++) {
                boolean fIsPalindrome = true;
                int iProd = i*j;
                String sProd = "" + iProd;
                for (int k=0; k<sProd.length(); k++) {
                    if (!sProd.substring(k, k+1).equals(sProd.substring(sProd.length() - 1 - k, sProd.length() - k))) {
                        fIsPalindrome = false;
                        break;
                    }
                }
                if (fIsPalindrome && iProd > iReturn) {
                    iReturn = iProd;
                }
            }
        }
                
        return iReturn;
    }
    
}
