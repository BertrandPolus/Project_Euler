/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler.Problem_1_to_25;

/**
 *
 * @author bpolus
 * 
 * Description: Each new term in the Fibonacci sequence is generated by adding
 *              the previous two terms. By starting with 1 and 2, the first 10
 *              terms will be:
 * 
 *                      1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 *              By considering the terms in the Fibonacci sequence whose values
 *              do not exceed four million, find the sum of the even-valued
 *              terms.
 */
public class Project_Euler_Problem_2 {

    public static long findSum() {

        long lSum = 2;
        long lFib2 = 1;
        long lFib1 = 2;

        while (lFib1 < 4000000) {
            long lFib = lFib1 + lFib2;
            if (lFib % 2 == 0 && lFib < 4000000) {
                lSum += lFib;
            }

            lFib2 = lFib1;
            lFib1 = lFib;

        }

        return lSum;
    }
    
}
