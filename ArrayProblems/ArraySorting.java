// import java.util.Arrays;
import java.util.Scanner;

// import java.util.*;

public class ArraySorting {
    public static void main (String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the number :  ");
            int num =in.nextInt();
            int[] arr = new int[num];
            for(int i=0;i<num;i++)
            {
                arr[i]=in.nextInt();
                
            }
            System.out.println("------------------------------------");
            int temp=0;

            for(int i=0;i<num;i++)
            {
               for(int j=i+1;j<num;j++)
               {
                
                    if(arr[i]>arr[j])
                    {
                        
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                    
               }
               System.out.println(arr[i]);
               
            }
        }
        

    }
}