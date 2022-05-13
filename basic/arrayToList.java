package basic;

import java.util.ArrayList;
import java.util.List;

public class arrayToList {
    public static void convert(){
        int[] array = new int[4];
        array[0]=4;
        array[1]= 7;
        array[2]=18;
        array[3]=21;
        System.out.println(array);

        List<Integer> list = new ArrayList<>();
        for (Integer e : array) {
            list.add(e);
        }
        
        System.out.println(list);
    }
    public static void main(String[] args) {
       convert();
    }
    
}
