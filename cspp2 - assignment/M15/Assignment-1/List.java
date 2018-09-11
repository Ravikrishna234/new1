import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 * main class.
 */
class InvalidException extends Exception {
    InvalidException(String s) {
        super(s);
    }
}
class IndexException extends Exception {
    IndexException(String s) {
        super(s);
    }
}
public class List {
    //Implement all the methods mentioned to build a ListADT

    /*
     * The goal for the list is to store items.
     * How are we going to store the items in the list?
     * An array would be good. Right?
     * So, assume we are only going to have ints in the list
     * We need to create an array of ints to store the items
     * added to the list.
     *
     * Create a variable of the type int[]
     * Use the private access specifier
     * Why private access specifier and why not public?
     * Well, we don't want the array to be manipulated by
     * methods that are outside the List class.
     * If you allow methods outside the List class to manipulate
     * the array then there is a possibility of having a corrupted
     * list i.e., a list with incorrect items.
     * This is not desirable and so having private access specifer
     * will protect the array such corruption.
     * This is a hard concept to understand. Discuss with your mentor.
     *
    */

    // declare a private int[]
    // don't create the array yet using new
    // that's the job of the List constructor
    /**
     * array list.
     */
    private int[] list;
    /*
     * What are the other class variables needed for creating a list?
     * How about keeping track of the size of the list?
     * If you add 2 items to the list then the size should be 2.
     * Let's think about the size of the list by comparing it to the
     * length of the array. Do they mean the same?
     * No, Array length signifies the maximum number of items
     * you can store in the list. Whereas, the size of the list
     * denotes the number of items in the list. Makes sense?
     * Here is an example:
     * array = [1,2,3,0,0,0,0,0,0,0]
     * The length of the array is 10 and size is 3.
     * This means you can store 10 items in the list and
     * currently it has 3 items.
     * So, to keep track of the size we need a variable called size
     * Again, we use private as we don't want that size variable
     * to be accessed by the methods that are outside of the List class.
     *
     */

    // declare a private int size
    // again, don't initialize it here
    // variable initialization should be done in the constructor
    /**
     * size declaration.
     */
    private int size;
    /*
     * The purpose of the constructor is to initialize the
     * class variables with some default values.
     */
    /**
     * constructor.
     */
    public List() {

        // what are the two variables to be initialized here?
        // think about the private variables described above.
        // What should be the default values?
        // In the case of the list, it should be empty but
        // it should be initialized with an array size like 10
        final int ten = 10;
        list = new int[ten];

        // Think about the initial value for size.
        // How many items do we have in the list when you create it?
        // An empty list has how many items?
        // That is the initial value to use for size.
        size = 0;
    }

