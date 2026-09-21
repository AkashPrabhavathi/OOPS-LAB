import java.util.*;
public class ArrayListExample
{
public static void main (String args[])
{
ArrayList<String> obj1 = new ArrayList<String>();
obj1.add("Ajeet");
obj1.add("Harry");
obj1.add("Chaitanya");
obj1.add("Steve");
obj1.add("Anuj");
System.out.println("\n Currently the array list obj 1 has following elements:"+obj1);
obj1.add("Babu");
obj1.add("Kamal");
ArrayList<String> obj2 = new ArrayList<String>();
obj2.add("Alice");
obj2.add("Bob");
obj2.add("Raj");
obj1.addAll(obj2);
System.out.println("\n ArrayList obj1 after add All:"+obj1);
obj1.add(0, "Rahul");
obj1.add(1, "Justin");
System.out.println("\n ArrayList obj 1 after add element at the given index:"+obj1);
System.out.println("\nEnter the Search element:");
Scanner input = new Scanner(System.in);
String search = input.nextLine();
System.out.println("\n ArrayList obj1 contains the strib=ng"+search+":"+obj1.contains(search));
obj1.remove("Chaitanya");
obj1.remove("Harry");
System.out.println("\nCurrent array list obj 1 after removing elemet is:"+obj1);
obj1.remove(1);
System.out.println("\nCurrent array list of obj 1 after remon=ving alament through index is:"+obj1);
System.out.println("\nEnter the letter to display all the string start with given letter:");
search = input.nextLine();
ArrayList<String> obj3 = new ArrayList<String>();
for(int i=0;i<obj1.size();i++)
{
if(obj1.get(i).startsWith(search.toUpperCase()))
{
obj3.add(obj1.get(i));
}
}
if (obj3.size()>0)
{
System.out.println("\n ArrayList obj 1 contain all the string start with given"+search+":"+obj3);
}
else
{
System.out.println("\nNo Name Start with"+search+"letter in Arraylist obj 1");
}
}
}

OUTPUT:

Currently the array list obj 1 has following elements:[Ajeet, Harry, Chaitanya, Steve, Anuj]

ArrayList obj1 after add All:[Ajeet, Harry, Chaitanya, Steve, Anuj, Babu, Kamal, Alice, Bob, Raj]

ArrayList obj 1 after add element at the given index:[Rahul, Justin, Ajeet, Harry, Chaitanya, Steve, Anuj, Babu, Kamal, Alice, Bob, Raj]

Enter the Search element:
Babu

ArrayList obj1 contains the strib=ngBabu:true

Current array list obj1 after removing elemet is:[Rahul, Justin, Ajeet, Steve, Anuj, Babu, Kamal, Alice, Bob, Raj]

Current array list of obj1 after remon=ving alament through index is:[Rahul, Ajeet, Steve, Anuj, Babu, Kamal, Alice, Bob, Raj]

Enter the letter to display all the string start with given letter:
R

ArrayList obj1 contain all the string start with givenR:[Rahul, Raj]