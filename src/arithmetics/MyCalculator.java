
package arithmetics;

import java.math.BigInteger;


public class MyCalculator implements AdvanceArithmetic {

    @Override
    public int divisorSum(int n) {
        int cnt=0;
        for(int i=1;i<n;i++){
            if(n%i ==0){
                cnt+=i;
            }
                
        }
        return cnt;
        
    }

    @Override
    public BigInteger findFactorial(int n) {
       BigInteger result= BigInteger.ONE;
       for(int i=1;i<=n;i++){
           result = result.multiply(BigInteger.valueOf(i));
       }
      
      return result;
    }
    

     
 } 
