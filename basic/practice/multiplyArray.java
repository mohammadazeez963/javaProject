package basic.practice;

import java.util.Scanner;



public class multiplyArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Length:");
        int arrLength = sc.nextInt();

        int[] array = new int[arrLength];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < arrLength; i++) {
            array[i] = sc.nextInt();

        }
        int product = 1;

        for (int j : array) {
            product = product * j;

        
        }
       System.out.println("Product of the array:"+product);

       

        sc.close();
    }


    
}
