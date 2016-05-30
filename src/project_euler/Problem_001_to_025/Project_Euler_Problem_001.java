/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler.Problem_001_to_025;

/**
 *
 * @author bpolus
 */
public class Project_Euler_Problem_001 {
    
    public static long findSum() {
        long lSum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) lSum += i;
        }
        return lSum;
    }

}
