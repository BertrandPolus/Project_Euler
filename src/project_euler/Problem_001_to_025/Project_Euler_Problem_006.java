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
 * Title      : Problem 6: Sum square difference
 * URL        : https://projecteuler.net/problem=6
 * 
 * Description: The sum of the squares of the first ten natural numbers is,
 *              1^2 + 2^2 + ... + 10^2 = 385
 * 
 *              The square of the sum of the first ten natural numbers is,
 *              (1 + 2 + ... + 10)^2 = 552 = 3025
 * 
 *              Hence the difference between the sum of the squares of the first
 *              ten natural numbers and the square of the sum is 
 *              3025 − 385 = 2640.
 * 
 *              Find the difference between the sum of the squares of the first 
 *              one hundred natural numbers and the square of the sum.
 */
public class Project_Euler_Problem_006 {
    
    public static long findAnswer() {

        long lSum = 0;
        long lSumSquare = 0;
        for (int i = 1; i <= 100; i++) {
            lSum += i;
            lSumSquare += Math.pow(i, 2);
        }
        return (new Double(Math.pow(lSum, 2) - lSumSquare)).longValue();
    }

}
