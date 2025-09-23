/*
 1234567
 2345671
 3456712
 4567123
 5671234
 6712345
 7123456

 */
public class RectangularNumberPattern {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
                System.out.print(j);
            for(int j=1;j<i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
    
}
