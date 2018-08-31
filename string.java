import java.util.*;
class string
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,x=0;
        System.out.println("enter no.");
        n=in.nextInt();
        while(x<=n)
        {
            if(x%2==0)
            {
                System.out.print((x*x)+",");
            }
            else
            {
                System.out.print((x)+",");
            }
            x++;
        }
    }
}    