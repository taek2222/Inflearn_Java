package problem2;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] array) {
        int total = 0;

        for(int number : array)
            total += number;

        return total;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];

        for(int number : array)
            if(min > number)
                min = number;

        return min;
    }

    public static int max(int[] array) {
        int max = array[0];

        for(int number : array)
            if(max < number)
                max = number;

        return max;
    }
}
