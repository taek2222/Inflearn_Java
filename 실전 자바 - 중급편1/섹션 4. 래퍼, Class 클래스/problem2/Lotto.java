package problem2;

import java.util.Random;

public class Lotto{
    public static void main(String[] args) {
        int[] lottoNumber = new int[6];
        Random random = new Random();
        int count = 0;

        while (count != 6) {
            int number = random.nextInt(46);

            // 중복 검사
            if(!check(lottoNumber, number))
                continue;

            lottoNumber[count++] = number;
        }

        System.out.print("로또 번호:");

        for (int i : lottoNumber)
            System.out.print(" " + i);
    }

    private static boolean check(int[] lottoNumber, int number) {
        for (int i : lottoNumber)
            if(i == number)
                return false;
        return true;
    }

}
