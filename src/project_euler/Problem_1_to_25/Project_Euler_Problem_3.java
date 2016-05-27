/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler.Problem_1_to_25;

import java.util.*;

/**
 *
 * @author bpolus
 * 
 * Title      : Problem 3: Largest prime factor
 * 
 * Description: The prime factors of 13195 are 5, 7, 13 and 29.
 *              What is the largest prime factor of the number 600851475143 ?
 */
public class Project_Euler_Problem_3 {

    public static long returnMaxPrimeDividor(long lNumber) {

        long lReturn = lNumber;
        long lCurrentIdx = 2;
        
        while(lCurrentIdx <= Math.sqrt(lReturn)) {
            while (lReturn % lCurrentIdx == 0 && lReturn != lCurrentIdx) {
                lReturn /= lCurrentIdx; 
            }
            lCurrentIdx++;
        }
        
        return lReturn;
    }
    
}
