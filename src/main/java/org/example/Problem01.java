package org.example;

public class Problem01 {
    public static long getSumOfPrimes(int n) {
        int sum=0;
        boolean prime;

        for(int i=1;i<=n;i++) {
            prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }//This tests the i if it is divisible by j and if it is it means it will not be prime
            }
            if (prime == true) {
                sum = sum + i;
            } //
        }    return sum-1;}}
//Since I started at 1, I had to fix my return statement because it ended up being 1 greater than the sum it should be each time
        // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
        //          Test your solution
        //          Analyze its space and time



