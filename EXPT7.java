import java.util.*;
class even implements Runnable
{
public int x;
public even(int x)
{
this.x = x;
}
public void run()
{
System.out.println("New Thread"+x+"is EVEN and square of"+x+"is:"+x*x);
}
}
class odd implements Runnable
{
public int x;
public odd(int x)
{
this.x = x;
}
public void run()
{
System.out.println("New Thread"+x+"is ODD and Cube of"+x+"is:"+x*x);
}
}
class A extends Thread
{
public void run()
{
int num = 0;
Random r = new Random();
try
{
for (int i=0; i<=5; i++)
{
num = r.nextInt(100);
System.out.println("Main Thread and Generate Number is "+ num);
if (num % 2 == 0)
{
Thread t1 = new Thread(new even(num));
t1.start();
}
else
{
Thread t2 = new Thread(new odd(num));
t2.start();
}
Thread.sleep(1000);
System.out.println("............................................");
}
}
catch (Exception ex)
{
System.out.println(ex.getMessage());
}
}
}
public class ThreadProgram
{
public static void main(String[] args)
{
A a = new A();
a.start();
}
}

OUTPUT: 

Main Thread and Generate Number is 0
New Thread0is EVEN and square of0is:0
............................................
Main Thread and Generate Number is 66
New Thread66is EVEN and square of66is:4356
............................................
Main Thread and Generate Number is 56
New Thread56is EVEN and square of56is:3136
............................................
Main Thread and Generate Number is 61
New Thread61is ODD and Cube of61is:3721
............................................
Main Thread and Generate Number is 82
New Thread82is EVEN and square of82is:6724
............................................
Main Thread and Generate Number is 13
New Thread13is ODD and Cube of13is:169
............................................