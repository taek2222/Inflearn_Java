package problem2;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if(itemCount == items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount++] = item;
    }

    public void displayItems() {
        int total = 0;

        System.out.println("장바구니 상품 출력");

        for(int i = 0; i < itemCount; i++) {
            int itemPrice = items[i].getTotalPrice();
            System.out.println("상품명:" + items[i].getName() + ", 합계:" + itemPrice);
            total += itemPrice;
        }

        System.out.println("전체 가격 합:" + total);
    }
}
