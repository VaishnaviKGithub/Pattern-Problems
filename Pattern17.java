/*
  Pattern17

    EDCBA
    EDCBA
    EDCBA
    EDCBA
    EDCBA

*/
public class Pattern17 {

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    
}
