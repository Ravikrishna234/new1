import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 *class for sorted set.
 */
class InvalidException extends Exception {
	/**
	 * @param s value
	 */
	InvalidException(final String s) {
		super(s);
	}
}
class EmptyException extends Exception {
	/**
	 * @param s value
	 */
	EmptyException(final String s) {
		super(s);
	}
}
class SortedSet extends Set {
    /**
     * sort method.
     * @param      array  The array
     */
    public void sort(final int[] array) {
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    /**
     * resize method.
     */
    private void resize() {
        //int[] list1 = new list1[2*size]
        //java.lang.System.arraycopy(list, 0, list1, 0, size);
        //list = list1;
        set = Arrays.copyOf(set, 2 * size);
    }
    /**
     * add method.
     * @param      item  The item
     */
    public void add(final int item) {
    	if (size == set.length) {
    		resize();
    	}
        if (!contains(item)) {
            set[size++] = item;
        }
        sort(set);
    }
    /**
     * subSet method.
     * @param      fromElement  The from element
     * @param      toElement    To element
     * @return     { description_of_the_return_value }
     */
    public int[] subSet(final int fromElement, final int toElement) throws InvalidException{
        if (fromElement > toElement) {
            throw new InvalidException("Invalid arguments to subSet Exception");
        }
        int[] result = new int[size];
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (set[i] >= fromElement) {
                for (int j = i; j < size; j++) {
                    if (set[j] < toElement) {
                        result[k++] = set[i];
                    }
                    break;
                }
            }
        }
        return Arrays.copyOf(result, k);
    }
    /**
     * headSet method.
     * @param      toElement  To element
     * @return     { description_of_the_return_value }
     */
    public int[] headSet(final int toElement) {
        int[] result = new int[size];
        int tmp = 0;
        for (int i = 0; i < size; i++) {
            if (set[i] < toElement) {
                result[i] = set[i];
                tmp++;
            }
        }

        return Arrays.copyOf(result,tmp);
    }
    /**
     * last method.
     * @return     { description_of_the_return_value }
     */
    public int last() throws EmptyException {
        if (size == 0) {
            throw new EmptyException("Set Empty Exception");
        }
        return set[size - 1];
    }
    /**
     * Adds all.
     * @param      ele   The ele
     */
    public void addAll(final int[] ele) {
        for (int i : ele) {
            this.add(i);
        }
    }
}
/**
 * Solution class.
 */
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
        SortedSet s = new SortedSet();
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
                s = new SortedSet();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
            case "retainAll":
                s = new SortedSet();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
            case "cartesianProduct":
                s = new SortedSet();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
            case "subSet":
            	try {
                if (tokens.length != 2) {
                    break;
                }
                String[] arrstring3 = tokens[1].split(",");
                int[] object = s.subSet(Integer.parseInt(arrstring3[0]),
                                        Integer.parseInt(arrstring3[1]));
                if (object != null) {
                    System.out.println(Arrays.toString(object).replace("[",
                        "{").replace("]", "}"));
                }
            }
            catch (Exception e) {
            	System.out.println("Invalid Arguments to subSet Exception");
            }
            break;
            case "headSet":
                if (tokens.length != 2) {
                    break;
                }
                int[] obj = s.headSet(Integer.parseInt(tokens[1]));
                if (obj != null) {
                    System.out.println(Arrays.toString(obj).replace("[",
                        "{").replace("]", "}"));
                }
                break;
            case "last":
            	try {
                if (tokens.length != 1) {
                    break;
                }
                int temp = s.last();
                System.out.println(temp);
            } catch (Exception e) {
            	System.out.println("Set Empty Exception");
                break;
            }
            case "addAll":
                if (tokens.length == 2) {
                	String[] t1 = tokens[1].split(",");
                	int[] temp = new int[t1.length];
                	for (int i = 0; i < temp.length; i++) {
                		temp[i] = Integer.parseInt(t1[i]);
                	}
                	s.addAll(temp);
                }
                break;
            default:
                break;
            }
        }
    }
}

