**1) Difference between noclassdeffounderror and classnotfoundexception?**

As per my experience java.lang.NoClassDefFoundError occurs when a particular class was present 
during Compile time but not available during run time by any reason, while 
java.lang.ClassNotFoundException comes when class loaded explicitly during runtime.

**2) When a singleton is not singleton in Java?**

Many cases like Serialization, RMI, Clasloader loading multiple instance etc.

**3) Why equals() method must be compatible with compareTo in java ?**
compareTo method in Java must be compatible with equals method in Java i.e. if two objects are equal via equals method 
compareTo method must return “0” for them, failing this may result in some subtle bug when you store those objects in 
collection class like arraylist in java.  check here for detailed answer
Otherwise some set e.g. TreeSet and TreeMap which uses compareTo will not able to detect duplicates and allow duplicate 
inside set.

**4) Explain race condition in Java hashmap ?**
Race conditions in Java are always tricky to find and solve. Not many people know about it that hashmap could run into 
race condition if it would be modified by two threads simultaneous and one thread tries to re-siz or rehash the map 
because of capacity crossing threshold value. Since hashmap maintains a linked list of element in bucket and while 
copying from one hashmap to other or old to new order of linked list got reversed, which could result in infinite loop  
if two threads are doing resizing at same time?

**5) How to detect memory leak in Java.**
This is the most tricky Java interview question, there is no sure sort answer but you can use profile and memory dump to 
find memory leak in Java. JConsole can also help to provide graph of memory usage which can show pattern for memory leak.

String s1 = "abc";
String s2 = "abc";
String s3= new String("abc");
System.out.println("s1 == s2 ? "+(s1==s2)); //true
System.out.println("s1 == s3 ? "+(s1==s3)); //false
System.out.println("s1 equals s3 ? "+(s1.equals(s3))); //true


