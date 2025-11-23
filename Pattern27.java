/*
 * Pattern27

        a
        ab
        abc
        abcd
        abcde


 */
public class Pattern27 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+96));
            }
            System.out.println();
        }
    }
}
