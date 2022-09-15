/* Q4.Find the number of occurrences of a character in a String?
Example:
string = Anvitha
character = a
Since a occured twice, the expected output would be 2. 
*/
import java.util.*;
public class question4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String=");
        String str= sc.nextLine();   
        System.out.print("Enter String=");
        String search= sc.nextLine(); 
        char search = 'a';             // Character to search is 'a'.
    
    int count=0;
    for(int i=0; i<str.length(); i++)
    {
        if(str.charAt(i) == search)
        count++;
    }
    
    System.out.println("character =" + search);
    System.out.println("Since a occured twice, the expected output would be " + count +"." );
    }
}
