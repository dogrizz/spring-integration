package p.training.integration.lab04;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import p.training.integration.lab04.order.Coffee;
import p.training.integration.lab04.order.CoffeeType;
import p.training.integration.lab04.order.Order;
import p.training.integration.lab04.order.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws InterruptedException {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml")) {
            Coffee americano = new Coffee(CoffeeType.AMERICANO, true);
            Coffee espresso = new Coffee(CoffeeType.ESPRESSO, false);

            List<OrderItem> orderItems = new ArrayList<>();
            orderItems.add(new OrderItem(americano));
            orderItems.add(new OrderItem(espresso));

            CafeSpring cafeSpring = applicationContext.getBean("cafe", CafeSpring.class);
            cafeSpring.placeOrder(new Order(orderItems));

            Thread.sleep(20000);
        }
    }

}
