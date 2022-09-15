/*Q3.A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. Given an integer, d, rotate the array that many steps left and return the result.
Example:
d=2
arr = [1,2,3,4,5]
After 2 rotations, expected output is [3,4,5,1,2] */

import java.io.*;
public class question3 {   
 
static void Rotate(int arr[], int d, int n)
{
 
    int temp[] = new int[n];
    int k = 0;
 
     for (int i = d; i < n; i++) {
        temp[k] = arr[i];
        k++;
    }
    
    for (int i = 0; i < d; i++) {
        temp[k] = arr[i];
        k++;
    }
    
    for (int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }
}
 
static void PrintTheArray(int arr[], int n)
{
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    }
}
    public static void main (String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int N = arr.length;
        int d = 2;
 
        
        Rotate(arr, d, N);
        PrintTheArray(arr, N);
    }
}
