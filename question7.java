/*Q7.How to check if a string contains only digits? */
import java.util.*;


public class question7 {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String=");
        String str2 = sc.nextLine(); 

       // String str = "5236841234";
		boolean result = str2.matches("[0-9]+");
		System.out.println("Original String : " + str2);
		System.out.println("Does string contain only Digits? : " + result);
    }
    }