/*
 Pattern14

  AAAAA
  BBBBB
  CCCCC
  DDDDD
  EEEEE
 */
public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.println((char)(i+64));
            }
            System.out.println();
        }
    }
    
}
