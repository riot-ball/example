import java.util.*;
class sort1
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,n;
        int a[]=new int[5];
        System.out.println("enter");
        for(i=0;i<5;i++)
            a[i]=in.nextInt();            
        for(i=0;i<5;i++)
        {
            for(j=0;j<(4-i);j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp;
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<5;i++)
            System.out.println(a[i]);
    }
}    