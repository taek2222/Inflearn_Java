package problem;

public class Problem6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int totalCount = 0;
        int index = str.indexOf(key);
        while(index >= 0) {
            index = str.indexOf(key, index + 1);
            totalCount++;
        }

        System.out.println("count = " + totalCount);
    }
}
