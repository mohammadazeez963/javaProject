package basic.practice.Assignment1;

import java.util.Scanner;

public class M {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      Maths m = (int a, int b) -> System.out.println("Sum of a+b is: "+(a+b));
      System.out.println("Enter the value of A: ");
      int c = sc.nextInt();
      System.out.println("Enter the value of B: ");
      int d = sc.nextInt();
      m.add(c,d);
    }
}
