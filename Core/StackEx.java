package Core;

import java.util.Iterator;
import java.util.Stack;
import java.util.function.Consumer;

public class StackEx {
public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(27);
    s.push(56);
    s.push(45);

    s.pop();
    //s.forEach(System.out::println);
    s.forEach((e)->{System.out.println(e);});
    // Iterator<Integer> it = s.iterator();
    // while(it.hasNext()){
    //     System.out.println(it.next());
    // }
}
    
}


 class s implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
      System.out.println(t);
        
    }


   
       
   }
