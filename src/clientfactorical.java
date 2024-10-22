 import java.net.*;
	import java.io.*;
	import java.util.*;
	
public class clientfactorical {
	
	public static void main(String args[]) throws IOException
	{
	Socket s=new Socket("localhost",5051);
	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	DataInputStream dis=new DataInputStream(s.getInputStream());

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=sc.nextInt();
	dos.writeUTF(n+"");
	String result=dis.readUTF();
	System.out.println("Result is "+result);
	}
	}

