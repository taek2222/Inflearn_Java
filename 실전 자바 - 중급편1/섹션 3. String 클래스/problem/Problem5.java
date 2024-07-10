package problem;

public class Problem5 {
    public static void main(String[] args) {
        String ste = "hello.txt";
        String ext = ".txt";

        int i = ste.indexOf(ext);
        String substring = ste.substring(0, i);

        System.out.println("filename = " + substring);
        System.out.println("extName = " + ext);
    }
}
