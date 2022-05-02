package Core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class ListEx {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(39);
        list.add(-11);
        list.add(56);

        List<Integer> array = new ArrayList<Integer>();
        array.add(37);
        array.add(-24);
        array.add(32);
        array.add(67);
        // System.out.println(list);
        // System.out.println( list.size());
        // System.out.println(list.contains(-11));
        // System.out.println(list.contains(34));
        // //System.out.println(list.remove(3));
        // System.err.println(list.indexOf(56));
        // System.out.println(list.get(1));

        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        // for (Integer e : list) {
        //     System.out.println(e);
        // }

        list.forEach((e)->System.out.println(e));
        array.forEach(System.out::println);

        // list.forEach(System.out::println);

    }

    class c implements Consumer<Integer>{
       

        @Override
        public void accept(Integer t) {
            System.out.println(t);
            
        }
    }
    
}
