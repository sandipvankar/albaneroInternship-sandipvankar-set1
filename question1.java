/*Q1. Reverse an array of integers.
 Sample Input: 1432
 Expected Output: 2341 */

 import java.util.*;
 class ReverseArr{
public static void main(String []args){
    int arr[] = new int[4];
    Scanner sc= new Scanner(System.in);
    
    for(int i=0;i<arr.length;i++){
        System.out.println("Enter Element in Array:");
        arr[i] = sc.nextInt();
    }
    System.out.println("Sample Input");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+ " ");
    }
    System.out.println("Expected Output");
    for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i]+ " ");
    }
 }
}
 