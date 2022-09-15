/*
 Q8.count the number of vowels and consonants in a given string?
Example:
string = Anvitha
Vowels = 3
Consonants = 4 
 */

 import java.util.*;
public class question8 {
public static void main(String[] args) {
    

    int v=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String=");
        String str = sc.nextLine(); 
        //str = str.toLowerCase();   
   
        for(int i=0;i<=str.length();i++){

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') { 
                     v++; 
                } 
             if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
                   c++;
                 }
                
                }
                System.out.println("Number of vowels: " + v);  
                 System.out.println("Number of consonants: " + c);  
}
}
