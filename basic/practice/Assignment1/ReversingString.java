package basic.practice.Assignment1;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;



public class ReversingString {
    static Scanner sc = new Scanner(System.in);
    public static String reverseString() {
        String d = sc.nextLine();
        String newD = "";

        for (int i = d.length()-1; i >=0 ; i--) {
            newD += d.charAt(i);
        }

        return newD;
       
    }

    public static String removeEven() {
        String f = reverseString();
        String newF = "";
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < f.length(); i++) {
            int s = Character.getNumericValue(f.charAt(i));
        
            if(s%2 != 0){
                array.add(s);
            }
       }
       for (Integer n : array) {
           newF += n;
       }
       return newF;

   }

   public static void main(String[] args) {
       System.out.println(removeEven());
   }


}
