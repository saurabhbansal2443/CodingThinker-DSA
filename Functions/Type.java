package Functions;

public class Type {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 4, 2, 9 };

        // int max = MaxEle(arr);

        String str = "Saurabh"; 

        String ans = ReverseString("y"); 

        System.out.println(ans);

    }

    // public static void PrintMaxEle(int[] arr) {
    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > max) {
    // max = arr[i];
    // }
    // }
    // System.out.println(max);
    // }

    // public static int MaxEle(int[] arr){
    // int max = Integer.MIN_VALUE;

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > max) {
    // max = arr[i];
    // }
    // }
    // return max;
    // }

    public static String ReverseString(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        System.out.println("String reverse main logic started ");

        String ans = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            ans = ans + str.charAt(i);
        }

        return ans;
    }
}
