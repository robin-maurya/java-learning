package day24.concepts;

public class EnumWithSwitch {

    enum OrderStatus {
        PENDING,
        SHIPPED,
        DELIVERED,
        CANCELLED
    }

    public static void main(String[] args){

//        OrderStatus status = OrderStatus.SHIPPED;
        OrderStatus status = OrderStatus.DELIVERED;
//        OrderStatus status = OrderStatus.CANCELLED;

        switch (status) {
            case PENDING:
                System.out.println("Order is waiting for processing");
                break;

            case SHIPPED:
                System.out.println("Order is on the way");
                break;

            case DELIVERED:
                System.out.println("Order is delivered successfully");
                break;

            case CANCELLED:
                System.out.println("Order has been cancelled");
                break;

            default:
                System.out.println("Unknown status");
        }
    }
}
