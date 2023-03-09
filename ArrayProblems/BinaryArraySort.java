import java.util.Scanner;

public class BinaryArraySort {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            int size =sc.nextInt();
            int[] bArr = new int[size];

            for(int i=0;i<size;i++)
            {
                bArr[i] =sc.nextInt();
            }
            int temp;

            for(int i=0;i<size;i++)
            {
                for(int j=i+1;j<size;j++) {
                    if(bArr[i] >bArr[j]) 
                    {
                        temp = bArr[i];
                        bArr[i] = bArr[j];
                        bArr[j] = temp;
                    }
                }
                System.out.print(bArr[i] + " " );
            }
        }
    }
}
