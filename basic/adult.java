package basic;

import java.util.Scanner;

public class adult {
    public static void main(String[] args) {
        System.out.println("Enter the Name:");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();

        System.out.println("Enter the Age: ");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println(Name+" is an Adult");
        }
        else{
            System.out.println(Name+" is not an Adult");
        }


    }
    
}
