package Array;

public class CommonElements {
    public static void main(String[] args) {
        // Write a program to find the common elements between two arrays
        int[] arr1 = { 3, 4, 7, 2, 1, 8 };
        int[] arr2 = { 1, 2, 5 };
        // 1,2
        for (int i = 0; i < arr1.length; i++) {
            int ele1 = arr1[i];

            for (int j = 0; j < arr2.length; j++) { 
                int ele2 = arr2[j];
                if (ele1 == ele2) {
                    System.out.print(ele1 + "  ");
                    break;
                }
            }
        }

        // SpaceComplexity - O(1)
        // TimeComplecity - O(n*m)
    }
}
