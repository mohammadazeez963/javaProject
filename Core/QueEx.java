package Core;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.function.Consumer;

public class QueEx {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(20);
        q.offer(35);
        q.offer(87);
        q.offer(-45);

       // q.poll();
       //System.out.println(q);

       //q.forEach(System.out::println);


       q.forEach((e)->{System.out.println(e);});

    // Iterator<Integer> it = q.iterator();
    // while (it.hasNext()) {
    //     System.out.println(it.next());
    }

    }
    class imp implements Consumer<Integer>{

        @Override
        public void accept(Integer t) {
            System.out.println(t);
        }}

    

