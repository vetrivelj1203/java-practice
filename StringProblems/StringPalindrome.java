import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the String :");
            String str = sc.nextLine();
            String temp ="";
            int length = str.length();

            for(int i=length-1 ; i>=0;i--){
                temp += str.charAt(i);

            }
            
            if( str.toLowerCase().equals(temp.toLowerCase())) 
            {
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Not a palindrome");
            }
        }
    }
}
