/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler.Problem_051_to_075;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author bpolus
 * 
 * Title      : Problem 65: Convergents of e
 * URL        : https://projecteuler.net/problem=65
 * 
 * Description: The square root of 2 can be written as an infinite continued
 *              fraction.
 * 
 *              √2 = 1 +          1
 *                       2 +	    1
 *                           2 +      1
 *                               2 +    1
 *                                   2 + ...
 * 
 *              The infinite continued fraction can be written, 
 *              √2 = [1;(2)], (2) indicates that 2 repeats ad infinitum. 
 *              In a similar way, √23 = [4;(1,3,1,8)].
 * 
 *              It turns out that the sequence of partial values of continued
 *              fractions for square roots provide the best rational
 *              approximations. Let us consider the convergents for √2.
 * 
 *              1 + 1 = 3/2
 *                  2
 * 
 *              1 +   1    = 7/5
 *                  2 + 1
 *                      2
 *               
 *              1 +     1      = 17/12
 *                  2 +   1
 *                      2 + 1
 *                          2
 * 
 *              1 +       1        = 41/29
 *                  2 +     1
 *                      2 +   1
 *                          2 + 1
 *                              2
 * 
 *              Hence the sequence of the first ten convergents for √2 are:
 *              1, 3/2, 7/5, 17/12, 41/29, 99/70, 239/169, 577/408, 1393/985, 
 *              3363/2378, ...
 * 
 *              What is most surprising is that the important mathematical
 *              constant,
 *              e = [2; 1,2,1, 1,4,1, 1,6,1 , ... , 1,2k,1, ...].
 * 
 *              The first ten terms in the sequence of convergents for e are:
 *              2, 3, 8/3, 11/4, 19/7, 87/32, 106/39, 193/71, 1264/465, 
 *              1457/536, ...
 * 
 *              The sum of digits in the numerator of the 10th convergent is
 *              1+4+5+7=17.
 * 
 *              Find the sum of digits in the numerator of the 100th convergent
 *              of the continued fraction for e.
 */
public class Project_Euler_Problem_065 {

    public static int findSumDigits() {

        int[] lReturn = {2, 1, 2, 1,
                            1, 4, 1,
                            1, 6, 1,
                            1, 8, 1,
                            1, 10, 1,
                            1, 12, 1,
                            1, 14, 1,
                            1, 16, 1,
                            1, 18, 1,
                            1, 20, 1,
                            1, 22, 1,
                            1, 24, 1,
                            1, 26, 1,
                            1, 28, 1,
                            1, 30, 1,
                            1, 32, 1,
                            1, 34, 1,
                            1, 36, 1,
                            1, 38, 1,
                            1, 40, 1,
                            1, 42, 1,
                            1, 44, 1,
                            1, 46, 1,
                            1, 48, 1,
                            1, 50, 1,
                            1, 52, 1,
                            1, 54, 1,
                            1, 56, 1,
                            1, 58, 1,
                            1, 60, 1,
                            1, 62, 1,
                            1, 64, 1,
                            1, 66, 1
        };
        BigInteger[] lFraction = findFraction(lReturn);

        System.out.println("" + lFraction[0] + " / " + lFraction[1]);     
        
        String sNumerator = lFraction[0].toString();
        int lSumDigits = 0;
        for (int i=0; i<sNumerator.length(); i++) {
            lSumDigits += Integer.parseInt(sNumerator.substring(i, i+1));
        }
            
        return lSumDigits;
    }
    
    public static BigInteger[] findFraction(int[] args) {
        BigInteger[] lReturn = {BigInteger.ZERO, BigInteger.ZERO};
        
        if (args.length == 1) {
            lReturn[0] = new BigInteger("" + args[0]);
            lReturn[1] = BigInteger.ONE;
            return lReturn;
        }
        
        int[] lArgsN1 = new int[args.length - 1];
        for (int i=1; i<args.length; i++) lArgsN1[i-1] = args[i];
        BigInteger[] lFractionN1 = findFraction(lArgsN1);

        lReturn[0] = lFractionN1[0].multiply(new BigInteger("" + args[0]))
                                   .add(lFractionN1[1]);
        lReturn[1] = lFractionN1[0];
        
        return lReturn;
        
    }
}
