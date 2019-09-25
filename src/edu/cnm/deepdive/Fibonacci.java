package edu.cnm.deepdive;

import java.math.BigInteger;

public class Fibonacci {

  public static void main(String[] args) {
    System.out.println(fibonacci(8
    ));
  }

  

  public static BigInteger fibonacci(int n){

    BigInteger t;

    if (n<=0){
    t = BigInteger.ZERO;
    } else if(n == 1){
      t= BigInteger.ONE;
    } else {
      t = fibonacci(n-1).add(fibonacci(n-2));
    }

    return t;
  }

}
