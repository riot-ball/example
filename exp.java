public class exp
{
    public static void main(int n)
    {
        int i,j;
        System.out.println("enter the rows for which the pattern will go on");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }    
    }
}    