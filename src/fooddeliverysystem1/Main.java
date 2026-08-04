package fooddeliverysystem1;

public class Main {
    public static void main(String[] args) {
          VegOrder vegOrder = new VegOrder(101, "Rohit", "BABA", 2,150);


          DessertOrder dessertOrder = new DessertOrder(201, "Ajay", "RAJ sHREE", 1,100);

            Order [] orders={vegOrder,dessertOrder};

            for(Order order:orders){
                order.displayOrderDetails();
                System.out.println("=================");
                order.prepare();
                System.out.println();
                order.deliver();
                System.out.println();
                order.calculateBill();
                System.out.println("=================");
            }


     }

}
