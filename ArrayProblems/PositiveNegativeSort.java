import java.util.Scanner;

public class PositiveNegativeSort {
    public static void main (String args[]) {
        try(Scanner sc= new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            int temp;
            for (int i=0;i<size;i++)
            {
                for(int j=i+1;j<size;j++) 
                {
                    if(i%2!=0 && arr[i]>0  ){
                        temp =arr[i];
                        arr[i] =arr[j];
                        arr[j] = temp;
                    }else
                    {
                        if(i%2 ==0 && arr[i] <0) {
                            temp =arr[i];
                        arr[i] =arr[j];
                        arr[j] = temp;
                        }
                    }   
                }
                System.out.print (arr[i] + " ");
            }
        }
    }
}
