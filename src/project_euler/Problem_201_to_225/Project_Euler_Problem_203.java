/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler.Problem_201_to_225;

import java.math.*;
import java.util.*;

/**
 *
 * @author bpolus
 * 
 * Title      : Problem 203: Squarefree Binomial Coefficients
 * URL        : https://projecteuler.net/problem=203
 * 
 * Description: The binomial coefficients nCk can be arranged in triangular
 *              form, Pascal's triangle, like this:
 *                                  1
 *                                1   1
 *                              1   2   1
 *                            1   3   3   1
 *                          1   4   6   4   1
 *                        1   5   10  10  5   1
 *                      1   6   15  20  15  6   1
 *                    1   7   21  35  35  21  7   1
 *                              .........
 * 
 *              It can be seen that the first eight rows of Pascal's triangle 
 *              contain twelve distinct numbers: 
 *              1, 2, 3, 4, 5, 6, 7, 10, 15, 20, 21 and 35.
 * 
 *              A positive integer n is called squarefree if no square of a 
 *              prime divides n. Of the twelve distinct numbers in the first 
 *              eight rows of Pascal's triangle, all except 4 and 20 are 
 *              squarefree. The sum of the distinct squarefree numbers in the 
 *              first eight rows is 105.
 * 
 *              Find the sum of the distinct squarefree numbers in the first 51 
 *              rows of Pascal's triangle.
 */
public class Project_Euler_Problem_203 {
    
    public static long findAnswer() {

        List<BigInteger> lsRowsPascal = new ArrayList<>();
        BigInteger[] iPascal = {BigInteger.ONE};
        lsRowsPascal.add(BigInteger.ONE);
        System.out.println(Arrays.toString(iPascal));
        
        while (iPascal.length < 100) {
            BigInteger[] iPascalNew = new BigInteger[iPascal.length + 1];
            iPascalNew[0] = BigInteger.ONE;
            iPascalNew[iPascalNew.length - 1] = BigInteger.ONE;
            for (int i=1; i<iPascalNew.length - 1; i++) {
                iPascalNew[i] = iPascal[i-1].add(iPascal[i]);
                if (!lsRowsPascal.contains(iPascalNew[i])) {
                    lsRowsPascal.add(iPascalNew[i]);
                }
            }
            iPascal = iPascalNew;
            System.out.println(Arrays.toString(iPascal));            
        }
    
        return 0;
    }

}
