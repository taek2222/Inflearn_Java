package problem;

public class Problem10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] split = fruits.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        String join = String.join("->", split);
        System.out.println("joinedString = " + join);
    }
}
