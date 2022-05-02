package basic.practice;

public class HumanImp implements Human {

    @Override
    public void speak(String language) {
       
        System.out.println("Aaryan speaks "+language+" fluently.");
    }

    @Override
    public void dance() {
       
        System.out.println("They dance very well.");
    }

    @Override
    public void sing() {
        
        System.out.println("Anu sings very well.");
    }

    public static void main(String[] args) {
        new HumanImp().speak("spanish");
        new HumanImp().dance();
        new HumanImp().sing();
    
    }

}
