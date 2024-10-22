import java.net.*;
	import java.io.*;

public class Serverfactorical {
	

	
	public static void main(String args[]) throws IOException
	{
	ServerSocket ss=new ServerSocket(5051);
	Socket s=ss.accept();
	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	DataInputStream dis=new DataInputStream(s.getInputStream());

	String data=dis.readUTF();
	int n =Integer.parseInt(data);
	
	int result=1;
		for(int i=1; i <= n; i++) 
		 result = i*result;
		dos.writeUTF(result+"");

		}
	
	
	
	}
	

