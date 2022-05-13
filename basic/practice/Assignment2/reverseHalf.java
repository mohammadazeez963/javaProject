package basic.practice.Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class reverseHalf {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


   
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i);
            list.add(k);
        }

        Collections.sort(list);

        String newString = "";

       for (int i = (list.size()-1); i >= 0 ; i--) {
           newString += (char)(int)list.get(i);
       }
        
       System.out.println(newString);
    
    }
}
