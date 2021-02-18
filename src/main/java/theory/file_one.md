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

**6) Difference between java.util.Date and java.sql.Date in Java?**
former contains both date and time while later contains only date part.

**7)  What is ClassLoader in Java?**
There is three default class loader used in Java, Bootstrap, Extension, and System or Application class loader.
1) Bootstrap ClassLoader - JRE/lib/rt.jar
2) Extension ClassLoader - JRE/lib/ext or any directory denoted by java.ext.dirs
3) Application ClassLoader - CLASSPATH environment variable, -classpath or -cp option, Class-Path attribute of Manifest 
   inside JAR file.

**8)When to use volatile variable in Java?**
volatile variable in Java is a special variable which is used to signal threads, a compiler that this particular variables 
value are going to be updated by multiple threads inside Java application. By making a variable volatile using the volatile 
keyword in Java, application programmer ensures that its value should always be read from main memory and thread should 
not use cached value of that variable from their own stack.

9)When to use a transient variable in Java?
when you want to make a variable non-serializable in a class, which implements the Serializable interface. In other words, 
you can use it for a variable whose value you don't want to save.

10)Difference between wait and sleep in Java?
The wait() method releases the lock or monitor, while sleep doesn't.

11)Difference between PATH and Classpath in Java?
PATH is used by the operating system while Classpath is used by JVM to locate Java binary, e.g. JAR files or Class files.

12)Difference between fail-safe and fail-fast iterators in Java?
fail-safe doesn't throw ConcurrentModificationException while fail-fast does whenever they detect an outside change 
on the underlying collection while iterating over it.

13)Difference between Comparator and Comparable in Java?
Comparator defines custom ordering while Comparable defines the natural order of objects, e.g. the alphabetic order
for String.

14)Difference between race condition and deadlock in Java?
both are errors that occur in a concurrent application, one occurs because of thread scheduling while others occur
because of poor coding.

15)What does System.gc() and Runtime.gc() methods do?
These methods can be used as a hint to the JVM, in order to start a garbage collection. However, this it is up to the 
Java Virtual Machine (JVM) to start the garbage collection immediately or later in time.

16)
Does Spring Bean provide thread safety?
The default scope of Spring bean is singleton, so there will be only one instance per context. That means that all the 
having a class level variable that any thread can update will lead to inconsistent data. Hence in default mode spring 
beans are not thread-safe.
However, we can change spring bean scope to request, prototype or session to achieve thread-safety at the cost of 
performance. It’s a design decision and based on the project requirements.

17)What do the ... dots in the method parameters mean?
That feature is called varargs, and it's a feature introduced in Java 5. It means that function can receive multiple 
String arguments:

18)








