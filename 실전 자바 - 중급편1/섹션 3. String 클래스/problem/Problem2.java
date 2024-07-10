package problem;

public class Problem2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int lengthTotal = 0;

        for (String s : arr) {
            System.out.println(s + ":" + s.length());
            lengthTotal += s.length();
        }

        System.out.println("sum = " + lengthTotal);
    }
}
