package pl.training.integration.lab04;

import pl.training.integration.lab04.order.Coffee;
import pl.training.integration.lab04.order.OrderItem;

import java.util.Random;

public class Barista {

    private Random random = new Random();

    public Coffee prepare(OrderItem orderItem) {
        try {
            Thread.sleep(random.nextInt(5000));
            Coffee coffee = orderItem.getCoffee();
            System.out.println("Coffee " + coffee + " is ready...");
            return coffee;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }


}
