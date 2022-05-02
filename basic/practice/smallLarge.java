package basic.practice;


import java.util.Scanner;

public class smallLarge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arrayLength,large,small ;
        System.out.println("Enter the array Length: ");
        arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

        System.out.println("Enter the array elements: ");

        for(int i=0; i<arrayLength; i++){
            array[i] = sc.nextInt();
        }

            large = array[0];

        for (int j = 1; j < array.length; j++) {

            if(large<array[j]){
                large = array[j];
            }
        }

        System.out.println("The Largest number is: "+large);

            small = array[0];

        for (int index = 1; index < array.length; index++) {
            if(small>array[index]){
                small = array[index];
            }
        }

        System.out.println("The Smallest number is: "+small);

        sc.close();

        
    }
    
}
