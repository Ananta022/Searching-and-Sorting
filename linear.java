/*
    In the worst case we have to traverse the whole array thats'why the time complexity
    of the algorithm is O(n)
 */

import java.util.*;
public class linear{
    public static void linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println("The target element is found at index: "+i);
                return;
            }
        }
        System.out.println("Target element is not found.");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        linearSearch(arr, target);

        sc.close();//Closing the scanner
    }
}