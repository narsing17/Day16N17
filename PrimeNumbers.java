package com.blz.datastructure;
import java.util.ArrayList;
public class PrimeNumbers {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        final int START_RANGE = 0;
        final int END_RANGE = 1000;
        primePrint(START_RANGE,END_RANGE);
    }
    /*
       @purpose: Ability to print prime numbers
       @param: start range and end range
       @function : starts sending from startRange to isPrime method and if prime adds that to array list
       @return: No return value.
      */
    private static void primePrint(int startRange, int endRange) {
        System.out.println("Prime numbers are in between " + startRange + " and " + endRange + " are :");
        for (int range = startRange; range <= endRange; range++) {
            if (isPrime(range)) {
                arrayList.add(range);
            }
        }
        System.out.println(arrayList);
    }

    /*
     @purpose: Ability to check  the number is prime or not
     @param: number
     @function : checks for prime
     @return: returns true if prime else returns false
    */
    public static boolean isPrime(int num) {
        int flag=0;
        if(num==0||num==1)
            return false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
