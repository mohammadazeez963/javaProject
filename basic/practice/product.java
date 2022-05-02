package basic.practice;

public class product {
    
    public static void main(String[] args) {
        
        int[] array = new int[3];
        array[0] = 2;
        array[1] = 3;
        array[2] = 4;

        int mul = 1;

        for (int j : array) {
            mul = mul * j;
            
        }
        System.out.println(mul);
    }
}
