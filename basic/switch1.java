package basic;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int a = 0;
         
          if(n>90){
              a = 1;
          }
          else if(n>=45 && n<=60){
              a = 2;
          }
          else if (n<30){
              a = 3;
          }

        switch(a){
            case 1:
                System.out.println("fat");
                break;
            case 2:
                System.out.println("healthy");
                break;
            case 3:
                System.out.println("thin");
                break;
            default:
                System.out.println("Invalid age");
        }
        sc.close();
    }
}
