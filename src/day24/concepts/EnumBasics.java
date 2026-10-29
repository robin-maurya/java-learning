package day24.concepts;

public class EnumBasics {

    enum OrderStatus {
        PENDING,
        SHIPPED,
        DELIVERED,
        CANCELLED,
        RETURNED
    }

    public static void main(String[] args) {

//        OrderStatus status = OrderStatus.SHIPPED;

        OrderStatus status = OrderStatus.RETURNED;

        System.out.println("Order Status: " + status);
        System.out.println("Is delivered? "
                + (status == OrderStatus.DELIVERED));
    }
}
