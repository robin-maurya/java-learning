package day24.concepts;

public class EnumWithFields {

    enum OrderStatus {
        PENDING("Waiting for processing"),
        SHIPPED("Order is on the way"),
        DELIVERED("Order delivered successfully"),
        CANCELLED("Order has been cancelled");

        private final String description;

        OrderStatus(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {

        OrderStatus status = OrderStatus.DELIVERED;

        System.out.println("Status: " + status);
        System.out.println("Description: " + status.getDescription());
    }
}
