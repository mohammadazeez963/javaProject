package Code_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2{

    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);

    public static int MaximumToys(int money,int[] pricesOfToys) {

        List<Integer> basket = new ArrayList<>();

         int remainigBalance = money;
        
        
        for (int i = 0; i < pricesOfToys.length; i++) {

           

            for (int j = i; j < pricesOfToys.length; j++) {
                if (remainigBalance >= pricesOfToys[j]) {
                    remainigBalance = remainigBalance - pricesOfToys[j];
                    basket.add(pricesOfToys[j]);
                   
                } 
                else{
                    break;
                }
            }
                

           

           
        }
        int maxToys = basket.size();
        return maxToys;
        
    }

    public static void main(String[] args) {
        System.out.println("Enter the no.of toys");
        int n = sc.nextInt();

        System.out.println("Enter the prices of toys");
        int[] pricesOfToys = new int[n];
        for (int i = 0; i < pricesOfToys.length; i++) {
            pricesOfToys[i] = sc1.nextInt();
        }

        System.out.println("Enter the amount");
        int money = sc2.nextInt();



        System.out.println( "The maximum toys are: "+MaximumToys(money, pricesOfToys));
       
    }
}