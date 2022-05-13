package Core;

public class Lambda{
    public static void main(String[] args) {
        Inter in = ()->System.out.println("hello");

        in.hello();
    }
}
