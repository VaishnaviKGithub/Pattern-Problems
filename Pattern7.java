/* 
1   ----1
2   ---2-2
3   --3---3
4   -4-----4
5   555555555  
*/    
public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
                
            for(int j=1;j<=i*2-1;j++)
            {
                if(j==1||j==i*2-1||i==n)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
            }
           
        }
}

