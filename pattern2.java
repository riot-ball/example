import java.util.*;
class pattern2
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,n;
        System.out.println("enter the rows for which the pattern will go on");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}      