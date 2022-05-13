package basic.practice;

import java.util.HashMap;
import java.util.Map;


public class BillPayment {
    public static void main(String[] args) {
        Map<String,Integer> object = new HashMap<>();

        object.put("Salary", 40000);
        object.put("Id",2000);
        object.put("Fee",4000);

     

      object.put("Salary", 60000);

      object.remove("Salary");

      System.out.println(object);
    
}
}
