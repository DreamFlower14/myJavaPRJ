package c;

public class Class0503 {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.println(i);
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);
    }
}