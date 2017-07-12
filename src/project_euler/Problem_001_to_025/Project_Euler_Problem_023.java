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
 * Title      : Problem 23: Non-abundant sums
 * URL        : https://projecteuler.net/problem=23
 * 
 * Description: A perfect number is a number for which the sum of its proper
 *              divisors is exactly equal to the number. For example, the sum of
 *              the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28,
 *              which means that 28 is a perfect number.
 * 
 *              A number n is called deficient if the sum of its proper divisors
 *              is less than n and it is called abundant if this sum exceeds n.
 * 
 *              As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, 
 *              the smallest number that can be written as the sum of two 
 *              abundant numbers is 24. By mathematical analysis, it can be 
 *              shown that all integers greater than 28123 can be written as the
 *              sum of two abundant numbers. However, this upper limit cannot be
 *              reduced any further by analysis even though it is known that the
 *              greatest number that cannot be expressed as the sum of two
 *              abundant numbers is less than this limit.
 * 
 *              Find the sum of all the positive integers which cannot be
 *              written as the sum of two abundant numbers.
 */
public class Project_Euler_Problem_023 {
    
    public static long findAnswer() {

        Set<Integer> lsAbundantNumbers = new HashSet<>();
        for (int i = 1; i<=28123; i++) {
            if (fIsAbundantNumber(i)) {
                lsAbundantNumbers.add(i);            
            }
        }

        Set<Integer> lsSumAbundantNumbers = new HashSet<>();
        for (Integer n1 : lsAbundantNumbers) {
            for (Integer n2 : lsAbundantNumbers) {
                lsSumAbundantNumbers.add(n1 + n2);
            }
        }

        long lSum = 0;
        for (int i=1; i<=28123; i++) {
            if (!lsSumAbundantNumbers.contains(i)) {
                lSum += i;
            }
        }

        return (lSum);
    }

    public static long lSumProperDivisors(int x) {
        long lSum = 0;
        
        int i = 1;
        while (i * i <= x) {
            if (x % i == 0) {
                lSum += i;
                if (i > 1 && i * i != x) {
                    lSum += (x / i);
                }
            }
            i++;
        }        
        
        return lSum;
    }

    public static boolean fIsAbundantNumber(int x) {
        return lSumProperDivisors(x) > x;
    }

}
