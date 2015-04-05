/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg119;
import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;
/**
 *
 * @author Liz
 */
public class Solution {
    
 
    
    public static BigInteger factorial(int n)
    {
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }
    
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> rowArray = new ArrayList();

        for (int k = 0; k <= rowIndex; k++) {
            BigInteger rowIndexFactorial = factorial(rowIndex);
            BigInteger kFactorial = factorial(k);
            BigInteger rowIndexMinusKFactorial = factorial(rowIndex - k);
            
            BigInteger multiply = kFactorial.multiply(rowIndexMinusKFactorial);
            
            BigInteger result = rowIndexFactorial.divide(multiply);

            
            int integerRowValue = result.intValue();;
            rowArray.add(k, integerRowValue);
        }
        
        return rowArray;
    }
}
