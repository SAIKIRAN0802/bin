import java.io.*; 
import java.net.*; 
import java.util.*; 
public class clockserver  
{ 
    public static void main(String[] args) throws IOException 
 { 
    	Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter the port no"); 
        int port_number=sc.nextInt();
             
        try 
        ( 
            ServerSocket serverSocket = new ServerSocket(port_number); 
            Socket clientSocket = serverSocket.accept();     
            PrintWriter out =new PrintWriter(clientSocket.getOutputStream(), true);                    
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));    
        )  
        {	 
            String inputLine; 
            System.out.println("Server Started"); 
            while (true)  
            { 
                inputLine = in.readLine(); 
                if(inputLine.equalsIgnoreCase("Exit")) 
                { 
                     System.out.println("Exiting"); 
                     out.println("Server Exiting"); 
                     break; 
                } 
                out.println(System.currentTimeMillis()+5000); 
            } 
        }  
catch (IOException e) 
        { 
            System.out.println("Exception caught when trying to listen on port " 
                + port_number + " or listening for a connection"); 
            System.out.println(e.getMessage()); 
        } 
    } 
 
} 

