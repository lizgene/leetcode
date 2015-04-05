/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20;
import java.util.Stack;
/**
 *
 * @author Liz
 */
public class Solution {
    
    public static boolean isMateForBracket(String a, String b){
        if(a.equals("(") && b.equals(")")) return true; 
        if(a.equals("[") && b.equals("]")) return true; 
        if(a.equals("{") && b.equals("}")) return true;
        return false;
    }
    
    public static boolean isOpenBracket(String a){
        if(a.equals("(")) return true;
        if(a.equals("[")) return true;
        if(a.equals("{")) return true;
        return false;
    }
    public boolean isValid(String args) {
        //check that it could theoretically be valid
        int length = args.length();
        if(length % 2 != 0) return false;
        
        Stack<String> brackets = new Stack();
        
        for(int i = 0; i < args.length(); i++){
            if(isOpenBracket(args.substring(i, i + 1))) {
                String str = args.substring(i, i + 1);
                brackets.push(str);
            } else {
                if(brackets.size() == 0) return false;
                
                String bracket = brackets.pop();
                String str = args.substring(i, i + 1);
                
                if(!isMateForBracket(bracket, str)) {
                    return false;
                }
            }
        }
        if(brackets.size() == 0) return true;
        return false;
    }
    
}


