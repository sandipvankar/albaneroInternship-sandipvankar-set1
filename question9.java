/* Q9.remove a given character from String
Example:
string = Anvitha
character: h
Expected Output: Anvita */
import java.util.*;

public class question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String=");
        String str = sc.nextLine(); 
        System.out.print("Character=");
        String ch = sc.nextLine(); 
        
        String strNew = str.replace(ch, "");

        System.out.println(strNew); 
    }
}
