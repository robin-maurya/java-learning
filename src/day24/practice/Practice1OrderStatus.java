package day24.practice;

public class Practice1OrderStatus {

    enum OrderStatus {
        PENDING,
        SHIPPED,
        DELIVERED,
        CANCELLED
    }

    public static void main(String[] args){
        OrderStatus status = OrderStatus.SHIPPED;

        switch (status) {
            case PENDING:
                System.out.println("Order Status: " + status);
                System.out.println("Order is waiting for processing");
                break;

            case SHIPPED:
                System.out.println("Order Status: " + status);
                System.out.println("Message: Order is on the way.");
                break;

            case DELIVERED:
                System.out.println("Order Status: " + status);
                System.out.println("Order is delivered successfully");
                break;

            case CANCELLED:
                System.out.println("Order Status: " + status);
                System.out.println("Order has been cancelled");
                break;

            default:
                System.out.println("Unknown status");
        }
    }
}
