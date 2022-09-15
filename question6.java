/*Q6.Find the maximum occurring character in a given String
Example:
string = Anvitha
Expected Output: a
 */
import java.util.*;
class question6 {
    static char maxOccurringChar(String str) {
        char ans = 'a';
        int maxfreq = 0, n = str.length();
        int count[] = new int[256];
        for (int i = 0; i < n; i++) {
           count[str.charAt(i)]++;
           if (count[str.charAt(i)] > maxfreq) {
              maxfreq = count[str.charAt(i)];
              ans = str.charAt(i);
           }

                    }
                    return ans;        
            }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter String=");
    String str= sc.nextLine(); 
    System.out.println("ouput: " + maxOccurringChar(str));
    }
}
