/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;


/**
 *
 * @author bpolus
 */
public class Project_Euler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ExecuteProblem(203);                

    }
    
    public static void ExecuteProblem(int ProblemNumber) {
        switch (ProblemNumber) {
            case 1:
                // Problem 1
                System.out.println(project_euler.Problem_001_to_025.
                                   Project_Euler_Problem_001.findSum());
                break;
                
            case 2:
                // Problem 2
                System.out.println(project_euler.Problem_001_to_025.
                                   Project_Euler_Problem_002.findSum());
                break;
                
            case 3:
                // Problem 3
                System.out.println("Problem 3");     
                System.out.println(project_euler.Problem_001_to_025.
                                   Project_Euler_Problem_003.
                                        returnMaxPrimeDividor(600851475143L));
                break;

            case 4:
                // Problem 4
                System.out.println("Problem 4");     
                System.out.println(project_euler.Problem_001_to_025.
                                   Project_Euler_Problem_004.
                                        findMaxPalindrome3Digits());
                break;

            case 5:
                // Problem 5
                System.out.println("Problem 5");     
                System.out.println(project_euler.Problem_001_to_025.
                                   Project_Euler_Problem_005.returnAnswer());
                break;
                
            case 6:
                // Problem 6
                System.out.println("Problem 6");     
                System.out.println(project_euler.Problem_001_to_025.
                                   Project_Euler_Problem_006.findAnswer());
                break;
            
            case 65:
                // Problem 65
                System.out.println("Problem 65");     
                System.out.println(project_euler.Problem_051_to_075.
                                   Project_Euler_Problem_065.findSumDigits());

            case 79:
                // Problem 79
                System.out.println("Problem 79");     
                System.out.println(project_euler.Problem_076_to_100.
                                   Project_Euler_Problem_079.returnAnswer());
                break;
                
            case 203:
                // Problem 203
                System.out.println("Problem 203");     
                System.out.println(project_euler.Problem_201_to_225.
                         Project_Euler_Problem_203.findAnswer());
        
        }
            
                
    }
}
