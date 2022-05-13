package basic.practice.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeapYear {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the years: ");
        List<Integer> leapYears = new ArrayList<>();
        int years = sc.nextInt();
        for (int i = 2022; i <= (2022+years); i++) {
              if (i % 400 == 0 || i % 100 != 0 && i % 4 == 0){
                  leapYears.add(i);
              }
        }

        System.out.println(leapYears);
    }
}
