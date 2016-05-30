/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler.Problem_001_to_025;

/**
 *
 * @author bpolus
 * 
 * Title      : Problem 5: Smallest multiple
 * URL        : https://projecteuler.net/problem=5
 * 
 * Description: 2520 is the smallest number that can be divided by each of the 
 *              numbers from 1 to 10 without any remainder.
 * 
 *              What is the smallest positive number that is evenly divisible by
 *              all of the numbers from 1 to 20?
 */
public class Project_Euler_Problem_005 {

    public static long returnAnswer() {

        return 232792560;
        
        // Done by hand
        
        // 1	1
        // 2	  2
        // 3	          3
        // 4	  2 2
        // 5	              5
        // 6	  2       3
        // 7	                7
        // 8	  2 2 2
        // 9	          3 3
        // 10	  2           5
        // 11	                  11
        // 12	  2 2     3
        // 13	                     13
        // 14	  2             7
        // 15	          3   5
        // 16	  2 2 2 2
        // 17	                        17
        // 18	  2       3 3
        // 19	                           19
        // 20	  2 2         5
        // 
        // Prod 1 2 2 2 2 3 3 5 7 11 13 17 19 = 232792560

    }
    
}
