package tiposdedatos.biginteger;

import java.math.BigInteger;

public class Factorial  {
	
    public static void main(String[] args) {
        System.out.println(factorial(new BigInteger("15")));
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO))  
        	return BigInteger.ONE;
        else 
        	return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
    
}