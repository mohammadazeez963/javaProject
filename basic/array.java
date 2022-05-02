package basic;

public class array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=56;
        arr[1]=37;
        arr[2]=86;
        arr[3]=49;
        arr[4]=27;

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        //}

        
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
}
