package Core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {

    List<Map<String,String>> employee = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        // System.out.println(map.isEmpty());

        map.put("Name", "Azeez");
        map.put("Id", "1000");
        map.put("salary","10000");
    
    employee.add(map);
    map.clear();


        map.put("Name", "Aaryan");
        map.put("Id", "1001");
        map.put("salary","20000");
    
    employee.add(map);

       
        System.out.println(employee);

        
    }
    
}
