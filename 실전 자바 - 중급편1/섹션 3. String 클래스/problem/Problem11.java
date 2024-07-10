package problem;

public class Problem11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder sb = new StringBuilder().append(str).reverse();

        System.out.println(sb);
    }
}
