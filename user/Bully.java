import java.io.*;
import java.util.Scanner;

class Bully{
    static int n;
    static int pro[] = new int[100];
    static int sta[] = new int[100];
    static int co;

    public static void main(String args[])throws IOException
    {
        System.out.print("Enter the number of process:");
		Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int i;

        for(i=1;i<=n;i++)
        {
            System.out.println("For process "+(i)+":");
            System.out.print("Status:");
            sta[i]=in.nextInt();
            System.out.print("Priority:");
            pro[i] = in.nextInt();
        }

        System.out.println("Which process will initiate election?");
        int ele = in.nextInt();
        elect(ele);
        System.out.println("Final coordinator is "+co);
        in.close();
    }

    static void elect(int ele)
    {

        co = ele;
        for(int i=1;i<=n;i++)
        {
            if(pro[ele]<pro[i])
            {
                System.out.println("Election message is sent from "+(ele)+" to "+(i));
                if(sta[i]==1)
                    elect(i);
            }
        }
    }
}