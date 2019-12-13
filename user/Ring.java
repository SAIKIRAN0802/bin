import java.util.Scanner;

public class Ring
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of processes");
    int n=sc.nextInt();
    int[] ids=new int[n];
    int[] sta=new int[n];
    for(int i=0;i<n;i++)
    {
      ids[i]=i+1;
      sta[i]=1;
    }
    System.out.println("enter process which failed");
    int failed=sc.nextInt()-1;
    sta[failed]=0;
    System.out.println("Who Initiates Election?");
    int invoker=sc.nextInt()-1;
    int co=invoker;
    int prev=invoker;
    int next=(prev+1)%n;
    while(true)
    {
      if(sta[next]!=0)
      {  
        if(ids[next]>co)
          co=ids[next];
        System.out.println("election msg passed from "+(prev+1)+"to "+((next+1)));
        if(next==invoker)
        	break;
        prev=next;
        next=(next+1)%n;
    
      }
      else
      {   
        next=(next+1)%n;
      }
    }
    System.out.println(co+" becomes coordinator");
     prev=co-1;
     next=(prev+1)%n;
    while(true)
    {
      if(sta[next]!=0)
      {  
        if(ids[next]>co)
          co=ids[next];
        System.out.println("Co-ordinator msg passed from "+(prev+1)+"to "+((next+1)));
        if(next==(co-1))
        	break;
        prev=next;
        next=(next+1)%n;
    
      }
      else
      {   
        next=(next+1)%n;
      }
    }

    
    
  }
}