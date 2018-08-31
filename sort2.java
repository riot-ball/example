import java.util.*;
class sort2
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,sch,beg,mid,c,end;
        int a[]=new int[5];
        System.out.println("enter");
        for(i=0;i<5;i++)
            a[i]=in.nextInt();
        System.out.println("enter");
        sch=in.nextInt();
        c=0;
        beg=0;
        end=5-1;
        while(beg<=end)
        {
            mid=(beg+end)/2;
            if(a[mid]==sch)
            {
                c++;
                break;
            }
            if(a[mid]<sch)
            {
                beg=mid+1;
            }    
            if(a[mid]>sch)
            {    
                end=mid-1;
            }                   
        }
        if(c>0)
            {
                System.out.println("found");
            }    
            else
            {
                System.out.println("not found");
            } 
    }
}    
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            