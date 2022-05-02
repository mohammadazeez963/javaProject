package basic;

import java.util.Scanner;

public class table {
    /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
        sc.close();
    } */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();

        int i = 1;
        while(i<=10){
            System.out.println(n+" X "+i+" = "+(n*i));
            i++;
        }
        sc.close();
    }
}
