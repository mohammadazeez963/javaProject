package basic.practice.Assignment3;

import java.util.Scanner;

public class productOfPrimeNumbers {

    static Scanner sc = new Scanner(System.in);

    public static boolean isPrime(int number) {        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int smallerPrime(int number) {
        
        int smaller = 0;
        for (int i = number-1 ; i > 0; i--) {
            if(isPrime(i)){
                smaller = i;
                break;
            }
        }
        return smaller;
    }

    public static int biggerPrime(int number) {
        
        int bigger = 0;
        int counter = number + 1;
        while (true) {
             if (isPrime(counter)) {
                 bigger = counter;
                 break;
             }
             counter++;
        }
        return bigger;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int inputNumber = sc.nextInt();
        int s1 = smallerPrime(inputNumber);
        int s2 = biggerPrime(inputNumber);

        // smaller and bigger prime numbers of s1
         
        int s1SmallerPrime = smallerPrime(s1);
        int s1BiggerPrime = biggerPrime(s1);

        // smaller and bigger prime numbers of s2

        int s2SmallerPrime = smallerPrime(s2);
        int s2BiggerPrime = biggerPrime(s2);

        //addition of smaller prime numbers of s1 and s2

        int sumOfSmaller = s1SmallerPrime + s2SmallerPrime;
        int sumOfBigger = s1BiggerPrime + s2BiggerPrime;

        //product of smaller and bigger prime numbers sum

        int product = sumOfSmaller * sumOfBigger;

        System.out.println("The product of smaller and bigger prime numbres sum is: "+product);

    }

    

}
