import java.util.Scanner;
import java.io.File;
class handling
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter file path:");
String s = input.nextLine();
File f1 = new File(s);
System.out.println("File Name:"+f1.getName());
System.out.println("Path:" +f1.getPath());
System.out.println("Absoute Path: "+f1.getAbsolutePath());
System.out.println("Parent:" +f1.getParent());
System.out.println("This file is:"+(f1.exists() ?"Exits": "Does not exits"));
System.out.println("Is file:" +f1.isFile());
System.out.println("Is Directory:" +f1.isDirectory());
System.out.println("Is Readable:" +f1.canRead());
System.out.println("Is Writable:" +f1.canWrite());
System.out.println("Is Absolute:" +f1.isAbsolute());
System.out.println("File Last Modified:" +f1.lastModified());
System.out.println("File Size:" +f1.length()+"bytes");
System.out.println("Is Hidden:" +f1.isHidden());
}
}

OUTPUT:

Enter file path:Fibonacci.java
File Name:Fibonacci.java
Path:Fibonacci.java
Absoute Path: /home/ailab32/Desktop/Akash IT/Fibonacci.java
Parent:null
This file is:Does not exits
Is file:false
Is Directory:false
Is Readable:false
Is Writable:false
Is Absolute:false
File Last Modified:0
File Size:0bytes
Is Hidden:false
