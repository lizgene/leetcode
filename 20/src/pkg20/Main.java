/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20;
import pkg20.Solution;
/**
 *
 * @author Liz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Solution sol = new Solution();
        System.out.println(sol.isValid("["));
        System.out.println(sol.isValid("(("));
        
        System.out.println(sol.isValid("([()[]])"));
        System.out.println(sol.isValid("()()[]()()"));
        System.out.println(sol.isValid("(()]"));
    }
    
}
