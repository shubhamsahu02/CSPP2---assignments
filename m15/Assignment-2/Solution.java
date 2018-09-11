import java.util.Scanner;
import java.io.BufferedInputStream;
import java.util.Arrays;

class InvalidSubsetSelectionException extends Exception {

    InvalidSubsetSelectionException(final String s) {
        super(s);
    }
}

/**
 * Exception for signaling set empty errors.
 */
class SetEmptyException extends Exception {
    /**
     * Constructs the object.
     *
     * @param      s     { parameter_description }
     **/
    SetEmptyException(final String s) {
        super(s);
    }
}
/**
 * Class for sortedset.
 */
class Sortedset extends Set {
    public int[] subSet(final int fromElement, final int toElement) {
        try {
        if (fromElement > toElement) {
            // System.out.println("Invalid Arguments to Subset Exception");
            throw new InvalidSubsetSelectionException("");
            // return null;
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
        } catch (InvalidSubsetSelectionException ia) {
            System.out.println("Invalid Arguments to Subset Exception");
        }
        return null;
    }
    /**
     * function_description.
     *
     * @param      toElement  To element
     *
     * @return     { description_of_the_return_value }
     */
    public int[] headSet(final int toElement) {
        try {
            int[] result = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (set[i] < toElement) {
                result[i] = set[i];
                count++;
            }
        }
        if (count != 0) {
            return Arrays.copyOf(result, count);
        } else {
            throw new SetEmptyException("");
        }
        } catch (SetEmptyException se) {
            System.out.println("Set Empty Exception");
        }
        return null;
    }
    /**
     * function_description.
     *
     * @return     { description_of_the_return_value }
     *
     * @throws     SetEmptyException  { exception_description }
     */
    public int last() throws SetEmptyException {
        if (size == 0) {
            // System.out.println("Set Empty Exception");
            throw new SetEmptyException("Set Empty Exception");
            // return -1;
        } else {
            return set[size - 1];
        }
        // return 0;
    }
    /**
     * Adds all.
     *
     * @param      item  The item
     **/
    public void addAll(final int[] item) {
            for (int i:item) {
                this.add(i);
        }
    }
    /**
     * .function_description.
     *
     * @param      arr   The arr
     **/
    public void sort(final int[] arr) {
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    /**
     * add method.
     * @param      item  The item
     **/
    public void add(final int item) {
        if (!contains(item)) {
            set[size++] = item;
        }
        sort(set);
    }
}
/**
 * Class for solution.
 **/
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * function_description.
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
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
     * function_description.
     *
     * @param      args  The arguments
     **/
    public static void main(final String[] args) {
        Sortedset s = new Sortedset();
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
         while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "subSet":
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
                if (tokens.length != 1) {
                    break;
                }
                try {
                int temp = s.last();
                System.out.println(temp);
                } catch (SetEmptyException se) {
                    System.out.println(se.getMessage());
                }
                break;
                case "addAll":
                int[] intArr = intArray(tokens[1]);
                if (intArr.length == 1) {
                    s.add(intArr[0]);
                } else {
                    s.add(intArr);
                }
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "print":
                System.out.println(s);
                break;
                case "intersection":
                s = new Sortedset();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Sortedset();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Sortedset();
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
