/*
    If the array is already sorted then the time complexty og the code is O(logn)
    otherwise we have to sort the array first so time complexity willbe O(nlogn)
 */

import java.util.*;
public class binary {
    public static void binarySearch(int arr[],int target){
        //Sort the array first
        Arrays.sort(arr);
        int si = 0;
        int ei = arr.length-1;

        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(target == arr[mid]){
                System.out.println("The target element is found at the index: "+mid);
                return;
            }
            if(target < arr[mid]){
                ei = mid-1; // Search for the  left half
            }else{
                si = mid+1; // Search for the right half
            }
            
        }
        System.out.println("Target element is not found");

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the elements: ");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        binarySearch(arr, target);

        sc.close(); //Closing the scanner
    }
}
