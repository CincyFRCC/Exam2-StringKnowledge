import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StringKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String 1 : ");
        String a = in.nextLine();
        System.out.print("Enter the String 2 : ");
        String b = in.nextLine();
        boolean result = endOther(a, b);

        System.out.println("Result: " + result);
        System.out.print("Enter a string to find repeats : ");
        String repeatsstr = in.nextLine();
        boolean repeats = findRepeats(repeatsstr);

        System.out.println("Result: " + repeats);
    }

    public static boolean endOther(String a, String b) {
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();
        return lowerA.endsWith(lowerB) || lowerB.endsWith(lowerA);
    }

    public static boolean findRepeats(String toTest) {
        int length = toTest.length();
        List<String> uniqueSubstrings = new ArrayList<>();
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 2; j <= length; j++) {
                String substring = toTest.substring(i, j);
                if (!uniqueSubstrings.contains(substring)) {
                    uniqueSubstrings.add(substring);
                } else {
                    return true;
                }
            }
        }
        return false;
    }

}