    /*
     * Overloaded constructor with list capacity as argument
     * The default constructor sets the list capacity to 10
     * So, adding an item when the list size is 10
     * raises a Index Out of Bounds Exception
     * There will be some clients of the ADT that will require
     * the list to contain n elements which is known
     * at the time of creating the list.
     *
     * The overloaded constructor is a way to initialize a list with
     * a list capacity of n items where n is given as an argument to
     * constructor.
     *
     */
    /**
     * @param capacity to give specific size.
     */
    public List(final int capacity) {
        size = 0;
        list = new int[capacity];
    }
    /*
     * The add method does what the name suggests.
     * Add an int item to the list.
     * The assumption is to store the item at the end of the list
     * What is the end of the list?
     * Is it the same as the end of the array?
     * Think about how you can use the size variable to add item
     * to the list.
     *
     * The method returns void (nothing)
     */
    /**
     * @param item [description]
     */
    public void add(final int item) {
        //Inserts the specified element at the end of the zelist.
        if (size == list.length) {
            resize();
        }
        list[size++] = item;
    }
    /**
     * @return [size]
     */
    public int size() {
        return size;
    }
    /**
     * @param index [description]
     */
    public void remove(final int index) throws InvalidException {
        // write the logic for remove here.
        // Think about what to do to the size variable.
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                list[i] = list[i + 1];
            }
            size--;
        } else {
                throw new InvalidException("Invalid Position Exception");
        }
      }
    /**
     * @param index [description]
     * @return [value at that index]
     */
    public int get(final int index) {
        if (index < 0 || index >= size) {
            return -1;
        } else {
            return list[index];
        }
    }
    /**
     * @param start value
     * @param end value
     * @return ls
     */
    public List subList(final int start,final int end) throws IndexException {
    if (start <= -1 || end <= -1 || start > end || end < start || size == 0) {
            throw new IndexException("Index Out of Bounds Exception");
    }
    List ls = new List(end - start);
    for (int i = start; i < end; i++) {
        ls.add(list[i]);
    }
    return ls;
    }
    /**
     * resize method.
     */
    private void resize() {
        //int[] list1 = new list1[2*size]
        //java.lang.System.arraycopy(list, 0, list1, 0, size);
        //list = list1;
        list = Arrays.copyOf(list, 2 * size);
    }
    /**
     * @return [string]
     */
    public String toString() {
        //System.out.println("size" + size);
        if (size == 0) {
            return "[]";
        }
        String str = "[";
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            str = str + list[i] + ",";
        }
        str = str + list[i] + "]";
        return str;
    }

    /*
     * Contains return true if the list has
     * the item passed as an argument to the method
     * So, iterate through the list and return true if
     * the item exists and otherwise false
     */
    /**
     * @param item [description]
     * @return [boolean value]
     */
    public boolean contains(final int item) {
        return indexOf(item) == -1;
    }
    /**
     * @param item [description]
     * @return [index of value]
     */
    public int indexOf(final int item) {
        for (int i = 0; i < size; i++) {
            if (item == list[i]) {
                return i;
            }
        }
        return -1;
    }
    /**
     * @param items [description]
     */
    public void addAll(final int[] items) {
        if (size == list.length) {
            resize();
        }
        for (int i = 0; i < items.length; i++) {
            list[size] = items[i];
            size++;
        }
    }
    /**
     * @param list1 [description]
     * @return [description]
     */
    public boolean equals(final List list1) {
    //this.toString.equals(list1.toString()); /*calls tostring*/
    if (this.size != list1.size) {
        return false;
    }
    for (int i = 0; i < this.size; i++) {
        if (list[i] != list1.list[i]) {
            return false;
        }
        }
        return true;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     */
    public void clear () {
        size = 0;
    }
    /*
       Inserts the specified element at the specified index
    by moving all the elements to the right.
           The method returns void (nothing)
        */
    /**
     * @param index [description]
     * @param item [description]
     */
    public void add(final int index, final int item) {
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }
    /* Returns the count of occurances of a given item in the list*/
    /**
     * @param item [description]
     * @return [integer]
     */
    public int count(final int item) {
        int count1 = 0;
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                count1 += 1;
            }
        }
        return count1;
    }
    /**
     * @param items values
     */
    public void removeAll(final int[] items) throws InvalidException {
        if (items.length > 0) {
        for (int c : items) {
            for (int i = 0; i < size; i++) {
                if (list[i] == c) {
                    remove(i);
                }
            }
        }
    } else {
        throw new InvalidException("Invalid Position Exception");
    }
    }
    /**
     * @param args [description]
     */
    public static void main(final String[] args) {
        // create an object of the list to invoke methods on it
        List l = new List();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "add":
                if ((tokens.length) == 2) {
                    String[] t = tokens[1].split(",");
                    if (t.length == 1) {
                        l.add(Integer.parseInt(tokens[1]));
                    } else {
                        if (t.length > 1) {
                        l.add(Integer.parseInt(t[0]), Integer.parseInt(t[1]));
                        }
                    }
                }
                break;
            case "count":
                System.out.println(l.count(Integer.parseInt(tokens[1])));
                break;
            case "addAll":
                if (tokens.length == 2) {
                    String[] t1 = tokens[1].split(",");
                    int[] temp = new int[t1.length];
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = Integer.parseInt(t1[i]);
                    }
                    l.addAll(temp);
                }
                break;
            case "size":
                // invoke size method and print the list size
                // BTW, list size is not the array size
                // it is the number of items in the list
                System.out.println(l.size());
                break;
            case "print":
                // print the list (implement toString for this to work)
                // expected format is [item-1,item-2,...,item-n]
                // review the output testcase file
                System.out.println(l);
                break;
            case "remove":
                    try {
                l.remove(Integer.parseInt(tokens[1]));
            }
            catch(Exception e) {
                System.out.println("Invalid Position Exception");
            }
                break;
            case "indexOf":
                System.out.println(l.indexOf(Integer.parseInt(tokens[1])));
                break;
            case "get":
                System.out.println(l.get(Integer.parseInt(tokens[1])));
                break;
            case "contains":
                System.out.println(l.contains(Integer.parseInt(tokens[1])));
                break;
            case "subList":
                    try {
                    if (tokens.length != 2) {
                        break;
                    }
                    String[] arrstring3 = tokens[1].split(",");
                    List object = l.subList(Integer.parseInt(arrstring3[0]),
                            Integer.parseInt(arrstring3[1]));
                    if (object != null) {
                        System.out.println(object);
                    }
                }
                catch(Exception e) {
                        System.out.println("Index Out of Bounds Exception");

                }
                break;
            case "clear":
                l.clear();
                break;
            case "equals":
                if (tokens.length == 2) {
                    String[] lt = tokens[1].split(",");
                        List l2 = new List();
                for (int i = 0; i < lt.length; i++) {
                    l2.add(Integer.parseInt(lt[i]));
                }
                System.out.println(l.equals(l2));
            }
                break;
            case "removeAll":
                try {
                if (tokens.length == 2) {
                    String[] t2 = tokens[1].split(",");
                    int[] a = new int[t2.length];
                    for (int i = 0; i < t2.length; i++) {
                        a[i] = Integer.parseInt(t2[i]);
                    }
                    l.removeAll(a);

                }
            }
            catch(Exception e) {
                    System.out.println("Invalid Position Exception");
            }
            default:
            break;
            }
        }

    }
}

