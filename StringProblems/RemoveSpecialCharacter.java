import java.util.Scanner;

public class RemoveSpecialCharacter {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the string : ");
            String str = sc.nextLine();
            String temp ="";
            int len = str.length();
            for (int i=0;i<len;i++)
            {

                // capital letters 65-90 and small letters 97-122
                if(str.charAt(i)>64 && str.charAt(i) <123)
                {
                    temp+= str.charAt(i);
                }
                else {
                    temp += " ";
                }
            }
            System.out.print("After removing specil character the string is : " + temp);
        }
    }
}