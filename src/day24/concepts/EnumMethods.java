package day24.concepts;

public class EnumMethods {

    enum OrderStatus {
        PENDING,
        SHIPPED,
        DELIVERED,
        CANCELLED,
        RETURNED
    }

    public static void main(String[] args) {

        // Print all enum constants
        for (OrderStatus status : OrderStatus.values()) {
            System.out.println(status);
        }

        // Convert String to enum
        OrderStatus status = OrderStatus.valueOf("DELIVERED");
        System.out.println("Selected Status: " + status);

        // Get enum name and position
        System.out.println("Name: " + status.name());
        System.out.println("Position: " + status.ordinal());
    }
}
