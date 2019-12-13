import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*; 
public class ClockClient  
{ 
public static void main(String[] args) throws IOException  
{ 
        String hostName; 
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the port no"); 
        int port=sc.nextInt();
        System.out.println("Enter the host name"); 
        hostName=sc.next();
        try ( 
 
            Socket echoSocket = new Socket(hostName, port); 
            PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true); 
            BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream())); 
            )  
        { 
            String userInput; 
            System.out.println("Client Started"); 
            System.out.println("Enter Exit to stop"); 
             
                long T0; 
                long serverTime; 
                long T1; 
                long finalTime;                 
                out.println(T0=System.currentTimeMillis()); 
                serverTime = Long.parseLong(in.readLine()); 
                T1 =System.currentTimeMillis(); 
                finalTime =  serverTime + (T1-T0)/2; 
                DateFormat formatter = new SimpleDateFormat("HH:mm:ss:SSS"); 
                System.out.println("Client Time: " + formatter.format(new Date(T1))); 
                System.out.println("Server Time: " + formatter.format(new Date(serverTime))); 
                System.out.println("Client Time after reset: " + formatter.format(new Date(finalTime))); 
                out.println("EXIT");
        }  
catch (UnknownHostException e)  
{ 
            System.err.println("Don't know about host " + hostName); 
            System.exit(1); 
}  
catch (IOException e)  
{ 
            System.err.println("Couldn't get I/O for the connection to " +hostName); 
            System.exit(1); 
        }  
    } 
 
} 