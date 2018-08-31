import java.util.*;
class auto
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int square,n,x,c,s=0,fact=0,l;
        System.out.println("enter no");
        n=in.nextInt();
        c=1;
        square=n*n;
        while(n>0)
        {
            x=n%10;
            c++;
            s=s*10+x;
            n=n/10;
        }
        while(c>1)
        {
            l=square%10;
            fact=fact*10+l;
            square=square/10;
            c--;
        }
        if(s==fact)
        {
            System.out.println("auto. no.");
        }
        else
        {
            System.out.println("non auto. no.");
        }
    }
}    
                