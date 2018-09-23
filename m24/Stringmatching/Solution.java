import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Map;

class Data {

    Data() {
    }

    public static String toText(final File file) {
        String s = "";
        try {
            Scanner input = new Scanner(new FileReader(file));
            StringBuilder text = new StringBuilder();
            while (input.hasNext()) {
                text.append(input.next());
                text.append(" ");
            }
            input.close();
            s = text.toString();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
        }
        return s;
    }

    public Map remove(final String text) {
        text.toLowerCase();
        text.replaceAll("[0-9_]", "");
        String[] words = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String element : words) {
         if (element.length() > 0) {
            if (!(map.containsKey(element))) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }
    }
        return map;
    }


    public double stringMatching(final String textOne, final String textTwo) {
        int lengthOne = textOne.length();
        int lengthTwo = textTwo.length();
        double totalLength = lengthOne + lengthTwo;
        int max = 0;
        double lcs = 0;
        final int hundred = 100;
        int[][] array = new int[lengthOne][lengthTwo];
        for (int i = 0; i < lengthOne; i++) {
            for (int j = 0; j < lengthTwo; j++) {
                if (textOne.charAt(i) == textTwo.charAt(j)) {
                    if (i == 0 || j == 0) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = array[i - 1][j - 1] + 1;
                    }
                    if (max < array[i][j]) {
                        max = array[i][j];
                    }
                }
            }
        }
        lcs = (((max * 2) / totalLength) * hundred);
        return lcs;
    }
}

public final class Solution {

    private Solution() {

    }

    public static void main(final String[] args) {
        try  {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        File files = new File(input);
        Data obj = new Data();
        File[] fileList = files.listFiles();
        int length = fileList.length;
        double maxValue = 0;
        final int hundred = 100;
        String result = "";
        double[][] fileMatrix = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    fileMatrix[i][j] = hundred;
                } else {
                    fileMatrix[i][j] = obj.stringMatching(
                        obj.toText(fileList[i]), obj.toText(fileList[j]));
                    if (maxValue < fileMatrix[i][j]) {
                        maxValue = fileMatrix[i][j];
                        result = "Maximum similarity is between "
                        + fileList[i].getName() + " and "
                        + fileList[j].getName();
                    }
                }
            }
        }
        System.out.print("      \t");
        for (int i = 0; i < length - 1; i++) {
            System.out.print("\t" + fileList[i].getName());
        }
        System.out.println("\t" + fileList[length - 1].getName());
        for (int i = 0; i < length; i++) {
            System.out.print(fileList[i].getName() + "\t");
            for (int j = 0; j < length; j++) {
        System.out.print(String.format("%.1f", fileMatrix[i][j]) + "\t\t");
            }
            System.out.println();
        }
     System.out.println(result);
    } catch (NoSuchElementException e) {
        System.out.println("Empty Directory");
    }
    }
}
