package problem1;

public class Car {
    private String car;
    private static int carTotal;

    public Car(String car) {
        this.car = car;
        carTotal++;
        System.out.println("차량 구입, 이름: " + car);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + carTotal);
    }
}
