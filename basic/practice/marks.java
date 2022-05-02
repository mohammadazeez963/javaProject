package basic.practice;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {

        int students,greatest,lowest,sum;
        double average;

        Scanner sc = new Scanner(System.in);
        System.out.println("No.of Students");

        students = sc.nextInt();
        
        System.out.println("Enter the students marks:");
        int[] marks = new int[students];

        for (int i = 0; i < students ; i++) {
            marks[i] = sc.nextInt();
        }

        greatest = marks[0];

        for (int j = 1; j < marks.length; j++) {
            if(greatest < marks[j]){
                greatest = marks[j];
            }
        }

        lowest = marks[0];

        for (int k = 1; k < marks.length; k++) {
            if(lowest > marks[k]){
                lowest = marks[k];
            }
        }

        sum = 0;

        for (int s : marks) {
            sum = sum + s;
        }

        average = sum/students;

        System.out.println("The greatest marks are: "+greatest);
        System.out.println("The lowest marks are: "+lowest);
        System.out.println("The average marks are: "+average);

         sc.close();
    }

}
