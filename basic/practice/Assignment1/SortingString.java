package basic.practice.Assignment1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingString {
    static Scanner sc = new Scanner(System.in);
    public static String sortingString() {
        System.out.println("Enter a string with characters of numbers:");
        String str = sc.nextLine();
        String newStr = "" ;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < str.length(); i++) {
             list.add(Character.getNumericValue(str.charAt(i)));
        }
        Collections.sort(list);
 
        for (Integer g : list) {
            newStr += g;
        }
        
        return newStr;
    }
    public static void main(String[] args) {
       System.out.println("Sorted String: "+sortingString());
    }

    
}
