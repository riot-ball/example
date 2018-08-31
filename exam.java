import java.util.*;
class exam
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,c1=0,c2=0,prime,n;
        System.out.println("enter");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c1++;
            }    
        }
        if(c1==2)
            System.out.println("prime");
        else
        {
            while(true)
            {
                n++;
                for(i=1;i<=n;i++)
                {
                    if(n%i==0)
                    {
                        c2++;
                    }    
                }
                if(c2==2)
                {
                    System.out.println(n+" is a prime");
                    break;
                }
            }
        }
    }
}
            
            
            
            
            