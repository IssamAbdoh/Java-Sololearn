import java.io.*;
import java.util.*;

public class Solution
{
    static int DivideStudentsintoTeams(int n, int d, int[] scores)
    {
        Arrays.sort(scores);//sorting an array
        //Collections.sort(scores); sorting a list
        int i=0,j=0,ans=1;
        while(i<n&&j<n)
        {
            if(Math.abs(scores[i]-scores[j])<=d)
            {
                j++;
            }
            else
            {
                ans++;
                i=j;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Exception
    {
        //System.out.println(DivideStudentsintoTeams(8,2,new int[]{5 ,2, 11, 6 ,9, 7, 12 ,4}));
        {
            /*
            try {
                int a[ ] = new int[2];
                System.out.println(a[5]);
            } catch (Exception e) {
                System.out.println("An error occurred");
            }
            */
        }

        {
            //The throw keyword allows you to manually generate exceptions from your methods.
            //System.out.println(div(42, 0));
            /*
                All catch blocks should be ordered from most specific to most general.
                Following the specific exceptions, you can use the Exception type to handle all other exceptions as the last catch.
             */
        }

        {
            /*
            There are two ways to create a thread.
            1. Extend the Thread class
            Inherit from the Thread class, override its run() method, and write the functionality of the thread in the run() method.
            Then you create a new object of your class and call it's start method to run the thread.
            */
            Loader obj = new Loader();
            obj.start();
            //When we create the obj object and call its start() method,
            //the run() method statements execute on a different thread.
            /*
            Every Java thread is prioritized to help the operating system determine the order in
            which to schedule threads. The priorities range from 1 to 10, with each thread defaulting to
            priority 5. You can set the thread priority with the setPriority() method.
            */
        }

        {
            /*
            The other way of creating Threads is implementing the Runnable interface.
            Implement the run() method. Then, create a new Thread object, pass the Runnable class to its constructor
            , and start the Thread by calling the start() method.
             */
            Thread t = new Thread(new Loader());
            t.start();
            /*
            The Thread.sleep() method pauses a Thread for a specified period of time.
            For example, calling Thread.sleep(1000); pauses the thread for one second.
            Keep in mind that Thread.sleep() throws an InterruptedException, so be sure to surround
            it with a try/catch block.
            */
            /*
            It may seem that implementing the Runnable interface is a bit
            more complex than extending from the Thread class. However, implementing the Runnable
            interface is the preferred way to start a Thread, because it enables you to extend
            from another class, as well.
            */
        }

        {
            /*
            There are two exception types, checked and unchecked (also called runtime).
            The main difference is that checked exceptions are checked when compiled,
            while unchecked exceptions are checked at runtime.
            As mentioned in our previous lesson, Thread.sleep() throws an InterruptedException.
            This is an example of a checked exception. Your code will not compile until you've handled the exception.
            */
            //checked  exceptions, which are checked at compiled :
            //Thread.sleep(1000);//uncomment this line

            //unchecked exceptions, which are checked at runtime
            int value = 7;
            //value = value / 0;

        }

        {
            ArrayList colors = new ArrayList();

            //You can optionally specify a capacity and type of objects the ArrayList will hold :
            ArrayList<String> colors2 = new ArrayList<String>(10);
            /*
            ArrayLists store objects. Thus, the type specified must be a class type.
            You cannot pass, for example, int as the objects' type.
            Instead, use the special class types that correspond to the desired value type, such as Integer for int, Double for double, and so on.
            */
            /*
            Other useful methods include the following:
            - contains(): Returns true if the list contains the specified element
            - get(int index): Returns the element at the specified position in the list
            - size(): Returns the number of elements in the list
            - clear(): Removes all of the elements from the list
            */
            colors.add("Red");
            colors.add("Blue");
            colors.add("Green");
            colors.add("Orange");
            colors.remove("Green");

            System.out.println(colors);
            //System.out.println(colors[1]); is error
            System.out.println(colors.get(1));//is a legal move
        }

        {
            LinkedList<String> c = new LinkedList<String>();//You cannot specify an initial capacity for the LinkedList.
            c.add("Red");
            c.add("Blue");
            c.add("Green");
            c.add("Orange");
            c.remove("Green");
            System.out.println(c);
            /*
            Summary:
            - Use an ArrayList when you need rapid access to your data.
            - Use a LinkedList when you need to make a large number of inserts and/or deletes.
            */
            for(String s: c) {
                System.out.println(s);
            }
        }

        {
            /*
            HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value).
            The put, remove, and get methods are used to add, delete, and access values in the HashMap.
            */

            HashMap<String, Integer> points = new HashMap<String, Integer>();
            points.put("Amy", 154);
            points.put("Dave", 42);
            points.put("Rob", 733);
            System.out.println(points.get("Dave"));
            /*
            A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.
            The HashMap class provides containsKey and containsValue methods that determine the presence of a specified key or value.
            If you try to get a value that is not present in your map, it returns the value of null.
            */
        }

        {
            /*
            A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
            One of the implementations of the Set is the HashSet class.
            */

            HashSet<String> set = new HashSet<String>();
            set.add("A");
            set.add("C");
            set.add("B");
            System.out.println(set);

            //You can use the size() method to get the number of elements in the HashSet.

            /*
            The HashSet class does not automatically retain the order of the elements as they're added.
            To order the elements, use a LinkedHashSet, which maintains a linked list of the set's elements in the order in which they were inserted.
             */
            /*
            What is hashing?
                A hash table stores information through a mechanism called hashing, in which a key's informational content is used to determine a unique value called a hash code.
            So, basically, each element in the HashSet is associated with its unique hash code.
            */
        }

        {
            ArrayList<String> animals = new ArrayList<String>();
            animals.add("tiger");
            animals.add("cat");
            animals.add("snake");
            animals.add("dog");
            Collections.sort(animals);
            System.out.println(animals);

            ArrayList<Integer> nums = new ArrayList<Integer>();
            nums.add(3);
            nums.add(36);
            nums.add(73);
            nums.add(40);
            nums.add(1);
            Collections.sort(nums);
            System.out.println(nums);

            /*
            Other useful methods in the Collections class:
            max(Collection c): Returns the maximum element in c as determined by natural ordering.
                min(Collection c): Returns the minimum element in c as determined by natural ordering.
                reverse(List list): Reverses the sequence in list.
                shuffle(List list): Shuffles (i.e., randomizes) the elements in list.
            */
        }

        {
            LinkedList<String> animals = new LinkedList<String>();
            animals.add("fox");
            animals.add("cat");
            animals.add("dog");
            animals.add("rabbit");

            {
                Iterator<String> it = animals.iterator();
                String value = it.next();
                System.out.println(value);
            }
            /*
            The Iterator class provides the following methods:
            hasNext(): Returns true if there is at least one more element; otherwise, it returns false.
                next(): Returns the next object and advances the iterator.
            remove(): Removes the last object that was returned by next from the collection.
            it.next() returns the first element in the list and then moves the iterator on to the next element.
                Each time you call it.next(), the iterator moves to the next element of the list.
            */
            animals.add("fox");
            animals.add("cat");
            animals.add("dog");
            animals.add("rabbit");

            {
                Iterator<String> it = animals.iterator();
                while(it.hasNext())
                {
                    String value = it.next();
                    System.out.println(value);
                }
            }
        }

        {
            //File x = new File("C:\\sololearn\\test.txt");
            File x = new File("test.txt");
            if(x.exists()) {
                System.out.println(x.getName() +  "exists!");
            }
            else {
                System.out.println("The file does not exist");
            }
            /*
            The getName() method returns the name of the file.
                Note that we used double backslashes in the path, as one backslash should be escaped in the path String.
            */
        }

        {
            /*
            The constructor of the Scanner class can take a File object as input.
            To read the contents of a text file at the path "C:\\sololearn\\test.txt", we would need to create a File object with the corresponding path and pass it to the Scanner object.
            */
            /*
            The Scanner class inherits from the Iterator, so it behaves like one.
            We can use the Scanner object's next() method to read the file's contents.
            The file's contents are output word by word, because the next() method returns each word separately.
            It is always good practice to close a file when finished working with it. One way to do this is to use the Scanner's close() method.
            */
            try {
                //File x = new File("C:\\sololearn\\test.txt");
                File x = new File("test.txt");
                Scanner sc = new Scanner(x);
                while(sc.hasNext()) {
                    System.out.println(sc.next());
                }
                sc.close();

            }
            catch (FileNotFoundException e) {
                System.out.println("Error");

            }
        }

        {
            /*
            Formatter, another useful class in the java.util package, is used to create content and write it to files.
            Again, you need to surround the code with a try/catch block, as the operation can fail.
            */
            try {
                //Formatter f = new Formatter("C:\\sololearn\\test.txt");
                Formatter f = new Formatter("test.txt");
                f.format("%s %s %s", "1","John", "Smith \r\n");
                f.format("%s %s %s", "2","Amy", "Brown");
                f.close();

                File x = new File("test.txt");
                Scanner sc = new Scanner(x);
                while(sc.hasNext()) {
                    System.out.println(sc.next());
                }
                sc.close();
                /*
                the format %s %s %s denotes three strings that are separated with spaces.
                Note: \r\n is the newline symbol in Windows.
                */
            } catch (Exception e) {
                System.out.println("Error");
            }

        }
    }

    /*
        The throws statement in the method definition defines the type of Exception(s) the method can throw.
        Next, the throw keyword throws the corresponding exception, along with a custom message.
        Multiple exceptions can be defined in the throws statement using a comma-separated list.
     */
    static int div(int a, int b) throws ArithmeticException
    {
        if(b == 0)
        {
            throw new ArithmeticException("Division by Zero");
        }
        else
        {
            return a / b;
        }
    }
}
