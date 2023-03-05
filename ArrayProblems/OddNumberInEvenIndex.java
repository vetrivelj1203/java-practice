import java.util.Scanner;

public class OddNumberInEvenIndex {
    public static void main (String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();

            int[] arr = new int[size];
            
                for (int i=0;i<size;i++) {
                arr[i] =sc.nextInt();
                // System.out.println( arr[i]);
            }
            System.out.println( "Array values are : ");
            for (int i=1;i<size;i++) {
                if(i%2 == 0 && (arr[i] %2 !=0) )
                {
                   System.out.print (arr[i] + " ");
                }
            }
        }
        }
    }

