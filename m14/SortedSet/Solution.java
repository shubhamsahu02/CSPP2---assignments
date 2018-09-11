import java.util.Scanner;
import java.io.BufferedInputStream;
import java.util.Arrays;
/**
 *Class for sortedset.
 */
class Sortedset extends Set {
    /**
     * function_description.
     *
     * @param      fromElement  The from element
     * @param      toElement    To element
     *
     * @return     { description_of_the_return_value }
     */
    public int[] subSet(final int fromElement, final int toElement) {
        if (fromElement > toElement) {
            System.out.println("Invalid Arguments to Subset Exception");
            return null;
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
     * @brief [brief description]
     * @details [long description]
     * @param toElement [description]
     * @return [description]
     */
    public int[] headSet(final int toElement) {
        int[] result = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (set[i] < toElement) {
                result[i] = set[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * @return [description]
     */
    public int last() {
        if (size == 0) {
            System.out.println("Set Empty Exception");
            return -1;
        }
        return set[size - 1];
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * @param item [description]
     */
    public void addAll(final int[] item) {
            for (int i:item) {
                this.add(i);
        }
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * @param arr [description]
     */
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
 * @brief [brief description]
 * @details [long description]
 * @param item [description]
 */
    public void add(final int item) {
        if (!contains(item)) {
            set[size++] = item;
        }
        sort(set);
    }
}
/**
 * @brief [brief description]
 * @details [long description]
 * @return [description]
 */
final class Solution {
/**
 * @brief [brief description]
 * @details [long description]
 * @return [description]
 */
    private Solution() { }
/**
 * @brief [brief description]
 * @details [long description]
 * @param s [description]
 * @return [description]
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
 * @brief [brief description]
 * @details [long description]
 * @param args [description]
 */
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
                int temp = s.last();
                System.out.println(temp);
                break;
                case "addAll":
                int[] intArr = intArray(tokens[1]);
                if (intArr.length == 1) {
                    s.add(intArr[0]);
                } else {
                    s.add(intArr);
                }
                break;
                case "print":
                System.out.println(s);
                break;
                default:
                break;
            }
        }
    }
}
