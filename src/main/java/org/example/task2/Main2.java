package org.example.task2;

public class Main2 {
    public static void main(String[] args) {
        Cart cart = new Cart(10);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));

        System.out.println(cart);

        cart.removeById(2);

        System.out.println(cart);

        Order order = new Order(1, "John Doe");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);
    }
}
