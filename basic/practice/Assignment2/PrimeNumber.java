package basic.practice.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Enter the first number: ");
       int a = sc.nextInt();
       System.out.println("Enter the last number: ");
       int b = sc.nextInt();
       
       List<Integer> list = new ArrayList<>();
       while(a <= b) {
           int Multiples = 0;
           for (int j=1;j<=a;j++) {
            
               if (a%j == 0) {
                Multiples++;
               }
           }
           if (Multiples == 2) {
               list.add(a);
           }

           a++;
       }
       System.out.println(list);
    }
}
