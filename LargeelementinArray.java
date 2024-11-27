import java.util.Scanner;

public class LargeelementinArray {

    static int largestElement(int[] arr, int n) {
        int maxvalue = arr[0];
        for (int j = 1; j < n; j++) { // Start from index 1
            if (arr[j] > maxvalue) {
                maxvalue = arr[j];
            }
        }
        return maxvalue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt(); // Initialize n first
        int[] arr = new int[n]; // Now you can declare the array with the correct size

        System.out.println("Enter the elements of the array (separated by spaces):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read integers separated by spaces
        }

        int maxElement = largestElement(arr, n); // Call the correct method
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}
