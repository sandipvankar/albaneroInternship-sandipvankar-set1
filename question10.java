/* Q10.add two numbers without using the plus operator?
Example:
Input: 5 6
Expected Output: 11
*/
import java.util.*;
class question10{
    public static void main(String[] args) {
        int first,sec;
        System.out.println("enter first value:");
        Scanner sc= new Scanner(System.in);
        first= sc.nextInt();
        System.out.println("enter second value:");
        sec = sc.nextInt();

        while(first--!=0)
        {
        sec++;
        }
        System.out.print("Sum of two numbers is: "+ sec);
        

        
        
    }
}