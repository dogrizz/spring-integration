package p.training.integration.lab04;

import p.training.integration.lab04.order.Coffee;

import java.util.List;

public class Waiter {

    public List<Coffee> serve(List<Coffee> coffees) {
        System.out.println("Serving... " + coffees);
        return coffees;
    }

}
