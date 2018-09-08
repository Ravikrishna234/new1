import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author :
 */
class Set {
    private int[] set;
    private int size;
public Set() {
	size = 0;
	final int len = 10;
	set = new int[len];
}
public int size(){
	return size;
}
public Set(int capacity) {
	set = new int[capacity];
	size = 0;
}
public boolean contains(int value) {
	for(int i = 0; i < size;i++) {
		if(set[i] == value) {
			return true;
		}
	}
	return false;
}
public String toString() {
	if(size == 0) {
		return "{}";
	}
		String str = "{";
		for(int i= 0;i < size - 1;i++) {
			str += set[i] + ", ";
		}
		str += set[size - 1] + "}";
		return str;
}
public void add(int element) {
	if(size == set.length) {
		resize(set.length);
	}
	if(contains(element) == false) {
		set[size++] = element;
	}
}
	// boolean flag = false;
	// for(int i = 0; i < set.length; i++) {
	// 	if(set[i] == element) {
	// 		flag = false;
	// 	}
	// 	else {
	// 		flag = true;
	// 	}
	// }
	// if(flag == true) {
	// 	set[size++] = element;
	// }
public void resize(int item) {
	set = Arrays.copyOf(set,item * 2);
}
public void add(int[] items) {
	if(size == set.length) {
		resize(set.length);
	}
	for(int i : items) {
		if(contains(i) == false) {
			set[size++] = i;
		}
	}
}
	// boolean flag = false;
	// for (int j : items) {
	// 	for(int i = 0; i < set.length;i++) {
	// 		if(set[i] == j) {
	// 			flag = false;
	// 		}else {
	// 			flag = true;
	// 		}

	// 		}
	// 		if(size == set.length) {
	// 			resize(set.length);
	// 		}
	// 		if(flag == true) {
	// 		set[size++] = j;
	// 	}
	public int get(int index) {
		return set[index];
	}
public Set intersection(Set t) {
	Set intersection = new Set();
	for(int i = 0; i < size; i++) {
		for(int j = 0; j < t.size(); j++) {
			if(set[i] == t.get(j)) {
				intersection.add(t.get(j));
			}

		}
	}
	return intersection;
}
public Set retainAll(int[] items) {
	Set retainAll = new Set();
	for (int i = 0; i < size; i++) {
		for(int j = 0; j < items.length; j++) {
			if(set[i] == items[j]) {
				retainAll.add(items[j]);
			}
		}
	}
	return retainAll;
	}
	public int[][] cartesianProduct(Set s) {
		int[][] a = new int[2][size];
		for(int i = 0; i < size; i++) {
			a[0][i] = set[i];
			a[0][1] = s.get(i);
		}
		return a;
	}
}
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }

    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
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
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}
