package pl.training.integration.lab04;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.training.integration.lab04.order.Order;
import pl.training.integration.lab04.order.Coffee;
import pl.training.integration.lab04.order.CoffeeType;
import pl.training.integration.lab04.order.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@EnableAutoConfiguration
public class App {

    private Random random = new Random();

    @RequestMapping("api/orders")
    public Order getOrder() {
        List<OrderItem> orderItems = new ArrayList<>();
        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            orderItems.add(new OrderItem(new Coffee(CoffeeType.AMERICANO, true)));
        }
        return new Order(orderItems);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

}
