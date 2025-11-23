/*
Pattern55

    ABCDE
     BCDE
      CDE
       DE
        E
*/
public class Pattern55 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }

            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(j+64));
            }

            System.out.println();
        }
    }
}
