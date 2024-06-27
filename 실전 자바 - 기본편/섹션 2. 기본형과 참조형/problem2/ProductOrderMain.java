package problem2;

import java.util.Scanner;

public class ProductOrderMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int arraySize = scanner.nextInt();

        ProductOrder[] orders = new ProductOrder[arraySize];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.next();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);

        System.out.println("총 결제 금액: " + getTotalAmount(orders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for(ProductOrder productOrder : orders)
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;

        for(ProductOrder productOrder : orders)
            total += productOrder.price * productOrder.quantity;

        return total;
    }
}
