import java.util.Scanner;

public class sumOfRightMatrix {
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println ("Enter the size");
            int size = sc.nextInt();
            int[][] mat = new int[size][size];
            int temp=0,store=0;
            System.out.println ("Enter the matrix");

            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    mat[i][j] = sc.nextInt();
                }
            }

            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)            
                    System.out.print(mat[i][j] + " ");
                    System.out.println("");
                

                }
                for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    // secondary  matrix sum
                   if((i+j) == (size-1))
                   {
                    store += mat[i][j];
                   }

                   // primary matix sum

                   if(i==j) 
                   {
                    temp += mat[i][j];
                   }
            }

                }
                System.out.print("Sum of primary matrix is : ");
                System.out.println(temp);
                System.out.print(" sum for  secondary matrix is : ");
                System.out.println(store);
                
                
            }


        }
        
    }

